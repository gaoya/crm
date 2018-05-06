package com.kyd.core.dto;

/**
 * 更新数据
 */
public class ResultUpdateViewDate extends ResultCommonData {
    //更新数据
    private Long updateCountData;

    public Long getUpdateCountData() {
        return updateCountData;
    }

    public void setUpdateCountData(Long updateCountData) {
        this.updateCountData = updateCountData;
    }
}
