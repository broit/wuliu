package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.SysUserrole;
import com.broit.model.dto.SysUserroleDto;

public interface SysUserroleMapper {
    
	/**查询用户角色列表*/
    List<SysUserroleDto> userRoleList(@Param("id")String id);
    
    /**保存用户角色*/
    void batchInsertUserRole(List<SysUserrole> userRoleList);
    
    /**根据用户ID删除用户角色*/
    int deleteByUserId(@Param("id")String id);
    
    /**根据角色ID删除用户角色*/
    int deleteByRoleId(@Param("id")String id);
    
    /**查询用户角色*/
    List<String> queryUserRole(@Param("id")String id);
}