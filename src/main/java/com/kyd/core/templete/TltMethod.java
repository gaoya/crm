package com.kyd.core.templete;

import com.kyd.core.exception.ObjectNotFoundException;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.util.logging.Logger;

import static com.kyd.core.config.TltConfiguration.EMPTY_STR;
import static com.kyd.core.config.TltConfiguration.ENTITY_POSTFIX;

public class TltMethod {
    static Logger logger = Logger.getLogger(TltMethod.class.getName());
    /**
     * 去除Entity
     * @return
     */
    public static String removeEntityToSimpleName(Class clazz) throws Exception {
        if (clazz==null){
            logger.info(clazz.getName()+"对象不存在！");
            throw new ObjectNotFoundException();
        }
        String simpleName = clazz.getSimpleName().replace(ENTITY_POSTFIX, EMPTY_STR) ;
        return simpleName ;
    }

    /**
     * 读取资源流
     * @return
     */
    public static InputStream getStreamByPath(String path) throws Exception {
        if (StringUtils.isEmpty(path)) {
            logger.info("文件路径不存在！");
            throw new Exception("文件不存在");
        }else {
            InputStream inputStream = TltMethod.class.getResourceAsStream(path);
            if (inputStream==null){
                logger.info("文件流不存在");
                return null ;
            }else {
                return inputStream;
            }
        }
    }
}
