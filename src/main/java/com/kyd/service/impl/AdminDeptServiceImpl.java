package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.AdminDeptMapper;
import com.kyd.service.AdminDeptService;
import org.springframework.stereotype.Service;


@Service("adminDeptService")
public class AdminDeptServiceImpl extends CoreServiceImpl<AdminDeptMapper> implements AdminDeptService {


}
