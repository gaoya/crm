package com.kyd.core.dto;


/**
 * 返回类型枚举
 */
public enum ResultEnum {
    RESULT_ADD_SUCCESS("0","添加数据成功"),
    RESULT_ADD_FAIL("1","添加数据失败"),
    RESULT_EDIT_SUCCESS("0","编写数据成功"),
    RESULT_EDIT_FAIL("1","编写数据失败"),
    RESULT_DELETE_SUCCESS("0","删除数据成功"),
    RESULT_DELETE_FAIL("1","删除数据失败"),
    RESULT_FIND_SUCCESS("0","查询成功"),
    RESULT_FIND_FAIL("1","查询失败"),
    RESULT_LIST_SUCCESS("0","获取列表数据成功!"),
    RESULT_LIST_FAIL("1","获取列表数据失败!");



    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String code() {
        return this.code;
    }
    public String msg() {
        return this.msg;
    }

    private String code;
    private String msg;
}
