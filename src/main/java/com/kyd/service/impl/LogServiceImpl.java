package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.LogMapper;
import com.kyd.service.LogService;
import org.springframework.stereotype.Service;


@Service("logService")
public class LogServiceImpl extends CoreServiceImpl<LogMapper> implements LogService {


}
