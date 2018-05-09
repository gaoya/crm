package com.kyd.biz;

import com.kyd.core.biz.BizUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private BizUtils bizUtils;

    /**
     * 程序入口
     *
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
     *
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
    @RequestMapping(value = "{suffix}/tableList", method = RequestMethod.GET)
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response, @PathVariable("suffix") String suffix) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/list");
        List<Map<String, Object>> searchData = bizUtils.paramsList(suffix, "0", "p_search");
        List<Map<String, Object>> titleData = bizUtils.paramsList(suffix, "0", "p_list");

        modelAndView.addObject("searchData", searchData);
        modelAndView.addObject("titleData", titleData);
        modelAndView.addObject("menuType", suffix);
        return modelAndView;
    }
}
