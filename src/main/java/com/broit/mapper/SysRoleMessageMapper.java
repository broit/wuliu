package com.broit.mapper;

import java.util.List;

import com.broit.model.SysRoleMessage;
import com.broit.model.dto.SysRoleMessageDto;

public interface SysRoleMessageMapper<E> extends IBaseMapper<SysRoleMessageDto>{
	

	List<SysRoleMessage> roleMessageList(String id);

    /**根据mtype值查询数量
     * @param record(roleid,mtype)
     * @return
     */
	SysRoleMessageDto countMtype(SysRoleMessageDto record);
    
    /**根据mtype值有无删除数据
     * @param record(roleid,mtype)
     * @return
     */
    int deleteMtype(SysRoleMessageDto record);
    
    /**删除空状态下的数据
     * @param record(roleid)
     * @return
     */
    int deleteMtypeNull(SysRoleMessageDto record);
    
    /**根据角色ID删除*/
    int deleteByRoleId(String id);
}