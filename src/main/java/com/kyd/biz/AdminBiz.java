package com.kyd.biz;

import com.kyd.core.biz.AbstractBiz;
import com.kyd.core.biz.BaseBiz;
import com.kyd.core.dto.*;
import com.kyd.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/admin")
@Api(value = "系统用户表")
public class AdminBiz extends AbstractBiz<AdminService> implements BaseBiz<AdminService> {

    private static final String TYPE_MODEL = "admin";

    /**
     * 分页查询数据
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

    protected ResultListViewData list() {
        Map<String, Object> param = bizUtils.requestToMap(request);
        return super.list(param);
    }

    /**
     * 查询总共数据量
     *
     * @return
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
    protected ResultTotalViewData dataTotalCount() {
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
    protected ResultFindOneViewData findById(@PathVariable("id") Long id) {
        return super.findById(id);
    }

    @ApiOperation("修改数据信息")
    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
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
    protected ResultUpdateViewDate edit()  {
        Map<String, Object> map = bizUtils.requestToMap(request);
        return super.update(map);
    }

    @ApiOperation("新增数据信息")
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
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
    protected ResultInsertViewData add() {
        Map<String, Object> map = bizUtils.requestToMap(request);
        return super.insert(map);
    }

    @ApiOperation("删除数据信息")
    @ApiImplicitParam(paramType = "query", name = "id", value = "主键")
    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    @Override
    protected ResultDeleteViewData delete(@PathVariable("id") Long id) {
        return super.delete(id);
    }

    /**
     *
     * 批量删除数据
     *  id 集合信息 使用 ，进行fenge
     * @return
     */
    @ApiOperation("批量删除数据")
    @ApiImplicitParam(paramType = "query",name = "ids",value = "主键集合，使用逗号（,）分割")
    @ResponseBody
    @RequestMapping("/batchDelete")
    protected ResultDeleteViewData batchDelete() {
        String ids =  request.getParameter("ids");
        return super.batchDelete(ids);
    }


    @RequestMapping("/addview")
    protected ModelAndView addView() {
        ModelAndView modelAndView = super.newView(TYPE_MODEL);
        return modelAndView;
    }

    @RequestMapping("/editview/{id}")
    protected ModelAndView editView(@PathVariable("id") Long id) {
        ModelAndView modelAndView = null;
        if (id > 0) {
            modelAndView = super.editView(TYPE_MODEL,id);
        }
        return modelAndView;
    }

    @RequestMapping("/detailview/{id}")
    protected ModelAndView detailView(@PathVariable("id") Long id) {
        ModelAndView modelAndView = null;
        if (id > 0) {
            modelAndView = super.detailView(TYPE_MODEL, id);
        }
        return modelAndView;
    }

}
