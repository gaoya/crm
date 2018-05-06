package com.kyd.core.dto;

/**
 * 通用的返回结果属性
 */
public class ResultCommonData {
    //类名称
    private String className;
    //方法名称
    private String methodName;
    //状态码
    private String code;
    //状态值
    private String msg;
    //返回时间
    private String resultTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResultTime() {
        return resultTime;
    }

    public void setResultTime(String resultTime) {
        this.resultTime = resultTime;
    }
}
