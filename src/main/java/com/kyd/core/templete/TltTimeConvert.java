package com.kyd.core.templete;

import com.kyd.core.annonation.TltTime;

import java.lang.reflect.Field;

import static com.kyd.core.config.TltConfiguration.EMPTY_STR;

/***
 * 时间注解
 */
public class TltTimeConvert {

    public static final String TLT_START = "#{[";
    public static final String TLT_END = "]}";

    /**
     * 时间替换
     * @return
     */
    public static String strReplace(Field field ,String strLine,String methodName) {
        TltTime time = field.getAnnotation(TltTime.class);
        if (time!=null) {
            String timeVal = time.value();
            strLine = strLine.replace( TLT_START + methodName + TLT_END,
                    EMPTY_STR + timeVal);
        }
        return  strLine ;
    }
}
