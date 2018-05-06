package   com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;

@TltCls(name = "ShowParam",requestMapping = "showParam",author = "gss",comments = "系统用户表",table = "sys_show_param")
public   class   ShowParamEntity   {

    @TltFld(name="id" ,value="id",commonts = "id", column = "id", author = "gss")
    private String id ;//
    @TltFld(name="menuId" ,value="菜单Id",commonts = "菜单Id", column = "menu_id", author = "gss")
    private String menuId ;//
    @TltFld(name="menuCode" ,value="菜单CODE",commonts = "菜单CODE", column = "menu_code", author = "gss")
    private String menuCode ;//
    @TltFld(name="pId" ,value="类型Id",commonts = "类型Id", column = "p_id", author = "gss")
    private String pId ;//
    @TltFld(name="pName" ,value="类型名称",commonts = "类型名称", column = "p_name", author = "gss")
    private String pName ;//
    @TltFld(name="pPlaceholder" ,value="提示",commonts = "提示", column = "p_placeholder", author = "gss")
    private String pPlaceholder ;//
    @TltFld(name="pLabel" ,value="标签",commonts = "标签", column = "p_label", author = "gss")
    private String pLabel ;//
    @TltFld(name="pList" ,value="参数列表",commonts ="列表参数", column = "p_list", author = "gss")
    private String pList ;//
    @TltFld(name="pListdata" ,value="列表参数",commonts = "列表参数", column = "p_listdata", author = "gss")
    private String pListdata ;//
    @TltFld(name="pAdd" ,value="新增参数",commonts = "新增参数", column = "p_add", author = "gss")
    private String pAdd ;//
    @TltFld(name="pAdddata" ,value="新增数据",commonts = "新增数据", column = "p_adddata", author = "gss")
    private String pAdddata;
    @TltFld(name="pUpdate" ,value="修改参数",commonts = "修改参数", column = "p_update", author = "gss")
    private String pUpdate ;//
    @TltFld(name="pUpdatedata" ,value="修改数据",commonts = "修改数据", column = "p_updatedata", author = "gss")
    private String pUpdatedata ;
    @TltFld(name="pAddUpdateLabel" ,value="Add和Update的标签",commonts = "Add和Update的标签", column = "p_add_update_label", author = "gss")
    private String pAddUpdateLabel;
    @TltFld(name="pAddUpdateMsg" ,value="Add和update的提示信息",commonts = "Add和update的提示信息", column = "p_add_update_msg", author = "gss")
    private String pAddUpdateMsg;
    @TltFld(name="pDel" ,value="删除参数",commonts = "删除参数", column = "p_del", author = "gss")
    private String pDel ;//
    @TltFld(name="pDetail" ,value="显示参数",commonts = "显示参数", column = "p_detail", author = "gss")
    private String pDetail;
    @TltFld(name="pDefaultvalue" ,value="默认值",commonts = "默认值", column = "p_defaultvalue", author = "gss")
    private String pDefaultvalue ;//
    @TltFld(name="pUser" ,value="用户",commonts = "用户", column = "p_user", author = "gss")
    private String pUser ;//
    @TltTime
    @TltFld(name="pTime" ,value="创建时间",commonts = "创建时间", column = "p_time", author = "gss")
    private String pTime ;//
    @TltFld(name="pSort" ,value="排序",commonts = "排序", column = "p_sort", author = "gss")
    private String pSort ;//
    @TltFld(name="pRemark" ,value="备注",commonts = "备注", column = "p_remark", author = "gss")
    private String pRemark ;//
    @TltFld(name="pSearch" ,value="查询",commonts = "查询", column = "p_search", author = "gss")
    private String pSearch ;//
    @TltFld(name="pSearchdata" ,value="查询",commonts = "查询", column = "p_searchdata", author = "gss")
    private String pSearchdata ;
    public ShowParamEntity() {
    }

    public String getpAddUpdateMsg() {
        return pAddUpdateMsg;
    }

    public void setpAddUpdateMsg(String pAddUpdateMsg) {
        this.pAddUpdateMsg = pAddUpdateMsg;
    }

    public String getpSearchdata() {
        return pSearchdata;
    }

    public void setpSearchdata(String pSearchdata) {
        this.pSearchdata = pSearchdata;
    }

    public String getpAddUpdateLabel() {
        return pAddUpdateLabel;
    }

    public void setpAddUpdateLabel(String pAddUpdateLabel) {
        this.pAddUpdateLabel = pAddUpdateLabel;
    }

    public String getpDetail() {
        return pDetail;
    }

    public void setpDetail(String pDetail) {
        this.pDetail = pDetail;
    }

    public String getpUpdatedata() {
        return pUpdatedata;
    }

