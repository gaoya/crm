package com.kyd.service;

import com.kyd.core.service.BaseService;
import com.kyd.dao.ShowParamMapper;

import java.util.List;
import java.util.Map;

public interface ShowParamService extends BaseService<ShowParamMapper> {

    List<Map<String, Object>> paramList(Map<String, Object> map);

}
