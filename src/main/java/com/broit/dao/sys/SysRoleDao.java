package com.broit.dao.sys;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.broit.bean.PageBean;
import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysRoleMapper;
import com.broit.mapper.SysRoleMessageMapper;
import com.broit.mapper.SysRolefuncMapper;
import com.broit.mapper.SysRoleoperMapper;
import com.broit.mapper.SysUserroleMapper;
import com.broit.model.SysRole;
import com.broit.model.SysRoleMessage;
import com.broit.model.dto.SysRoleMessageDto;


@Repository
public class SysRoleDao extends AbstractCurdDao<SysRoleMapper<SysRole>,SysRole>{
	
	@Autowired
	private SysRoleMessageMapper<SysRoleMessageDto> roleMessageMapper;
	
	@Autowired
	private SysRoleoperMapper roleoperMapper;
	
	@Autowired
	private SysRolefuncMapper rolefuncMapper;
	
	@Autowired
	private SysUserroleMapper userroleMapper;
	
	Log log = LogFactory.getLog(this.getClass());
	
	@Override
	protected String validateSave(SysRole role){
		if(this.getMapper().countByName(role)>0){
			return "角色名称重复";
		}
		return null;
	}
	
	/**
	 * 消息类型
	 */
	public List<SysRoleMessage> roleMessageList(String id){
		List<SysRoleMessage> list=roleMessageMapper.roleMessageList(id);
		return  list;
		
	}
	
	protected void saveMethod(SysRole record){
		if(StringUtils.isEmpty(record.getId())){
			this.getMapper().insert(record);
			SysRoleMessageDto dto=new SysRoleMessageDto();
			dto.setRoleid(record.getRoleUid());
			roleMessageMapper.insert(dto);
		}else{
			this.getMapper().updateByPrimaryKey(record);
		}
	}

	public List<SysRoleMessageDto> SysRoleMessagelistPage(PageBean<SysRoleMessage> page){
		return roleMessageMapper.selectList(page);
	}
	/**
	 * 消息类型保存（处理多个mtype）
	 */
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public void RoleMessage(SysRoleMessageDto record) {		
		if(record.getWaring()!=null){
			record.setMtype(record.getWaring());
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message==null){//查询当前mtype的数量，无数据的话新建数据(根据角色ID和Mtype）
				roleMessageMapper.insert(record);
			}
		}else{
			BigDecimal mtype=new BigDecimal(11);
			record.setMtype(mtype);
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message!=null){//查询当前mtype的数量，有数据则删除
				roleMessageMapper.deleteMtype(record);
			}
		}
		if(record.getForecast()!=null){
			record.setMtype(record.getForecast());
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message==null){
				roleMessageMapper.insert(record);
			}
		}else{
			BigDecimal mtype=new BigDecimal(12);
			record.setMtype(mtype);
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message!=null){//查询当前mtype的数量，有数据则删除
				roleMessageMapper.deleteMtype(record);
			}
		}
		if(record.geteMessage()!=null){
			record.setMtype(record.geteMessage());
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message==null){
				roleMessageMapper.insert(record);
			}
		}else{
			BigDecimal mtype=new BigDecimal(21);
			record.setMtype(mtype);
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message!=null){//查询当前mtype的数量，有数据则删除
				roleMessageMapper.deleteMtype(record);
			}
		}
		if(record.getdMessage()!=null){
			record.setMtype(record.getdMessage());
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message==null){
				roleMessageMapper.insert(record);
			}
		}else{
			BigDecimal mtype=new BigDecimal(22);
			record.setMtype(mtype);
			SysRoleMessageDto message=roleMessageMapper.countMtype(record);
			if(message!=null){//查询当前mtype的数量，有数据则删除
				roleMessageMapper.deleteMtype(record);
			}
		}
		
		roleMessageMapper.deleteMtypeNull(record);// 删除该ID下mtype为空的数据
	}
	
	/**
	 * 根据用户ID 关联查训用户角色ID
	 * @param id
	 * @return
	 */
	public  SysRole roleUser(String id){
		SysRole roleUser=this.getMapper().roleUser(id);
		return  roleUser;
		
	}

	@Override
	protected void deleteMethod(String id) {
		this.getMapper().deleteByPrimaryKey(id);
		
		//删除关联记录
		
		roleoperMapper.deleteByRoleId(id);
		
		rolefuncMapper.deleteByRoleId(id);
		
		userroleMapper.deleteByRoleId(id);
		
		roleMessageMapper.deleteByRoleId(id);
	}
}
