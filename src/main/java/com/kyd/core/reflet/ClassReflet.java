package com.kyd.core.reflet;

import org.apache.commons.lang3.StringUtils;

/***
 * 类的反射
 */
public class ClassReflet {

    /***
     * 将一个类的名称转换成一个对象
     * @return
     */
    public static Object classNameToObject(String className) throws Exception {

        if (StringUtils.isEmpty(className)) {
            throw new Exception("类的名称不存在，请重新输入类名称");
        }

        Class clazz = Class.forName(className);

        return classToObject(clazz);
    }

    public static Object classToObject(Class clazz) throws Exception {
        if (clazz==null) {
            throw new Exception("类不存在！");
        }
        return clazz.newInstance() ;
    }

}
