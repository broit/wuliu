package com.broit.dao.sys;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysOperMapper;
import com.broit.model.SysOper;


@Repository
public class SysOperDao extends AbstractCurdDao<SysOperMapper<SysOper>,SysOper>{
	
	Log log = LogFactory.getLog(SysOperDao.class);
	
	@Override
	protected String validateSave(SysOper entity){
		if(this.getMapper().countByCode(entity)>0){
			return "操作编码重复";
		}
		return null;
	}
	
}
