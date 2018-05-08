package com.kyd.core.reflet;

import org.apache.commons.lang3.StringUtils;

/***
 * 类的反射
 */
public class ClassReflet {
    private ClassReflet() {
    }

    /***
     * 将一个类的名称转换成一个对象
     * @return
     */
    public static Object classNameToObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        if (StringUtils.isEmpty(className)) {
            throw new ClassNotFoundException("类的名称不存在，请重新输入类名称");
        }

        Class clazz = Class.forName(className);

        return classToObject(clazz);
    }

    public static Object classToObject(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (clazz==null) {
            throw new ClassNotFoundException("类不存在！");
        }
        return clazz.newInstance() ;
    }

}
