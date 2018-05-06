package com.kyd.core.utils;

import java.net.URL;

/**
 * 项目配置信息
 */
public class ProjectUtils {
    private static final String ROOT_PATH = ".";
    public static final String TARGET_CLASSES = "target/classes/";
    public static final String SRC_MAIN_JAVA ="src/main/java/";

    /**
     * 得到项目路径
     * @return
     */
    public static String targerClassPath() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(ROOT_PATH);

        return  url.getPath().replace(TARGET_CLASSES,"")  ;
    }

    /**
     * 得到项目主目录
     * @return
     */
    public static String getRootPath() {
        return System.getProperty("user.dir");
    }

    /**
     * 得到代码存放路径
     * @return
     */
    public static String srcMainPathPath(){
        String  srcJava = targerClassPath()+SRC_MAIN_JAVA;
        return srcJava ;
    }


}
