package com.kyd.biz;

import com.kyd.service.ShowParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/")
@Controller
public class IndexController {

    @Autowired
    private ShowParamService showParamService;

    /**
     * 程序入口
     * @return
     */
    @RequestMapping({"/", "index"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/index");
        return modelAndView;
    }


    /**
     * 控制面板
     * @return
     */
    @RequestMapping("main")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/main");
        return modelAndView;
    }


    ///////////////////////////////////////////////////////////////////////////
    // controller 操作
    //      设置：
    //          controller的设置如下：
    //          将所有的基本设置都是设置在index中，这样的话，在设置的时候，将所有的数据的配置都加入到该文件中，可以减少代码量
    ///////////////////////////////////////////////////////////////////////////
    //程序进入到系统的主路径
    public static final String COMPONENT_ROOT_VIEW = "view";
    public static final String URL_PARAM = "_urlP";

    @RequestMapping(value = "{suffix}/tableList",method = RequestMethod.GET)
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response, @PathVariable("suffix") String suffix) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/list");
        List<Map<String, Object>> searchData = paramsList("admin", "0","p_search");
        List<Map<String, Object>> titleData = paramsList("admin", "0","p_list");

        modelAndView.addObject("searchData", searchData);
        modelAndView.addObject("titleData", titleData);
        modelAndView.addObject("menuType",suffix);
        return modelAndView;
    }

    /**
     * 新增用户
     * @return
     */
    @RequestMapping("/{suffix}/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response, @PathVariable("suffix") String suffix) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/add");
        List<Map<String, Object>> addData = paramsList("admin", "0","p_add");
        modelAndView.addObject("addData",addData);
        return modelAndView;

    }

    /**
     * 修改页面
     * @return
     */
    @RequestMapping("/{suffix}/edit")
    public ModelAndView edit(HttpServletRequest request, HttpServletResponse response, @PathVariable("suffix") String suffix) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/edit");
        List<Map<String, Object>> editData = paramsList("admin","0","p_update");
        modelAndView.addObject("editData",editData);
        return modelAndView;
    }

    /**
     * 修改页面
     * @return
     */
    @RequestMapping("/{suffix}/detail")
    public ModelAndView detail(HttpServletRequest request, HttpServletResponse response, @PathVariable("suffix") String suffix) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/detail");
        List<Map<String, Object>> detailData = paramsList("admin","0","p_detail");
        modelAndView.addObject("detailData",detailData);
        return modelAndView;
    }


    /**
     * 得到查询数据
     * @return
     */
    private List<Map<String, Object>> paramsList(String menuCode, String typeValue,String type) {
        Map<String, Object> param = new HashMap<>();
        param.put("menuCode", menuCode);
        param.put("pTypeValue", typeValue);
        param.put("pType",type);
        List<Map<String, Object>> list = showParamService.paramList(param);
        return list;
    }

}
