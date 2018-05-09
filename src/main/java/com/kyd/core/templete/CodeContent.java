package com.kyd.core.templete;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.config.TltFile;
import com.kyd.core.exception.TLtFileNotFoundException;
import com.kyd.core.utils.AnnotationUtils;
import com.kyd.core.utils.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import static com.kyd.core.config.TltConfiguration.*;

/**
 * 生成模板文件
 * 说明：
 * 在使用过程中，该类可以生成单个模板文件。在使用过程中，使用TltFile 配置模板文件的类型
 * 存放地址和模板类型。
 */
public class CodeContent {

    private Logger logger = Logger.getLogger(CodeContent.class.getName());
    //系统中处理的数据类型
    private TltFile tltFile;
    //需要替换的数据参数
    private Map<String, Object> replaceParams = null;
    private Class entityClass;

    /**
     * 提供保存文件的相关配置
     * 统计需要处理的entity
     *
     * @param tltFile     配置属性
     * @param entityClass 需要生成文件的实体类对象
     */
    protected CodeContent(TltFile tltFile, Class entityClass) {
        this.tltFile = tltFile;
        this.entityClass = entityClass;
    }
    /**
     * 初始化系统需要使用的参数。
     */
    private void init(Class clazz, String packageName) throws Exception {

        Annotation annotation = AnnotationUtils.annotation(clazz, TltCls.class);
        if (annotation != null) {
            TltCls tltCls = (TltCls) annotation;
            initParams(tltCls, packageName);
        }
    }

    /**
     * 初始化replaceParams 数据
     */
    private void initParams(TltCls tltCls, String packageName) throws Exception {

        if (replaceParams == null) {
            replaceParams = new HashMap<>();
        }

        if (tltCls == null) {
            throw new Exception("模板配置文件的类注解不存在！");
        }

        if (StringUtils.isEmpty(packageName)) {
            packageName = "";
        }

        replaceParams.put(PACKAGE_NAME, packageName);
        String simpleName = TltMethod.removeEntityToSimpleName(entityClass);
        replaceParams.put(CLASS_NAME, simpleName);
        replaceParams.put(CLASS_NAME_UNCAPITALIZE, StringUtils.uncapitalize(simpleName));
        replaceParams.put(TABLE_NAME, tltCls.table());
        replaceParams.put(CLASS_NAME_COMMENT, tltCls.comments());
        replaceParams.put(CLASS_REQUEST_MAPPING, tltCls.requestMapping());
    }

    /**
     * 创建模板文件
     *
     * @throws Exception
     */
    protected void createFile(String packageName) throws Exception {
        init(entityClass, packageName);

        if (replaceParams!=null) {
            String document = readLines();
            write(document);
        }
    }

    /***
     * 读取模板文件的内容
     * @return 返回处理后的内容
     * @throws Exception
     */
    private String readLines() throws Exception {
        String line = null ;

        StringBuilder builder = new StringBuilder("");

        if (tltFile == null || StringUtils.isEmpty(tltFile.getTemplete())) {
            throw new TLtFileNotFoundException();
        }

        InputStream inputStream = TltMethod.getStreamByPath(tltFile.getTemplete());
        if (inputStream == null) {
            throw new Exception("数据流不存在！！");
        }

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));

        while ((line = fileReader.readLine()) != null) {
            Set<Map.Entry<String, Object>> params =  replaceParams.entrySet();
            Iterator iterator = params.iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Object> param = (Map.Entry<String, Object>) iterator.next();
                String key = param.getKey();
                String value = (String) param.getValue();
                if (line.contains(key) || line.contains(ENTITY_PARAMS)) {
                    if (line.contains(TEMPLETE_FOR_INSTRUCT)) {
                        Annotation annotation = entityClass.getAnnotation(TltCls.class);
                        if (annotation != null) {
                            line = foreachFields(line);
                        }
                    } else {
                        line = line.replace(key, value);
                    }
                }
            }

            builder.append(line).append(NEW_LINE_CHARATER);
        }

        if (inputStream != null) {
            inputStream.close();
        }
        return builder.toString();
    }

    /**
     * 保存数据
     */
    private void write(String word) {
        try {
            FileUtils.write(tltFile.getDesc(), word);
        } catch (Exception e) {
            logger.info("写入文件失败！");
        }
    }

    /**
     * for 实体循环
     */
    private String foreachFields(String line) throws Exception {
        StringBuilder sb = new StringBuilder(EMPTY_STR);
        String resLine;

        Field[] fields = entityClass.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            resLine = line;
            TltFld tltFld = fields[i].getAnnotation(TltFld.class);

            Method[] declaredMethods = tltFld.getClass().getDeclaredMethods();

            resLine = lineReplaceStr(resLine, declaredMethods, tltFld,fields[i]);

            resLine = resLine.replace(COMMA, (i < fields.length - 1) ? "," : EMPTY_STR);

            if (resLine.contains(SPLIT_FLAG)) {
                resLine = resLine.replace(END_TEMPLETE_FOR_INSTRUCT, EMPTY_STR).split(SPLIT_FLAG)[1];
            }

            sb.append(resLine).append(NEW_LINE_CHARATER);
        }

        return sb.toString().endsWith(",") ? sb.toString().substring(0, sb.length() - 1) : sb.toString();
    }

    /**
     * 替换字符
     *
     * @return
     */
    private String lineReplaceStr(String resLine, Method[] declaredMethods,
                                  TltFld tltFld,Field field) throws InvocationTargetException, IllegalAccessException {
        String templeteFileType = tltFile.getType();
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            String methodName = method.getName() ;
            if ((!methodName.equals(ANNOTATION_IGNORE_METHOD_EQUALS))
                    && (!methodName.equals(ANNOTATION_IGNORE_METHOD_TOSTRNG))
                    && (!methodName.equals(ANNOTATION_IGNORE_METHOD_HASHCODE))
                    && (!methodName.equals(ANNOTATION_IGNORE_METHOD_ANNOTATIONTYPE))) {

                if (templeteFileType.equals(TltFileType.DEFAULT_DAO_XML_TEMPLETE)
                        && methodName.equals("name")) {
                    resLine = TltTimeConvert.strReplace(field, resLine, methodName);
                }
                resLine = BaseConvert.strConvert(resLine, methodName ,
                        EMPTY_STR + method.invoke(tltFld));

            }
        }
        return resLine;

    }
}
