package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;
import lombok.Data;

import java.util.Date;
@TltCls(name = "Permit",requestMapping = "permit",author = "gss",comments = "权限表",table = "sys_permit")
public class PermitEntity {
    @TltFld(name = "id",value = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "permitNo",value = "权限编号",column = "permit_no",commonts = "权限编号")
    private String permitNo;
    @TltFld(name = "permitName",value = "权限名称",commonts = "权限名称",column = "permit_name")
    private String permitName;
    @TltFld(name = "permit_alias",value = "权限别称",column = "permit_alias",commonts = "权限别称")
    private String permitAlias;
    @TltFld(name = "permitCode",value = "权限码",commonts = "权限码",column = "permit_code")
    private String permitCode;
    @TltFld(name = "permitIntroduction",value = "权限介绍",commonts = "权限介绍" ,column = "permit_introduction")
    private String permitIntroduction;
    @TltFld(name = "userFlag",value = "是否使用",column = "use_flag",commonts = "是否使用")
    private Integer useFlag;
    @TltFld(name = "delFlag",value = "是否删除",commonts = "是否删除",column = "del_flag")
    private Integer delFlag;
    @TltFld(name = "createUser",value = "创建人",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltTime
    @TltFld(name = "createTime",value = "创建时间",commonts = "创建时间",column = "create_time")
    private String createTime;
    @TltFld(name = "remark",value = "备注",commonts = "备注",column = "remark")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermitNo() {
        return permitNo;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }

    public String getPermitName() {
        return permitName;
    }

    public void setPermitName(String permitName) {
        this.permitName = permitName;
    }

    public String getPermitAlias() {
        return permitAlias;
    }

    public void setPermitAlias(String permitAlias) {
        this.permitAlias = permitAlias;
    }

    public String getPermitCode() {
        return permitCode;
    }

    public void setPermitCode(String permitCode) {
        this.permitCode = permitCode;
    }

    public String getPermitIntroduction() {
        return permitIntroduction;
    }

    public void setPermitIntroduction(String permitIntroduction) {
        this.permitIntroduction = permitIntroduction;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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