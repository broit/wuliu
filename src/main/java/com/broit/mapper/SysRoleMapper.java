package com.broit.mapper;

import com.broit.model.SysRole;

public interface SysRoleMapper<E> extends IBaseMapper<SysRole> {
    /**
     * 根据角色名称计数
     * */
    int countByName(SysRole sysRole);
    
    SysRole roleUser(String id);
    
}
