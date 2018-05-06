package com.kyd.biz;

import com.kyd.core.biz.AbstractBiz;
import com.kyd.core.biz.BaseBiz;
import com.kyd.core.dto.*;
import com.kyd.service.ShowParamService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("showParam")
@Api(value = "系统用户表")
public class ShowParamBiz extends AbstractBiz<ShowParamService> implements BaseBiz<ShowParamService> {

    /**
     * 分页查询数据
     * @return
     * @throws Exception
     */
    @ApiOperation("分页查询数据连")
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "menuId",value = "菜单Id"),
@ApiImplicitParam(name = "menuCode",value = "菜单CODE"),
@ApiImplicitParam(name = "pId",value = "类型Id"),
@ApiImplicitParam(name = "pName",value = "类型名称"),
@ApiImplicitParam(name = "pPlaceholder",value = "提示"),
@ApiImplicitParam(name = "pLabel",value = "标签"),
@ApiImplicitParam(name = "pList",value = "列表参数"),
@ApiImplicitParam(name = "pListdata",value = "列表参数"),
@ApiImplicitParam(name = "pAdd",value = "新增参数"),
@ApiImplicitParam(name = "pUpdate",value = "修改参数"),
@ApiImplicitParam(name = "pDel",value = "删除参数"),
@ApiImplicitParam(name = "pDefaultvalue",value = "默认值"),
@ApiImplicitParam(name = "pUser",value = "用户"),
@ApiImplicitParam(name = "pTime",value = "创建时间"),
@ApiImplicitParam(name = "pSort",value = "排序"),
@ApiImplicitParam(name = "pRemark",value = "备注"),
@ApiImplicitParam(name = "pSearch",value = "查询")

    })
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    protected ResultListViewData list() throws Exception {
        Map<String,Object> param = requestToMap();
        return super.list(param);
    }

    /**
     * 查询总共数据量
     * @return
     * @throws Exception
     */
    @ApiOperation("查询数据总量")
    @RequestMapping(value = "/total",method = RequestMethod.POST)
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "menuId",value = "菜单Id"),
@ApiImplicitParam(name = "menuCode",value = "菜单CODE"),
@ApiImplicitParam(name = "pId",value = "类型Id"),
@ApiImplicitParam(name = "pName",value = "类型名称"),
@ApiImplicitParam(name = "pPlaceholder",value = "提示"),
@ApiImplicitParam(name = "pLabel",value = "标签"),
@ApiImplicitParam(name = "pList",value = "列表参数"),
@ApiImplicitParam(name = "pListdata",value = "列表参数"),
@ApiImplicitParam(name = "pAdd",value = "新增参数"),
@ApiImplicitParam(name = "pUpdate",value = "修改参数"),
@ApiImplicitParam(name = "pDel",value = "删除参数"),
@ApiImplicitParam(name = "pDefaultvalue",value = "默认值"),
@ApiImplicitParam(name = "pUser",value = "用户"),
@ApiImplicitParam(name = "pTime",value = "创建时间"),
@ApiImplicitParam(name = "pSort",value = "排序"),
@ApiImplicitParam(name = "pRemark",value = "备注"),
@ApiImplicitParam(name = "pSearch",value = "查询")

    })
    protected ResultTotalViewData dataTotalCount() throws Exception {
        Map<String,Object> map = requestToMap();
        return super.dataTotalCount( map);
    }

    /**
     * 查询一天数据记录
     * @param id
     * @return
     * @throws Exception
     */
    @ApiOperation("根据id得到用户信息")
    @ApiImplicitParam(required = true ,name = "id" ,value = "主键",paramType = "jquery")
    @RequestMapping(value = "/findOne/{id}",method = RequestMethod.GET)
    @Override
    protected ResultFindOneViewData findById(@PathVariable("id") Long id) throws Exception {
        return super.findById(id);
    }

    @ApiOperation("修改数据信息")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "menuId",value = "菜单Id"),
@ApiImplicitParam(name = "menuCode",value = "菜单CODE"),
@ApiImplicitParam(name = "pId",value = "类型Id"),
@ApiImplicitParam(name = "pName",value = "类型名称"),
@ApiImplicitParam(name = "pPlaceholder",value = "提示"),
@ApiImplicitParam(name = "pLabel",value = "标签"),
@ApiImplicitParam(name = "pList",value = "列表参数"),
@ApiImplicitParam(name = "pListdata",value = "列表参数"),
@ApiImplicitParam(name = "pAdd",value = "新增参数"),
@ApiImplicitParam(name = "pUpdate",value = "修改参数"),
@ApiImplicitParam(name = "pDel",value = "删除参数"),
@ApiImplicitParam(name = "pDefaultvalue",value = "默认值"),
@ApiImplicitParam(name = "pUser",value = "用户"),
@ApiImplicitParam(name = "pTime",value = "创建时间"),
@ApiImplicitParam(name = "pSort",value = "排序"),
@ApiImplicitParam(name = "pRemark",value = "备注"),
@ApiImplicitParam(name = "pSearch",value = "查询")

    })
    protected ResultUpdateViewDate update() throws Exception {
        Map<String,Object> map = requestToMap();
        return super.update(map);
    }

    @ApiOperation("新增数据信息")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "menuId",value = "菜单Id"),
@ApiImplicitParam(name = "menuCode",value = "菜单CODE"),
@ApiImplicitParam(name = "pId",value = "类型Id"),
@ApiImplicitParam(name = "pName",value = "类型名称"),
@ApiImplicitParam(name = "pPlaceholder",value = "提示"),
@ApiImplicitParam(name = "pLabel",value = "标签"),
@ApiImplicitParam(name = "pList",value = "列表参数"),
@ApiImplicitParam(name = "pListdata",value = "列表参数"),
@ApiImplicitParam(name = "pAdd",value = "新增参数"),
@ApiImplicitParam(name = "pUpdate",value = "修改参数"),
@ApiImplicitParam(name = "pDel",value = "删除参数"),
@ApiImplicitParam(name = "pDefaultvalue",value = "默认值"),
@ApiImplicitParam(name = "pUser",value = "用户"),
@ApiImplicitParam(name = "pTime",value = "创建时间"),
@ApiImplicitParam(name = "pSort",value = "排序"),
@ApiImplicitParam(name = "pRemark",value = "备注"),
@ApiImplicitParam(name = "pSearch",value = "查询")

    })
    protected ResultInsertViewData insert() throws Exception {
        Map<String,Object> map = requestToMap();
        return super.insert(map);
    }

    @ApiOperation("删除数据信息")
    @ApiImplicitParam(paramType = "query",name = "id",value = "主键")
    @RequestMapping(value = "/delete/{id}",method = {RequestMethod.GET,RequestMethod.POST})
    @Override
    protected ResultDeleteViewData delete(@PathVariable("id") Long id) throws Exception {
        return super.delete( id);
    }
}
