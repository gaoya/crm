package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.HandleMapper;
import com.kyd.service.HandleService;
import org.springframework.stereotype.Service;


@Service("handleService")
public class HandleServiceImpl extends CoreServiceImpl<HandleMapper> implements HandleService {


}
