package com.broit.dao.sys;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.broit.bean.FormResultBean;
import com.broit.bean.TreeNodeBean;
import com.broit.mapper.SysUserroleMapper;
import com.broit.model.dto.SysUserroleDto;
import com.broit.model.dto.UserRoleListDto;


@Repository
public class SysUserroleDao {
	
	@Autowired
	private SysUserroleMapper userroleMapper;
	
	/**查询用户角色*/
	public FormResultBean<List<TreeNodeBean>> userRoleList(String userId){
		FormResultBean<List<TreeNodeBean>> result = new FormResultBean<List<TreeNodeBean>>();
		List<TreeNodeBean> list = new ArrayList<TreeNodeBean>();
		try{
			List<SysUserroleDto> foList = userroleMapper.userRoleList(userId);
			for(SysUserroleDto fo : foList){
				TreeNodeBean node = new TreeNodeBean();
				node.setText(fo.getRoleName());
				node.setValue(fo.getRoleUid());
				node.setChecked(fo.getUserroleUid()!=null);
				list.add(node);
			}
			result.setData(list);
			result.setSuccess(true); 
		}catch(Exception e){
			result.setErrorMessage(e.getMessage());
		}
		return result;
	}
	
	/**保存功能操作*/
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public void saveUserRole(UserRoleListDto ur){
		userroleMapper.deleteByUserId(ur.getUserId());
		if(ur.getList()!=null
				&&!ur.getList().isEmpty()){
			userroleMapper.batchInsertUserRole(ur.getList());
		}
	}
}
