package com.kyd.core.templete;

/**
 * 基本类型转换
 */
public class BaseConvert {
    public static final String STR_START = "[";
    public static final String STR_END ="]";

    public static String strConvert(String strline, String msg, String replace) {
        return strline.replace(STR_START + msg + STR_END, replace);
    }
}
