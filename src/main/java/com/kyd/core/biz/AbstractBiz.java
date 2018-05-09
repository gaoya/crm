package com.kyd.core.biz;

import com.kyd.core.dto.*;
import com.kyd.core.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public abstract class AbstractBiz<T extends BaseService> implements BaseBiz<T>  {

    protected static final String COMMON_ROOT_VIEW = "view";
    public static final String TYPE_MODEL_KEY = "typeModel";
    public static final String PARAMS_DATA_KEY = "paramsData";
    public static final String MENU_CODE = "menuCode";

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
    protected ResultListViewData list(Map<String, Object> param) {
        return baseService.listAllByPageParam(param);
    }

    /**
     * 数据总量
     *
     * @param map
     * @return
     */
    protected ResultTotalViewData dataTotalCount(Map<String, Object> map) {
        return baseService.dataTotalCount(map);
    }


    protected ResultFindOneViewData findById(Long id) {
        return baseService.findOneById(id);
    }

    /**
     * 更新操作
     *
     * @param map
     * @return
     */
    protected ResultUpdateViewDate edit(Map<String, Object> map) {
        return baseService.update(map);
    }

    /**
     * 插入操作
     *
     * @param map
     * @return
     * @throws Exception
     */
    protected ResultInsertViewData insert(Map<String, Object> map) {
        return baseService.insert(map);
    }

    /***
     * 删除数据
     * @param id
     * @return
     * @throws Exception
     */
    protected ResultDeleteViewData delete(Long id) {
        return baseService.deleteOneById(id);
    }


    protected ResultDeleteViewData batchDelete(String ids) {
        return baseService.batchDeleteByIds(ids);
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
        modelAndview.setViewName(viewPath(menuCode));
        List<Map<String, Object>> paramsData =bizUtils.paramsList(menuCode, "0","p_add");
        modelAndview.addObject(PARAMS_DATA_KEY,paramsData);
        modelAndview.addObject(TYPE_MODEL_KEY,"add");
        modelAndview.addObject(MENU_CODE,menuCode);
        return modelAndview;
    }

    /**
     * 修改页面的View
     * @return
     */
    protected ModelAndView editView(String menuCode, Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", oneData(id));
        List<Map<String, Object>> paramsData = bizUtils.paramsList(menuCode,"0","p_update");
        modelAndView.addObject(PARAMS_DATA_KEY,paramsData);
        modelAndView.addObject(TYPE_MODEL_KEY,"edit");
        modelAndView.addObject(MENU_CODE,menuCode);
        modelAndView.setViewName(viewPath(menuCode));
        return modelAndView;
    }

    /**
     * 详情页面的View
     * @return
     */
    protected ModelAndView detailView(String menuCode, Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewPath(menuCode));
        modelAndView.addObject("data",oneData(id));
        List<Map<String, Object>> paramsData = bizUtils.paramsList(menuCode,"0","p_detail");
        modelAndView.addObject(PARAMS_DATA_KEY,paramsData);
        modelAndView.addObject(TYPE_MODEL_KEY,"detail");
        modelAndView.addObject(MENU_CODE,menuCode);
        return modelAndView;
    }


    /**
     * 得到一个数据
     * @return
     */
    private Map<String, Object> oneData(Long id) {
        if (id == null || id < 0L) {
            return  null ;
        }
        ResultFindOneViewData resultFindOneViewData = baseService.findOneById(id);
        return resultFindOneViewData.getData();
    }

    /**
     * 得到view的路径
     * @return
     */
    private String viewPath(String menuCode){
        return COMMON_ROOT_VIEW + "/" + menuCode + "/" + "tableView";
    }

}
