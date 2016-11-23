package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.SysFuncOper;
import com.broit.model.dto.SysFuncOperDto;

public interface SysFuncOperMapper {
    int deleteByPrimaryKey(String operUid);

    int insert(SysFuncOper record);

    int insertSelective(SysFuncOper record);

    SysFuncOper selectByPrimaryKey(String operUid);

    int updateByPrimaryKeySelective(SysFuncOper record);

    int updateByPrimaryKey(SysFuncOper record);
    
    /**查询功能操作列表*/
    List<SysFuncOperDto> funcOperList(@Param("funcUid")String funcUid);
    
    /**保存功能操作*/
    void batchInsertFuncOper(List<SysFuncOper> funcOperList);
    
    /**根据功能ID删除功能操作*/
    int deleteByFuncId(@Param("funcUid")String funcUid);
}