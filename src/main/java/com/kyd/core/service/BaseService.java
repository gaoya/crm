package com.kyd.core.service;

import com.kyd.core.dao.BaseMapper;
import com.kyd.core.dto.*;

import java.util.Map;

/***
 *  基础Service
 */
public interface BaseService<T extends BaseMapper> {

    ResultListViewData listAllByPageParam(Map<String, Object> map);

    ResultTotalViewData dataTotalCount(Map<String, Object> map);

    ResultFindOneViewData findOneById(Long id);

    ResultDeleteViewData deleteOneById(Long id);

    ResultDeleteViewData batchDeleteByIds (String ids);

    ResultUpdateViewDate update(Map<String, Object> map);

    ResultInsertViewData insert(Map<String, Object> map);



}
