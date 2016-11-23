package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.BaseBranch;
import com.broit.model.BaseWs;
import com.broit.model.dto.BaseWsDto;

public interface BaseWsMapper<E> extends IBaseMapper<BaseWs> {
    BaseWsDto loadForm(@Param("id")String id);
    
    /**分公司视图列表*/
    List<BaseBranch> selectCoBranchList();
    
    /**根据名称计数 */
    int countByName(BaseWs record);
    
    /**车间下班组计数*/
    int countWsTeam(String id);
}