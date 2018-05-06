package com.kyd.core.annonation;

import java.lang.annotation.*;

/***
 * xml 配置
 */
@Target({ElementType.TYPE})
@Documented//说明该注解将被包含在javadoc中
@Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
public @interface TltColumn {

    String column() default  "";
    String value() default "";
    String vDefault() default "";
}
