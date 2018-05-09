package com.kyd.biz;

import com.kyd.core.biz.AbstractBiz;
import com.kyd.core.biz.BaseBiz;
import com.kyd.core.dto.*;
import com.kyd.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("menu")
@Api(value = "菜单表")
public class MenuBiz extends AbstractBiz<MenuService> implements BaseBiz<MenuService> {

    /**
     * 分页查询数据
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("分页查询数据连")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuName", value = "菜单名称"),
            @ApiImplicitParam(name = "menuUrl", value = "菜单地址"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "parentId", value = "父类编号"),
            @ApiImplicitParam(name = "isParent", value = "是否父类"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "createTime", value = "创建时间")

    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    protected ResultListViewData list() {
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
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuName", value = "菜单名称"),
            @ApiImplicitParam(name = "menuUrl", value = "菜单地址"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "parentId", value = "父类编号"),
            @ApiImplicitParam(name = "isParent", value = "是否父类"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "createTime", value = "创建时间")

    })
    protected ResultTotalViewData dataTotalCount() {
        Map<String, Object> param = bizUtils.requestToMap(request);
        return super.dataTotalCount(param);
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
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuName", value = "菜单名称"),
            @ApiImplicitParam(name = "menuUrl", value = "菜单地址"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "parentId", value = "父类编号"),
            @ApiImplicitParam(name = "isParent", value = "是否父类"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "createTime", value = "创建时间")

    })
    protected ResultUpdateViewDate update() {
        Map<String, Object> param = bizUtils.requestToMap(request);
        return super.edit(param);
    }

    @ApiOperation("新增数据信息")
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuName", value = "菜单名称"),
            @ApiImplicitParam(name = "menuUrl", value = "菜单地址"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "parentId", value = "父类编号"),
            @ApiImplicitParam(name = "isParent", value = "是否父类"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "remark", value = "备注"),
            @ApiImplicitParam(name = "createTime", value = "创建时间")

    })
    protected ResultInsertViewData insert() {
        Map<String, Object> param = bizUtils.requestToMap(request);
        return super.insert(param);
    }

    @ApiOperation("删除数据信息")
    @ApiImplicitParam(paramType = "query", name = "id", value = "主键")
    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    @Override
    protected ResultDeleteViewData delete(@PathVariable("id") Long id) {
        return super.delete(id);
    }
}
