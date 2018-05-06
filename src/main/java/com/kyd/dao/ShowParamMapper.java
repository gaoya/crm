package com.kyd.dao;

import com.kyd.core.dao.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ShowParamMapper  extends BaseMapper{
    List<Map<String, Object>> findAllByMenuCodeAndType(Map<String, Object> map);
}
