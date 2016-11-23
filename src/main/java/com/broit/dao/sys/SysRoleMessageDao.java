package com.broit.dao.sys;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysRoleMessageMapper;
import com.broit.model.dto.SysRoleMessageDto;

@Repository
public class SysRoleMessageDao extends AbstractCurdDao<SysRoleMessageMapper<SysRoleMessageDto>,SysRoleMessageDto>{
	
	Log log = LogFactory.getLog(this.getClass());
	
	protected void saveMethod(SysRoleMessageDto record){
		if(StringUtils.isEmpty(record.getId())){
			this.getMapper().insert(record);
		}else{
			this.getMapper().updateByPrimaryKey(record);
		}
	}
	
}