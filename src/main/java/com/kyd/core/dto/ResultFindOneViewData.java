package com.kyd.core.dto;

import java.util.Map;

/**
 * 数据操作类
 */
public class ResultFindOneViewData extends ResultCommonData {

    //返回数据
    private Map<String, Object> data;

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
