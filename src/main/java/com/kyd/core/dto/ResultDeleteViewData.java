package com.kyd.core.dto;


/**
 * 删除数据操作
 */
public class ResultDeleteViewData extends ResultCommonData {
    private Long deleteCount;

    public Long getDeleteCount() {
        return deleteCount;
    }

    public void setDeleteCount(Long deleteCount) {
        this.deleteCount = deleteCount;
    }
}
