package com.kyd.core.dto;

import java.util.List;
import java.util.Map;

/**
 * 返回集合数据
 */
public class ResultListViewData extends ResultCommonData {
    //总数据量
    private Long count;
    //总页数
    private Long totalPage;
    //当前页
    private Long current;
    //每页数据量
    private Long size;
    //是否存在前置页面
    private boolean isPrePage = true;
    //是否存在后置页面
    private boolean isNextPage = true;
    //页面数据
    private List<Map<String, Object>> data;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public boolean isPrePage() {
        return isPrePage;
    }

    public void setPrePage(boolean prePage) {
        isPrePage = prePage;
    }

    public boolean isNextPage() {
        return isNextPage;
    }

    public void setNextPage(boolean nextPage) {
        isNextPage = nextPage;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultListViewData{" +
                "count=" + count +
                ", totalPage=" + totalPage +
                ", current=" + current +
                ", size=" + size +
                ", isPrePage=" + isPrePage +
                ", isNextPage=" + isNextPage +
                ", data=" + data +
                '}';
    }

    public ResultListViewData() {
    }


}
