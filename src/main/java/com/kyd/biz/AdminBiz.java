package com.kyd.biz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kyd.core.biz.AbstractBiz;
import com.kyd.core.biz.BaseBiz;
import com.kyd.core.dto.*;
import com.kyd.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@Api(value = "系统用户表")
public class AdminBiz extends AbstractBiz<AdminService> implements BaseBiz<AdminService> {

    @ResponseBody
    @RequestMapping("/data")
    public Object data() throws IOException {

        Enumeration<String> pNames =  request.getParameterNames();
        while (pNames.hasMoreElements()) {
            String key = pNames.nextElement();
            String value = request.getParameter(key);
            System.out.println(key + " " + value);
        }

        String data ="{'code':0,'msg':'','count':1000,'data':[{'id':10000,'username':'user-0','sex':'女','city':'城市-0','sign':'签名-0','experience':255,'logins':24,'wealth':82830700,'classify':'作家','score':57},{'id':10001,'username':'user-1','sex':'男','city':'城市-1','sign':'签名-1','experience':884,'logins':58,'wealth':64928690,'classify':'词人','score':27},{'id':10002,'username':'user-2','sex':'女','city':'城市-2','sign':'签名-2','experience':650,'logins':77,'wealth':6298078,'classify':'酱油','score':31},{'id':10003,'username':'user-3','sex':'女','city':'城市-3','sign':'签名-3','experience':362,'logins':157,'wealth':37117017,'classify':'诗人','score':68},{'id':10004,'username':'user-4','sex':'男','city':'城市-4','sign':'签名-4','experience':807,'logins':51,'wealth':76263262,'classify':'作家','score':6},{'id':10005,'username':'user-5','sex':'女','city':'城市-5','sign':'签名-5','experience':173,'logins':68,'wealth':60344147,'classify':'作家','score':87},{'id':10006,'username':'user-6','sex':'女','city':'城市-6','sign':'签名-6','experience':982,'logins':37,'wealth':57768166,'classify':'作家','score':34},{'id':10007,'username':'user-7','sex':'男','city':'城市-7','sign':'签名-7','experience':727,'logins':150,'wealth':82030578,'classify':'作家','score':28},{'id':10008,'username':'user-8','sex':'男','city':'城市-8','sign':'签名-8','experience':951,'logins':133,'wealth':16503371,'classify':'词人','score':14},{'id':10009,'username':'user-9','sex':'女','city':'城市-9','sign':'签名-9','experience':484,'logins':25,'wealth':86801934,'classify':'词人','score':75}]}";

        return JSON.toJSON(JSONObject.parseObject(data));
    }

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
        Map<String, Object> map = requestToMap();
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