    public void setpUpdatedata(String pUpdatedata) {
        this.pUpdatedata = pUpdatedata;
    }

    @Override
    public String toString() {
        return "ShowParamEntity{" +
                "id='" + id + '\'' +
                ", menuId='" + menuId + '\'' +
                ", menuCode='" + menuCode + '\'' +
                ", pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", pPlaceholder='" + pPlaceholder + '\'' +
                ", pLabel='" + pLabel + '\'' +
                ", pList='" + pList + '\'' +
                ", pListdata='" + pListdata + '\'' +
                ", pAdd='" + pAdd + '\'' +
                ", pAdddata='" + pAdddata + '\'' +
                ", pUpdate='" + pUpdate + '\'' +
                ", pDel='" + pDel + '\'' +
                ", pDefaultvalue='" + pDefaultvalue + '\'' +
                ", pUser='" + pUser + '\'' +
                ", pTime='" + pTime + '\'' +
                ", pSort='" + pSort + '\'' +
                ", pRemark='" + pRemark + '\'' +
                ", pSearch='" + pSearch + '\'' +
                '}';
    }

    public ShowParamEntity(String id, String menuId, String menuCode, String pId, String pName, String pPlaceholder, String pLabel, String pList, String pListdata, String pAdd, String pAdddata, String pUpdate, String pDel, String pDefaultvalue, String pUser, String pTime, String pSort, String pRemark, String pSearch) {
        this.id = id;
        this.menuId = menuId;
        this.menuCode = menuCode;
        this.pId = pId;
        this.pName = pName;
        this.pPlaceholder = pPlaceholder;
        this.pLabel = pLabel;
        this.pList = pList;
        this.pListdata = pListdata;
        this.pAdd = pAdd;
        this.pAdddata = pAdddata;
        this.pUpdate = pUpdate;
        this.pDel = pDel;
        this.pDefaultvalue = pDefaultvalue;
        this.pUser = pUser;
        this.pTime = pTime;
        this.pSort = pSort;
        this.pRemark = pRemark;
        this.pSearch = pSearch;
    }

    public String getpAdddata() {

        return pAdddata;
    }

    public void setpAdddata(String pAdddata) {
        this.pAdddata = pAdddata;
    }

    public ShowParamEntity(String id, String menuId, String menuCode, String pId, String pName, String pPlaceholder, String pLabel, String pList, String pListdata, String pAdd, String pUpdate, String pDel, String pDefaultvalue, String pUser, String pTime, String pSort, String pRemark, String pSearch) {

        this.id = id;
        this.menuId = menuId;
        this.menuCode = menuCode;
        this.pId = pId;
        this.pName = pName;
        this.pPlaceholder = pPlaceholder;
        this.pLabel = pLabel;
        this.pList = pList;
        this.pListdata = pListdata;
        this.pAdd = pAdd;
        this.pUpdate = pUpdate;
        this.pDel = pDel;
        this.pDefaultvalue = pDefaultvalue;
        this.pUser = pUser;
        this.pTime = pTime;
        this.pSort = pSort;
        this.pRemark = pRemark;
        this.pSearch = pSearch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPlaceholder() {
        return pPlaceholder;
    }

    public void setpPlaceholder(String pPlaceholder) {
        this.pPlaceholder = pPlaceholder;
    }

    public String getpLabel() {
        return pLabel;
    }

    public void setpLabel(String pLabel) {
        this.pLabel = pLabel;
    }

    public String getpList() {
        return pList;
    }

    public void setpList(String pList) {
        this.pList = pList;
    }

    public String getpListdata() {
        return pListdata;
    }

    public void setpListdata(String pListdata) {
        this.pListdata = pListdata;
    }

    public String getpAdd() {
        return pAdd;
    }

    public void setpAdd(String pAdd) {
        this.pAdd = pAdd;
    }

    public String getpUpdate() {
        return pUpdate;
    }

    public void setpUpdate(String pUpdate) {
        this.pUpdate = pUpdate;
    }

    public String getpDel() {
        return pDel;
    }

    public void setpDel(String pDel) {
        this.pDel = pDel;
    }

    public String getpDefaultvalue() {
        return pDefaultvalue;
    }

    public void setpDefaultvalue(String pDefaultvalue) {
        this.pDefaultvalue = pDefaultvalue;
    }

    public String getpUser() {
        return pUser;
    }

    public void setpUser(String pUser) {
        this.pUser = pUser;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    public String getpSort() {
        return pSort;
    }

    public void setpSort(String pSort) {
        this.pSort = pSort;
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark;
    }

    public String getpSearch() {
        return pSearch;
    }

    public void setpSearch(String pSearch) {
        this.pSearch = pSearch;
    }
}
