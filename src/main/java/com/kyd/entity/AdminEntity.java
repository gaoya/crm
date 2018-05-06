package com.kyd.entity;

import com.kyd.core.annonation.TltCls;
import com.kyd.core.annonation.TltFld;
import com.kyd.core.annonation.TltTime;

@TltCls(name = "Admin",requestMapping = "admin",author = "gss",comments = "系统用户表",table = "sys_admin")
public class AdminEntity  {
    @TltFld(name = "id",value = "id",column = "id",commonts = "id")
    private String id;
    @TltFld(name = "name",value = "姓名",commonts = "姓名",column = "name")
    private String name;
    @TltFld(name = "age",value = "年龄",column = "name",commonts = "年龄")
    private String age;
    @TltFld(name = "phone",value = "手机号码",commonts = "手机号码",column = "phone")
    private String phone;
    @TltFld(name = "address",value = "地址",commonts = "地址",column = "address")
    private String address;
    @TltFld(name = "email",value = "email",commonts = "email",column = "email")
    private String email;
    @TltFld(name = "qq",value = "qq",commonts = "qq",column = "qq")
    private String qq;
    @TltTime
    @TltFld(name = "createTime",value = "创建时间",commonts = "创建时间",column = "create_time")
    private String createTime;
    @TltFld(name = "createUser",value = "创建人",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltFld(name = "remark",value = "备注",commonts = "备注",column = "remark")
    private String remark;
    @TltFld(name = "useFlag",value = "是否使用",commonts = "是否使用",column = "use_flag")
    private String useFlag;
    @TltFld(name = "delFlag",value = "是否删除",commonts = "是否删除",column = "del_flag")
    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
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
}