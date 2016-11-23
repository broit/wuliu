package com.broit.dao.sys;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysParamMapper;
import com.broit.model.SysParam;

/**数据字典*/
@Repository
public class SysParamDao extends AbstractCurdDao<SysParamMapper<SysParam>, SysParam>{
	
	Log log = LogFactory.getLog(this.getClass());

	@Override
	protected String validateSave(SysParam entity) {
		if(this.getMapper().countByName(entity)>0){
			return "名称重复";
		}
		if(this.getMapper().countByCode(entity)>0){
			return "编码重复";
		}
		return null;
	}

	/**根据类型查询字典*/
	public List<SysParam> selectByType(SysParam entity){
		return this.getMapper().selectByType(entity);
	}
}
