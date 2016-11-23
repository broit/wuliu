package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.BaseTeam;
import com.broit.model.BaseWs;
import com.broit.model.dto.BaseTeamDto;

public interface BaseTeamMapper<E> extends IBaseMapper<BaseTeamDto> {
    BaseTeamDto loadForm(@Param("id")String id);
    
    /**根据名称计数 */
    int countByName(BaseTeam record);
    
    /**班组下用户计数*/
    int countTeamUser(String id);
    
    /**查询公司下的车间*/
    List<BaseWs> selectWsByBranchid(@Param("branchid")String branchid);
}