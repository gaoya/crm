package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;

import java.util.Date;

@TltCls(name = "Log",requestMapping = "log",author = "gss",comments = "日志表",table = "sys_log")
public class LogEntity {
    @TltFld(name = "id",value = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "ip",value = "ip",column = "ip",commonts = "ip")
    private String ip;
    @TltFld(name = "menuId",value = "菜单编号",column = "menu_id",commonts = "菜单编号")
    private String menuId;
    @TltFld(name = "menuName",value = "菜单名称",column = "menu_name",commonts = "菜单名称")
    private String menuName;
    @TltFld(name = "operId",value = "操作人编号",column = "oper_id",commonts = "操作人编号")
    private String operId;
    @TltFld(name = "operName",value = "操作人姓名",column = "oper_name",commonts = "操作人姓名")
    private String operName;
    @TltTime
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
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