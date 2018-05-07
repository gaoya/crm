package com.kyd.biz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kyd.core.biz.AbstractBiz;
import com.kyd.core.biz.BaseBiz;
import com.kyd.core.biz.BizUtils;
import com.kyd.core.dto.*;
import com.kyd.service.AdminService;
import com.kyd.service.ShowParamService;
import com.kyd.service.impl.ShowParamServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@Api(value = "系统用户表")
public class AdminBiz extends AbstractBiz<AdminService> implements BaseBiz<AdminService> {
    /**
     * 分页查询数据
     *
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("分页查询数据连")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "name", value = "姓名"),
            @ApiImplicitParam(name = "age", value = "年龄"),
            @ApiImplicitParam(name = "phone", value = "手机号码"),
            @ApiImplicitParam(name = "address", value = "地址"),
            @ApiImplicitParam(name = "email", value = "email"),
            @ApiImplicitParam(name = "qq", value = "qq"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除")
    })
    @ResponseBody
    @RequestMapping(value = "/list")
    protected ResultListViewData list() throws Exception {
        Map<String, Object> param = bizUtils.requestToMap(request);
        return super.list(param);
    }

    /**
     * 查询总共数据量
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("查询数据总量")
    @RequestMapping(value = "/total", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "name", value = "姓名"),
            @ApiImplicitParam(name = "age", value = "年龄"),
            @ApiImplicitParam(name = "phone", value = "手机号码"),
            @ApiImplicitParam(name = "address", value = "地址"),
            @ApiImplicitParam(name = "email", value = "email"),
            @ApiImplicitParam(name = "qq", value = "qq"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除")

    })
    protected ResultTotalViewData dataTotalCount() throws Exception {
        Map<String, Object> map = bizUtils.requestToMap(request);
        return super.dataTotalCount(map);
    }

    /**
     * 查询一天数据记录
     *
     * @param id
     * @return
     * @throws Exception
     */
    @ApiOperation("根据id得到用户信息")
    @ApiImplicitParam(required = true, name = "id", value = "主键", paramType = "jquery")
    @RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET)
    @Override
    protected ResultFindOneViewData findById(@PathVariable("id") Long id) throws Exception {
        return super.findById(id);
    }

    @ApiOperation("修改数据信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "name", value = "姓名"),
            @ApiImplicitParam(name = "age", value = "年龄"),
            @ApiImplicitParam(name = "phone", value = "手机号码"),
            @ApiImplicitParam(name = "address", value = "地址"),
            @ApiImplicitParam(name = "email", value = "email"),
            @ApiImplicitParam(name = "qq", value = "qq"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除")

    })
    protected ResultUpdateViewDate update() throws Exception {
        Map<String, Object> map = bizUtils.requestToMap(request);
        return super.update(map);
    }

    @ApiOperation("新增数据信息")
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "name", value = "姓名"),
            @ApiImplicitParam(name = "age", value = "年龄"),
            @ApiImplicitParam(name = "phone", value = "手机号码"),
            @ApiImplicitParam(name = "address", value = "地址"),
            @ApiImplicitParam(name = "email", value = "email"),
            @ApiImplicitParam(name = "qq", value = "qq"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除")

    })
    protected ResultInsertViewData insert() throws Exception {
        Map<String, Object> map = bizUtils.requestToMap(request);
        return super.insert(map);
    }

    @ApiOperation("删除数据信息")
    @ApiImplicitParam(paramType = "query", name = "id", value = "主键")
    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    @Override
    protected ResultDeleteViewData delete(@PathVariable("id") Long id) throws Exception {
        return super.delete(id);
    }

    public static final String COMMON_ROOT_VIEW = "view";
    /**
     * 新增用户
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(COMMON_ROOT_VIEW + "/admin/add");
        List<Map<String, Object>> addData =bizUtils.paramsList("admin", "0","p_add");
        modelAndView.addObject("addData",addData);
        return modelAndView;
    }

    /**
     * 修改页面
     * @return
     */
    @RequestMapping("/edit")
    public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(COMMON_ROOT_VIEW + "/admin/edit");
        List<Map<String, Object>> editData = bizUtils.paramsList("admin","0","p_update");
        modelAndView.addObject("editData",editData);
        return modelAndView;
    }

    /**
     * 修改页面
     * @return
     */
    @RequestMapping("/detail")
    public ModelAndView detail(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(COMMON_ROOT_VIEW + "/admin/detail");
        List<Map<String, Object>> detailData = bizUtils.paramsList("admin","0","p_detail");
        modelAndView.addObject("detailData",detailData);
        return modelAndView;
    }

}
