package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.RoleMapper;
import com.kyd.service.RoleService;
import org.springframework.stereotype.Service;


@Service("roleService")
public class RoleServiceImpl extends CoreServiceImpl<RoleMapper> implements RoleService {


}
