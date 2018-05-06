package com.kyd.core.dto;

/**
 * 统计数据量
 */
public class ResultTotalViewData extends ResultCommonData {

    //总数据量
    private Long totalSize;
    //总页数
    private Long totalPage;
    //当前页
    private Long current;
    //每页数据量
    private Long size;

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
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
}
