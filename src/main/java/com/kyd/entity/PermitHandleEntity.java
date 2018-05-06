package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;
import lombok.Data;
import java.util.Date;
@TltCls(name = "PermitHandle",requestMapping = "permitHandle",author = "gss",comments = "权限操作表",table = "sys_permit_handle")
public class PermitHandleEntity{
    @TltFld(name = "id",value = "id",commonts = "id",column = "id")
    private Long id;
    @TltFld(name = "permitId",value = "权限Id",commonts = "权限id",column = "permit_id")
    private Long permitId;
    @TltFld(name = "handleId",value = "操作Id",commonts = "操作id",column = "handle_id")
    private Long handleId;
    @TltTime
    @TltFld(name = "createTime",value = "创建时间",commonts = "创建时间",column = "create_time")
    private Date createTime;
    @TltFld(name = "createUser",value = "创建人",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltFld(name = "remark",value = "备注",commonts = "备注",column = "remark")
    private String remark;

 }