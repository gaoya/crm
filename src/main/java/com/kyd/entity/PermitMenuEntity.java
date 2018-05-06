package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;
import lombok.Data;
import java.util.Date;

@TltCls(table = "sys_permit_menu",requestMapping = "/permitMenu",comments = "权限菜单表")
public class PermitMenuEntity {
    @TltFld(name = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "permitId",column = "permit_id",commonts = "权限id")
    private Long permitId;
    @TltFld(name = "menuId",column = "menu_id",commonts = "菜单id")
    private Long menuId;
    @TltTime
    @TltFld(name = "createTime",column = "create_time",commonts = "创建时间")
    private Date createTime;
    @TltFld(name = "createUser",column = "create_user",commonts = "创建人")
    private String createUser;
    @TltFld(name = "remark",column = "remark",commonts = "remark")
    private String remark;
 }