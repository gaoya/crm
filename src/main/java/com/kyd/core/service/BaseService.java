package com.kyd.core.service;

import com.kyd.core.dao.BaseMapper;
import com.kyd.core.dto.*;

import java.util.Map;

/***
 *  基础Service
 */
public interface BaseService<T extends BaseMapper> {

    ResultListViewData listAllByPageParam(Map<String, Object> map) throws Exception;

    ResultTotalViewData dataTotalCount(Map<String, Object> map) throws Exception;

    ResultFindOneViewData findOneById(Long id) throws Exception;

    ResultDeleteViewData deleteOneById(Long id) throws Exception;

    ResultUpdateViewDate update(Map<String, Object> map) throws Exception;

    ResultInsertViewData insert(Map<String, Object> map) throws Exception;


}
