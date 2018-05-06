package com.kyd.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@Component
@MapperScan("com.kyd.dao")
public class MybatisAutoScanConfiguration {
}
