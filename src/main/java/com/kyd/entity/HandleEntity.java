package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import lombok.Data;

import java.util.Date;

@TltCls(name = "Handle",requestMapping = "handle",author = "gss",comments = "系统操作表",table = "sys_handle")
public class HandleEntity {
    @TltFld(name = "id",value = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "handleId",value = "操作id",column = "handle_id",commonts = "操作id")
    private Long handleId;
    @TltFld(name = "handleName",value = "操作名称",column = "handle_name",commonts = "操作名称")
    private String handleName;
    @TltFld(name = "useFlag",value = "是否使用",commonts = "是否使用",column = "use_flag")
    private Integer useFlag;
    @TltFld(name = "delFlag",value = "是否删除",commonts = "是否删除",column = "del_flag")
    private Integer delFlag;
    @TltFld(name = "createTime",value = "创建时间",commonts = "创建时间",column = "create_time")
    private Date createTime;
    @TltFld(name = "createUser",value = "创建人",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltFld(name = "remark",value = "备注",commonts = "备注",column = "remark")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHandleId() {
        return handleId;
    }

    public void setHandleId(Long handleId) {
        this.handleId = handleId;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}