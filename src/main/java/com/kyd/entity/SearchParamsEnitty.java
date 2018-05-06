package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;

@TltCls(name ="SearchParams",requestMapping = "search",author = "gss",comments = "查询参数设置",table = "sys_Search_Params")
public class SearchParamsEnitty {

    @TltFld(name="id",value="id",column = "id",commonts = "编号")
    private String id ;
    @TltFld(name="paramsId",value="参数Id",column = "params_id",commonts = "参数id")
    private String paramsId;
    @TltFld(name="paramsName",value="名称",column = "params_name",commonts = "名称")
    private String paramsName	;//(20)	NO
    @TltFld(name="paramsLabel",value="便签",column = "params_label",commonts = "标签")
    private String paramsLabel	;//(50)	YES
    @TltFld(name="paramsPlaceholder",value="提示",column = "params_placeholder",commonts = "提示")
    private String paramsPlaceholder	;//(50)	YES
    @TltFld(name="paramsType",value="类型",column = "params_type",commonts = "类型")
    private String paramsType	;//(50)	YES
    @TltFld(name="menuId",value="菜单编号",column = "menu_Id",commonts = "菜单编号")
    private String menuId	;//(50)	YES
    @TltFld(name="menuCode",value="菜单编码",column = "menu_code",commonts = "菜单编码")
    private String menuCode	;//(50)	YES
    @TltFld(name="useFlag",value="是否使用",column = "use_flag",commonts = "是否使用")
    private String useFlag	;//(1)	YES
    @TltFld(name="delFlag",value="是否删除",column = "del_flag",commonts = "是否删除")
    private String delFlag	;//(1)	YES
    @TltFld(name="sort",value="排序",column = "sort",commonts = "排序")
    private String sort	;//(50)	YES
    @TltFld(name="createUser",value="创建人",column = "create_user",commonts = "创建人")
    private String createUser	;//(50)	YES
    @TltTime
    @TltFld(name="createTime",value="创建时间",column = "create_time",commonts = "创建时间")
    private String createTime ;
    @TltTime
    @TltFld(name="updateTime",value="修改时间",column = "update_time",commonts = "修改时间")
    private String updateTime	;
    @TltFld(name="remark",value="备注",column = "remark",commonts = "remark")
    private String remark;

    @Override
    public String toString() {
        return "SearchParamsEnitty{" +
                "id='" + id + '\'' +
                ", paramsId='" + paramsId + '\'' +
                ", paramsName='" + paramsName + '\'' +
                ", paramsLabel='" + paramsLabel + '\'' +
                ", paramsPlaceholder='" + paramsPlaceholder + '\'' +
                ", paramsType='" + paramsType + '\'' +
                ", menuId='" + menuId + '\'' +
                ", menuCode='" + menuCode + '\'' +
                ", useFlag='" + useFlag + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", sort='" + sort + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public SearchParamsEnitty(String id, String paramsId, String paramsName, String paramsLabel, String paramsPlaceholder, String paramsType, String menuId, String menuCode, String useFlag, String delFlag, String sort, String createUser, String createTime, String updateTime, String remark) {
        this.id = id;
        this.paramsId = paramsId;
        this.paramsName = paramsName;
        this.paramsLabel = paramsLabel;
        this.paramsPlaceholder = paramsPlaceholder;
        this.paramsType = paramsType;
        this.menuId = menuId;
        this.menuCode = menuCode;
        this.useFlag = useFlag;
        this.delFlag = delFlag;
        this.sort = sort;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    public SearchParamsEnitty() {

    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParamsId() {
        return paramsId;
    }

    public void setParamsId(String paramsId) {
        this.paramsId = paramsId;
    }

    public String getParamsName() {
        return paramsName;
    }

    public void setParamsName(String paramsName) {
        this.paramsName = paramsName;
    }

    public String getParamsLabel() {
        return paramsLabel;
    }

    public void setParamsLabel(String paramsLabel) {
        this.paramsLabel = paramsLabel;
    }

    public String getParamsPlaceholder() {
        return paramsPlaceholder;
    }

    public void setParamsPlaceholder(String paramsPlaceholder) {
        this.paramsPlaceholder = paramsPlaceholder;
    }

    public String getParamsType() {
        return paramsType;
    }

    public void setParamsType(String paramsType) {
        this.paramsType = paramsType;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
