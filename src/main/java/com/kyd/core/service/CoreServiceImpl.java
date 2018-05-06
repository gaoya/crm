package com.kyd.core.service;

import com.kyd.core.dao.BaseMapper;
import com.kyd.core.dto.*;
import com.kyd.core.utils.DateTimeUtils;
import com.kyd.core.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 核心实现
 */
public class CoreServiceImpl<T extends BaseMapper> implements BaseService<T> {
    //返回数设置
    ResultEnum resultEnum ;
    @Autowired
    private T baseMapper;

    /**
     * 分页查询数据
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public ResultListViewData listAllByPageParam(Map<String, Object> map) throws Exception {
        ResultListViewData result = new ResultListViewData();

        Long totalSize = baseMapper.findCountByPageParam(map);
        Long current = PageUtils.getCurrent(map);
        Long size = PageUtils.getSize(map);
        map.put("startIndex",(current-1) * size);
        //在mysql中分页很简单，limit start ,end =>  start 开始的数据，end 数据的个数
        map.put("endIndex",size);
        Long totalPage = totalSize % size == 0 ? (totalSize / size) : (totalSize / size + 1);
        result.setCount(totalSize);
        result.setCurrent(current);
        result.setSize(size);
        result.setTotalPage(totalPage);

        if (current <= 1) {
            result.setPrePage(false);
        }

        if (totalPage <= current) {
            result.setNextPage(false);
        }
        List<Map<String, Object>> data = baseMapper.findAllByPageParam(map);

        if (data == null) {
            data = new ArrayList<>();
            resultEnum = ResultEnum.RESULT_LIST_FAIL;
        } else {
            resultEnum = ResultEnum.RESULT_LIST_SUCCESS;
        }
        result.setCode(resultEnum.code());
        result.setMsg(resultEnum.msg());
        result.setData(data);

        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("listAllByPageParam");
        result.setResultTime(DateTimeUtils.now(DateTimeUtils.FULL_DATE));

        return result;
    }

    /**
     * 此处可以和listAllByPageParam 中的数据进行合并使用
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public ResultTotalViewData dataTotalCount(Map<String, Object> map) throws Exception {
        ResultTotalViewData result = new ResultTotalViewData();
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("listAllByPageParam");
        result.setResultTime(DateTimeUtils.now(DateTimeUtils.FULL_DATE));
        Long totalSize = baseMapper.findCountByPageParam(map);
        Long current = PageUtils.getCurrent(map);
        Long size = PageUtils.getSize(map);
        Long totalPage = totalSize % size == 0 ? (totalSize / size) : (totalSize / size + 1);
        result.setTotalSize(totalSize);
        result.setCurrent(current);
        result.setSize(size);
        result.setTotalPage(totalPage);

        if (totalSize <= 0) {
            resultEnum = ResultEnum.RESULT_FIND_FAIL;
        } else {
            resultEnum = ResultEnum.RESULT_FIND_SUCCESS;
        }
        result.setCode(resultEnum.code());
        result.setMsg(resultEnum.msg());
        return result;
    }

    /***
     * 根据id查询一条数据记录
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ResultFindOneViewData findOneById(Long id) throws Exception {
        Map<String, Object> data = baseMapper.findById(id);
        ResultFindOneViewData result = new ResultFindOneViewData();
        result.setData(data);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setData(data);

        if (data != null) {
            resultEnum = ResultEnum.RESULT_FIND_SUCCESS;
        } else {
            resultEnum = ResultEnum.RESULT_FIND_FAIL;
        }
        result.setCode(resultEnum.code());
        result.setMsg(resultEnum.msg());
        result.setResultTime(DateTimeUtils.now(DateTimeUtils.FULL_DATE));
        return result;
    }

    @Override
    public ResultDeleteViewData deleteOneById(Long id) throws Exception {
        ResultDeleteViewData result = new ResultDeleteViewData();
        Long count = baseMapper.deleteById(id);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setDeleteCount(count);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("deleteOneById");
        result.setResultTime(DateTimeUtils.now(DateTimeUtils.FULL_DATE));
        if (count >= 1) {
            resultEnum = ResultEnum.RESULT_DELETE_SUCCESS;
        } else {
            resultEnum = ResultEnum.RESULT_DELETE_FAIL;
        }
        result.setCode(resultEnum.code());
        result.setMsg(resultEnum.msg());
        return result;
    }

    @Transactional
    @Override
    public ResultUpdateViewDate update(Map<String, Object> map) throws Exception {
        ResultUpdateViewDate result = new ResultUpdateViewDate();
        Long count = baseMapper.update(map);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setUpdateCountData(count);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("deleteOneById");
        result.setResultTime(DateTimeUtils.now(DateTimeUtils.FULL_DATE));

        if (count >= 1) {
           resultEnum = ResultEnum.RESULT_EDIT_SUCCESS;
        } else {
            resultEnum = ResultEnum.RESULT_EDIT_FAIL;
        }
        result.setCode(resultEnum.code());
        result.setMsg(resultEnum.msg());
        return result;
    }

    @Transactional
    @Override
    public ResultInsertViewData insert(Map<String, Object> map) throws Exception {
        ResultInsertViewData result = new ResultInsertViewData();
        Long count = baseMapper.insert(map);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setInsertCountData(count);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("deleteOneById");
        result.setResultTime(DateTimeUtils.now(DateTimeUtils.FULL_DATE));

        if (count >= 1) {
            resultEnum = ResultEnum.RESULT_ADD_SUCCESS;
        } else {
            resultEnum = ResultEnum.RESULT_ADD_FAIL;
        }
        result.setCode(resultEnum.code());
        result.setMsg(resultEnum.msg());
        return result;
    }

}


