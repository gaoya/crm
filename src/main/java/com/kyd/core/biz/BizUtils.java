package com.kyd.core.biz;

import com.kyd.service.ShowParamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BizUtils {
    @Resource(name = "showParamService")
    private ShowParamService showService;

    /**
     * 得到查询数据
     *
     * @return
     */
    public List<Map<String, Object>> paramsList(String menuCode, String typeValue, String type) {
        Map<String, Object> param = new HashMap<>();
        param.put("menuCode", menuCode);
        param.put("pTypeValue", typeValue);
        param.put("pType", type);
        List<Map<String, Object>> list = showService.paramList(param);
        return list;
    }

    /**
     * request 转换成Map集合数据
     * @return
     */
    public Map<String, Object> requestToMap(HttpServletRequest request) {
        Enumeration<String> names = request.getParameterNames();
        Map<String, Object> map = new HashMap<>();

        while (names.hasMoreElements()) {

            String name = names.nextElement();
            String value = request.getParameter(name);

            if (StringUtils.isNotEmpty(name)) {
                map.put(name, StringUtils.isEmpty(value) ? "" : value);
            }
        }

        return map;
    }


}
