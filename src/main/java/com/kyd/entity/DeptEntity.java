package com.kyd.entity;

import lombok.Data;

public class DeptEntity {
    private String id="id";

    private String deptNo="单位编号";

    private String deptName="单位名称";

    private String rangeRank="使用范围";

    private String useFlag="是否使用";

    private String createUser="创建人";

    private String createTime="创建时间";

    private String remark="备注";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRangeRank() {
        return rangeRank;
    }

    public void setRangeRank(String rangeRank) {
        this.rangeRank = rangeRank;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}