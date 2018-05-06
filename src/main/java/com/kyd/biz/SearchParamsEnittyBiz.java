package com.kyd.biz;

import com.kyd.core.biz.AbstractBiz;
import com.kyd.core.biz.BaseBiz;
import com.kyd.core.dto.*;
import com.kyd.service.SearchParamsEnittyService;
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
@RequestMapping("search")
@Api(value = "查询参数设置")
public class SearchParamsEnittyBiz extends AbstractBiz<SearchParamsEnittyService> implements BaseBiz<SearchParamsEnittyService> {

    /**
     * 分页查询数据
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("分页查询数据连")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号"),
            @ApiImplicitParam(name = "paramsId", value = "参数id"),
            @ApiImplicitParam(name = "paramsName", value = "名称"),
            @ApiImplicitParam(name = "paramsLabel", value = "标签"),
            @ApiImplicitParam(name = "paramsPlaceholder", value = "提示"),
            @ApiImplicitParam(name = "paramsType", value = "类型"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuCode", value = "菜单编码"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "sort", value = "排序"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "updateTime", value = "修改时间"),
            @ApiImplicitParam(name = "remark", value = "remark")

    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    protected ResultListViewData list() throws Exception {
        Map<String, Object> param = requestToMap();
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
            @ApiImplicitParam(name = "id", value = "编号"),
            @ApiImplicitParam(name = "paramsId", value = "参数id"),
            @ApiImplicitParam(name = "paramsName", value = "名称"),
            @ApiImplicitParam(name = "paramsLabel", value = "标签"),
            @ApiImplicitParam(name = "paramsPlaceholder", value = "提示"),
            @ApiImplicitParam(name = "paramsType", value = "类型"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuCode", value = "菜单编码"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "sort", value = "排序"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "updateTime", value = "修改时间"),
            @ApiImplicitParam(name = "remark", value = "remark")

    })
    protected ResultTotalViewData dataTotalCount() throws Exception {
        Map<String, Object> map = requestToMap();
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
            @ApiImplicitParam(name = "id", value = "编号"),
            @ApiImplicitParam(name = "paramsId", value = "参数id"),
            @ApiImplicitParam(name = "paramsName", value = "名称"),
            @ApiImplicitParam(name = "paramsLabel", value = "标签"),
            @ApiImplicitParam(name = "paramsPlaceholder", value = "提示"),
            @ApiImplicitParam(name = "paramsType", value = "类型"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuCode", value = "菜单编码"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "sort", value = "排序"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "updateTime", value = "修改时间"),
            @ApiImplicitParam(name = "remark", value = "remark")

    })
    protected ResultUpdateViewDate update() throws Exception {
        Map<String, Object> map = requestToMap();
        return super.update(map);
    }

    @ApiOperation("新增数据信息")
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号"),
            @ApiImplicitParam(name = "paramsId", value = "参数id"),
            @ApiImplicitParam(name = "paramsName", value = "名称"),
            @ApiImplicitParam(name = "paramsLabel", value = "标签"),
            @ApiImplicitParam(name = "paramsPlaceholder", value = "提示"),
            @ApiImplicitParam(name = "paramsType", value = "类型"),
            @ApiImplicitParam(name = "menuId", value = "菜单编号"),
            @ApiImplicitParam(name = "menuCode", value = "菜单编码"),
            @ApiImplicitParam(name = "useFlag", value = "是否使用"),
            @ApiImplicitParam(name = "delFlag", value = "是否删除"),
            @ApiImplicitParam(name = "sort", value = "排序"),
            @ApiImplicitParam(name = "createUser", value = "创建人"),
            @ApiImplicitParam(name = "createTime", value = "创建时间"),
            @ApiImplicitParam(name = "updateTime", value = "修改时间"),
            @ApiImplicitParam(name = "remark", value = "remark")

    })
    protected ResultInsertViewData insert() throws Exception {
        Map<String, Object> map = requestToMap();
        return super.insert(map);
    }

    @ApiOperation("删除数据信息")
    @ApiImplicitParam(paramType = "query", name = "id", value = "主键")
    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    @Override
    protected ResultDeleteViewData delete(@PathVariable("id") Long id) throws Exception {
        return super.delete(id);
    }
}
