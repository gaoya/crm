package com.kyd.core.templete;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.config.TltFile;
import com.kyd.core.exception.AnnotationNotFoundException;
import com.kyd.core.exception.ClazzNotFoundException;
import com.kyd.core.utils.AnnotationUtils;
import com.kyd.core.utils.FileUtils;
import com.kyd.core.utils.ProjectUtils;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * 批量生成代码数据
 */
public class MoreFileContents {
    public static final String SEPARATOR= File.separator;

    /***
     * 批量生成文件
     *  在该方法中，系统会循环查找Entity中存在@TltFCls注解的类，查到了，就生成文件。
     * @param parentPackage  包名称（上级包名称）
     * @param templeteType 生成文件的类型
     */
    protected void batch(String parentPackage, String templeteType) throws Exception {
        String suffixPackage = suffixPackage(parentPackage);
        List<File> entityFileLists = FileUtils.getFilesByPath(suffixPackage+ "entity"+SEPARATOR , true, new ArrayList<>());

        for (File entityFile : entityFileLists) {
            Class entityClass = entityClassByFile(entityFile);
            createClassFile(entityClass,templeteType,parentPackage);
            System.out.println(entityClass.getSimpleName());

        }
    }

    /**
     * 生成一个文件
     */
    protected void createClassFile(Class entityClass ,String templeteType ,String parentPackage) throws Exception {
        CodeContent tlt = null ;
        TltFile tltFile ;
        tltFile = setTltFile(entityClass,templeteType);
        tlt = new CodeContent(tltFile, entityClass);
        tlt.createFile(parentPackage);

    }

    /***
     * 得到entity的类
     * @return
     */
    private static Class entityClassByFile(File file) throws ClassNotFoundException {
        String entityName = file.getPath().replace(ProjectUtils.srcMainPathPath(),"");

        String simpleEntityName = entityName.replace("java","").replace(".","").replace(SEPARATOR,".");
        System.out.println(simpleEntityName);
        Class clazz = Class.forName(simpleEntityName);
        return clazz ;
    }


    private static String suffixPackage(String parentPackage){
        String projectPath = ProjectUtils.srcMainPathPath();
        String suffixPackage = projectPath + parentPackage.replace(".", SEPARATOR) + SEPARATOR;
        return suffixPackage;
    }

    /**
     * 用户使用路径
     * @return
     */
    private static String userDir() {
        return System.getProperty("user.dir");
    }

    private static TltFile setTltFile(Class entityClass,String templeteType) throws ClazzNotFoundException, AnnotationNotFoundException, ClassNotFoundException {
        Annotation annotation = AnnotationUtils.annotation(entityClass,TltCls.class);
        TltFile tltFile = new TltFile();
        String removeEntityName=entityClass.getSimpleName().replace("Entity","");
        String createTltName="";
        if (annotation != null) {

            switch (templeteType) {
                case TltFileType.DEFAULT_BIZ_TEMPLETE: {
                    createTltName = "biz" + SEPARATOR + removeEntityName + "Biz" + "." + "java";
                    break;
                }
                case TltFileType.DEFAULT_SERVICE_TEMPLETE: {
                    createTltName = "service" + SEPARATOR + removeEntityName + "Service" + "." + "java";
                    break;
                }
                case TltFileType.DEFAULT_SERVICE_IMPL_TEMPLETE: {
                    createTltName = "service" + SEPARATOR + "impl" + SEPARATOR + removeEntityName + "ServiceImpl" + "." + "java";
                    break;
                }
                case TltFileType.DEFAULT_DAO_TEMPLETE: {
                    createTltName = "dao" + SEPARATOR + removeEntityName + "Mapper" + "." + "java";
                    break;
                }
                case TltFileType.DEFAULT_DAO_XML_TEMPLETE: {
                    createTltName = "dao" + SEPARATOR + "impl" + SEPARATOR + removeEntityName + "Mapper" + "." + "xml";
                    break;
                }
            }
        }

        tltFile.setDesc(ProjectUtils.srcMainPathPath()+(entityClass.getPackage().getName().replace("entity","").replace(".",SEPARATOR)+  createTltName));
        tltFile.setTemplete(templeteType);
        tltFile.setType(templeteType);
        return tltFile ;

    }

}
