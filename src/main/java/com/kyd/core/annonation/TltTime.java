package com.kyd.core.annonation;

import java.lang.annotation.*;

/**
 * 时间注解
 */
@Target({ElementType.FIELD})
@Documented//说明该注解将被包含在javadoc中
@Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
public @interface TltTime {
    String value()  default "timestamp(now())";     //默认值
    String name() default "";
}
