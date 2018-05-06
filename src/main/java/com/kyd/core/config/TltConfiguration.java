package com.kyd.core.config;

/***
 * 生成代码模板的常量配置
 */
public class TltConfiguration {
    // annotation 忽略的方法
    public final static String ANNOTATION_IGNORE_METHOD_EQUALS="equals";
    public final static String ANNOTATION_IGNORE_METHOD_HASHCODE="hashCode";
    public final static String ANNOTATION_IGNORE_METHOD_ANNOTATIONTYPE="annotationType";
    public final static String ANNOTATION_IGNORE_METHOD_TOSTRNG="toString";
    // for 循环开始的语句
    public static final String TEMPLETE_FOR_INSTRUCT = "[for]";
    // for 循环结束的语句
    public static final String END_TEMPLETE_FOR_INSTRUCT = "[/for]";
    // 实体类对象后缀 名称
    public final static String ENTITY_POSTFIX="Entity" ;
    //拆分的标志
    public final static String SPLIT_FLAG="###";
    //空字符
    public static final String EMPTY_STR="";
    public static final String COMMA ="[comma]";
    public static final String ENTITY_PARAMS ="[params]";

    ///////////////////////////////////////////////////////////////////////////
    // Class static Fields
    ///////////////////////////////////////////////////////////////////////////
    public static final String PACKAGE_NAME="[package]";
    public static final String CLASS_NAME="[class]";
    public static final String CLASS_NAME_UNCAPITALIZE="[classUnCap]";
    public static final String TABLE_NAME="[table]";
    public static final String CLASS_NAME_COMMENT="[classComment]";
    public static final String CLASS_REQUEST_MAPPING="[classUseMapping]";
    public static final String NEW_LINE_CHARATER="\n";  //换行
}
