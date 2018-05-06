package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.ShowParamMapper;
import com.kyd.service.ShowParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("showParamService")
public class ShowParamServiceImpl extends CoreServiceImpl<ShowParamMapper> implements ShowParamService{

    @Autowired
    private ShowParamMapper showParamMapper;

    @Override
    public List<Map<String, Object>> paramList(Map<String, Object> map) {
        return showParamMapper.findAllByMenuCodeAndType(map);
    }
}
