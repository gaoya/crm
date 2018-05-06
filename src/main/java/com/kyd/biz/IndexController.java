package com.kyd.biz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RequestMapping("/")
@Controller
public class IndexController {
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
        return modelAndView;
    }


    /**
     * 得到查询数据
     * @return
     */
    public List<Map<String, Object>> searchList() {
        return null;
    }

    /**
     * 得到标题信息
     * @return
     */
    public List<Map<String, Object>> tableTitleList() {
        return null;
    }



    /**
     * 新增用户
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(newUrl(request));
        return modelAndView;

    }

    /**
     * 修改页面
     * @return
     */
    @RequestMapping("/edit")
    public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(newUrl(request));
        return modelAndView;
    }

    /**
     * 得到一个view的路径地址，
     * @return
     */
    private String newUrl(HttpServletRequest request ) {
        String url =  request.getRequestURI();
        String urlParam = request.getParameter(URL_PARAM);
        String nUrl= COMPONENT_ROOT_VIEW + '/' +urlParam  + url;
        return nUrl ;
    }
}
