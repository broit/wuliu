package com.broit.dao.sys;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.broit.bean.FormResultBean;
import com.broit.bean.TreeNodeBean;
import com.broit.mapper.SysRolefuncMapper;
import com.broit.model.dto.RoleFuncOperListDto;
import com.broit.model.dto.SysRolefuncDto;


@Repository
public class SysRolefuncDao {
	
	@Autowired
	private SysRolefuncMapper roleMapper;
	
	@Resource
	private SysRoleoperDao roleOperDao;
	
	/**查询角色功能*/
	public FormResultBean<List<TreeNodeBean>> roleFuncList(String roleUid){
		FormResultBean<List<TreeNodeBean>> result = new FormResultBean<List<TreeNodeBean>>();
		try{
			List<SysRolefuncDto> list = roleMapper.roleFuncList(roleUid);
			TreeNodeBean root = new TreeNodeBean();
			root.setText("根节点");
			Map<String,TreeNodeBean> treeMap = new HashMap<String,TreeNodeBean>();
			treeMap.put("root", root);
			//构建功能树
			for(SysRolefuncDto rf : list){
				String parent = rf.getFuncParent();
				TreeNodeBean parentNode = treeMap.get(parent);
				TreeNodeBean node = new TreeNodeBean();
				node.setText(rf.getFuncName());
				node.setValue(rf.getFuncUid());
				node.setChecked(rf.getRolefuncFuncid()!=null);
				node.setIconCls("no-icon");
				node.setType(rf.getFuncType());
				parentNode.addChildren(node);
				treeMap.put(rf.getFuncUid(), node);
			}
			result.setData(root.getChildren());
			result.setSuccess(true);
		}catch(Exception e){
			result.setErrorMessage(e.getMessage());
		}
		return result;
	}
	
	/**
	 * 保存角色功能和操作
	 * */
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public void saveRoleFuncOper(RoleFuncOperListDto rfo){
		roleMapper.deleteByRoleId(rfo.getRoleUid());
		if(rfo.getRfList()!=null
				&&!rfo.getRfList().isEmpty()){
			roleMapper.batchInsertRoleFunc(rfo.getRfList());
		}
		roleOperDao.saveFuncOper(rfo);
	}
	
	
}
