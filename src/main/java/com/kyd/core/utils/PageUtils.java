package com.kyd.core.utils;

import com.kyd.core.entity.PageEntity;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * 分页使用的方法
 */
public class PageUtils {

    static PageEntity page = new PageEntity();

    private static final String CURRENT_KEY = "page";
    private static final String SIZE_KEY = "limit";

    /**
     * 得到当前页面
     *
     * @param map
     * @return
     */
    public static Long getCurrent(Map<String, Object> map) {
        Long current = page.getCurrent();

        if (map != null && StringUtils.isNotEmpty((String) map.get(CURRENT_KEY))) {
            current = Long.parseLong((String) map.get(CURRENT_KEY));
        }

        return current;
    }

    /**
     * 得到size的数据
     *
     * @param map
     * @return
     */
    public static Long getSize(Map<String, Object> map) {
        Long size = page.getSize();

        if (map != null && StringUtils.isNotEmpty((String) map.get(SIZE_KEY))) {
            size = Long.parseLong((String) map.get(SIZE_KEY));
        }

        return size;
    }


}
