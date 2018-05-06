package com.kyd.service.impl;

import com.kyd.core.service.CoreServiceImpl;
import com.kyd.dao.MenuMapper;
import com.kyd.service.MenuService;
import org.springframework.stereotype.Service;


@Service("menuService")
public class MenuServiceImpl extends CoreServiceImpl<MenuMapper> implements MenuService {


}
