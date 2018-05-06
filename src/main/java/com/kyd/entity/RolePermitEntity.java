package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;
import lombok.Data;

import java.util.Date;

@TltCls(table = "sys_role_permit",requestMapping = "/rolePermit",comments = "角色权限表")
public class RolePermitEntity {
    @TltFld(name = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "roleId",column = "role_id",commonts = "角色编号")
    private String roleId;
    @TltFld(name = "permitId",column = "permit_id",commonts = "权限编号")
    private String permitId;
    @TltFld(name = "createUser",column = "create_user",commonts = "创建人")
    private String createUser;
    @TltTime()
    @TltFld(name = "createTime",column = "create_time",commonts = "创建时间")
    private Date createTime;
    @TltFld(name = "remark",column = "remark",commonts = "备注")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermitId() {
        return permitId;
    }

    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}