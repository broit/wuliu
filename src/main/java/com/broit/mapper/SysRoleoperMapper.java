package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.SysRoleoper;

public interface SysRoleoperMapper {
    int deleteByPrimaryKey(@Param("roleoperUid")String roleoperUid);

    int insert(SysRoleoper record);

    int insertSelective(SysRoleoper record);

    SysRoleoper selectByPrimaryKey(@Param("roleoperUid")String roleoperUid);

    int updateByPrimaryKeySelective(SysRoleoper record);

    int updateByPrimaryKey(SysRoleoper record);
    
    void batchInsertRoleOper(List<SysRoleoper> roleOperList);
    
    int deleteByRoleId(@Param("roleoperRoleid")String roleoperRoleid);
}