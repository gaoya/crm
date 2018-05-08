package com.kyd.core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间和日期使用
 */
public class DateTimeUtils {

    private DateTimeUtils() {
    }

    public static final String FULL_DATE = "yyyy-MM-dd HH:mm:ss:SSS" ;
    public static String format(String formatType, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatType);
        return simpleDateFormat.format(date);
    }

    public static String now(String formatType) {
        return format(formatType,new Date());
    }
}
