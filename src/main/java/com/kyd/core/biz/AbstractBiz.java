package com.kyd.core.biz;

import com.kyd.core.dto.*;
import com.kyd.core.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractBiz<T extends BaseService> implements BaseBiz<T>  {

    protected final static String COMMON_ROOT_VIEW = "view";

    @Autowired
    protected T baseService;
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected BizUtils bizUtils;

    /**
     * 查询操作
     * param中参数 ，
     * current 当前页
     * size 每页数量
     * param 数量
     *
     * @return
     */
    protected ResultListViewData list(Map<String, Object> param) throws Exception {
        return baseService.listAllByPageParam(param);
    }

    /**
     * 数据总量
     *
     * @param map
     * @return
     */
    protected ResultTotalViewData dataTotalCount(Map<String, Object> map) throws Exception {
        return baseService.dataTotalCount(map);
    }


    protected ResultFindOneViewData findById(Long id) throws Exception {
        return baseService.findOneById(id);
    }

    /**
     * 更新操作
     *
     * @param map
     * @return
     */
    protected ResultUpdateViewDate update(Map<String, Object> map) throws Exception {
        return baseService.update(map);
    }

    /**
     * 插入操作
     *
     * @param map
     * @return
     * @throws Exception
     */
    protected ResultInsertViewData insert(Map<String, Object> map) throws Exception {
        return baseService.insert(map);
    }

    /***
     * 删除数据
     * @param id
     * @return
     * @throws Exception
     */
    protected ResultDeleteViewData delete(Long id) throws Exception {
        return baseService.deleteOneById(id);
    }

    /**
     * 得到一个baseService 的试下
     * @return
     */
    protected T getBaseService() {

        return baseService;
    }


    /**
     * 新增页面的View
     * @return
     */
    protected ModelAndView newView(String menuCode) {
        ModelAndView modelAndview = new ModelAndView();
        modelAndview.setViewName(viewPath());
        List<Map<String, Object>> paramsData =bizUtils.paramsList(menuCode, "0","p_add");
        modelAndview.addObject("paramsData",paramsData);
        modelAndview.addObject("typeModel","add");
        return modelAndview;
    }

    /**
     * 修改页面的View
     * @return
     */
    protected ModelAndView updateView(String menuCode, Long id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", oneData(id));
        List<Map<String, Object>> paramsData = bizUtils.paramsList(menuCode,"0","p_update");
        modelAndView.addObject("paramsData",paramsData);
        modelAndView.addObject("typeModel","edit");
        modelAndView.setViewName(viewPath());
        return modelAndView;
    }

    /**
     * 详情页面的View
     * @return
     */
    protected ModelAndView detailView(String menuCode, Long id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewPath());
        modelAndView.addObject("data",oneData(id));
        List<Map<String, Object>> paramsData = bizUtils.paramsList(menuCode,"0","p_detail");
        modelAndView.addObject("paramsData",paramsData);
        modelAndView.addObject("typeModel","detail");
        return modelAndView;
    }


    /**
     * 得到一个数据
     * @return
     */
    private Map<String, Object> oneData(Long id) throws Exception {
        ResultFindOneViewData data = baseService.findOneById(id);
        Map<String, Object> map = data.getData();
        return map;
    }

    /**
     * 得到view的路径
     * @return
     */
    private String viewPath(){
        String url = request.getRequestURI();
        return COMMON_ROOT_VIEW + url;
    }

}
