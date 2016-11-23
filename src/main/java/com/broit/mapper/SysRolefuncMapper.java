package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.SysRolefunc;
import com.broit.model.dto.SysRolefuncDto;

public interface SysRolefuncMapper {
    int deleteByPrimaryKey(@Param("rolefuncUid")String rolefuncUid);

    int insert(SysRolefunc record);

    int insertSelective(SysRolefunc record);

    SysRolefunc selectByPrimaryKey(@Param("rolefuncUid")String rolefuncUid);

    int updateByPrimaryKeySelective(SysRolefunc record);

    int updateByPrimaryKey(SysRolefunc record);
    
    /**角色功能列表*/
    List<SysRolefuncDto> roleFuncList(@Param("roleUid")String roleUid);    
    
    /**
     * 删除角色功能
     * */
    int deleteByRoleId(@Param("rolefuncRoleid")String rolefuncRoleid);
    
    /**
     * 角色功能-批量插入
     * */
    void batchInsertRoleFunc(List<SysRolefunc> roleFuncList);
}