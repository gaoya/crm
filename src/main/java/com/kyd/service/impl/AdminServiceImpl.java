package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.AdminMapper;
import com.kyd.service.AdminService;
import org.springframework.stereotype.Service;


@Service("adminService")
public class AdminServiceImpl extends CoreServiceImpl<AdminMapper> implements AdminService {


}
