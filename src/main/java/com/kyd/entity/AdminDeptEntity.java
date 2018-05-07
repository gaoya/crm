package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;

@TltCls(value = "AdminDept" ,table = "sys_admin" ,name = "AdminDept" ,author = "gss",requestMapping = "/adminDept" ,comments = "用户单位模块")
public class AdminDeptEntity {
    @TltFld(value = "编号" ,name = "id",commonts = "编号",column = "id")
    private String id ;
    @TltFld(value = "用户编号" ,name = "userId",commonts = "用户编号",column = "user_id")
    private String userId;
    @TltFld(value = "单位编号" ,name = "deptId",commonts = "单位编号",column = "dept_id")
    private String deptId;
    @TltFld(value = "创建人" ,name = "createUser",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltTime("timestamp(now())")
    @TltFld(value = "创建时间" ,name = "createTime",commonts = "创建时间",column = "create_time")
    private String createTime;
    @TltFld(value = "备注" ,name = "remark",commonts = "备注",column = "remark")
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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