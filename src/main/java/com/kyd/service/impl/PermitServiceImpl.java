package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.PermitMapper;
import com.kyd.service.PermitService;
import org.springframework.stereotype.Service;


@Service("permitService")
public class PermitServiceImpl extends CoreServiceImpl<PermitMapper> implements PermitService {


}
