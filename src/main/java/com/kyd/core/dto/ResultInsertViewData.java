package com.kyd.core.dto;

/**
 * 插入数据返回页面
 */
public class ResultInsertViewData extends ResultCommonData {
    //返回插入数据条数
    private Long insertCountData;


    public Long getInsertCountData() {
        return insertCountData;
    }

    public void setInsertCountData(Long insertCountData) {
        this.insertCountData = insertCountData;
    }
}
