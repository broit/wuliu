package com.broit.dao.sys;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.broit.mapper.SysRoleoperMapper;
import com.broit.model.dto.RoleFuncOperListDto;

@Repository
public class SysRoleoperDao {
	
	@Autowired
	private SysRoleoperMapper roleoperMapper;
	
	
	/**保存角色操作*/
	public void saveFuncOper(RoleFuncOperListDto rfo){
		roleoperMapper.deleteByRoleId(rfo.getRoleUid());
		if(rfo.getRoList()!=null
				&&!rfo.getRoList().isEmpty()){
			roleoperMapper.batchInsertRoleOper(rfo.getRoList());
		}
	}
}
