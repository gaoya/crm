package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;

import java.util.Date;
@TltCls(name = "Menu",requestMapping = "menu",author = "gss",comments = "菜单表",table = "sys_menu")
public class MenuEntity {
    @TltFld(name = "id",value = "id",column = "id",commonts = "id")
    private String id;
    @TltFld(name = "menuId",value = "菜单编号",column = "menu_id",commonts = "菜单编号")
    private Long menuId;
    @TltFld(name = "menuName",value = "菜单名称",column = "menu_name",commonts = "菜单名称")
    private String menuName;
    @TltFld(name = "menuUrl",value = "菜单地址",column = "menu_url",commonts = "菜单地址")
    private String menuUrl;
    @TltFld(name = "useFlag",value = "是否使用",commonts = "是否使用",column = "use_flag")
    private String useFlag;
    @TltFld(name = "delFlag",value = "是否删除",commonts = "是否删除",column = "del_flag")
    private Integer delFlag;
    @TltFld(name = "parentId",value = "父类编号",commonts = "父类编号",column = "parent_id")
    private String parentId;
    @TltFld(name = "isParent",value = "是否是父类",commonts = "是否父类",column = "is_parent")
    private Integer isParent;
    @TltFld(name = "createUser",value = "创建人",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltFld(name = "remark",value = "备注",commonts = "备注",column = "remark")
    private String remark;
    @TltTime
    @TltFld(name = "createTime",value = "创建时间",commonts = "创建时间",column = "create_time")
    private Date createTime;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }



    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}