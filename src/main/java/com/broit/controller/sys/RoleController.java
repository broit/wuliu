package com.broit.controller.sys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.broit.bean.FormResultBean;
import com.broit.bean.TreeNodeBean;
import com.broit.controller.BaseController;
import com.broit.dao.sys.SysRoleDao;
import com.broit.dao.sys.SysRolefuncDao;
import com.broit.model.SysRole;
import com.broit.model.SysRoleMessage;
import com.broit.model.dto.RoleFuncOperListDto;
import com.broit.model.dto.SysRoleMessageDto;

@Controller
@Scope("prototype")
@RequestMapping(value="/role")
public class RoleController extends BaseController<SysRoleDao,SysRole>{

	Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private SysRolefuncDao roleFuncDao;
	
	
	/**角色功能*/
	@RequestMapping(value={"/roleFunc/{id}"},method = RequestMethod.GET)
	@ResponseBody
	public FormResultBean<List<TreeNodeBean>> roleFuncList(@PathVariable String id){
		return roleFuncDao.roleFuncList(id);
	}
	
	/**保存角色功能操作*/
	@RequestMapping(value={"/roleFuncOper"},method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> saveRoleFuncOper(RoleFuncOperListDto rfo){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			roleFuncDao.saveRoleFuncOper(rfo);
			result.put("success", true);
		}catch(Exception e){
			log.error(e);
			result.put("success", false);
			result.put("errorMsg", e.getMessage());
		}
		return result;
	}
	
	/**消息类型*/
	@RequestMapping(value={"/RoleMessage/{id}"},method = RequestMethod.GET)
	@ResponseBody
	public FormResultBean<List<SysRoleMessage>> roleMessageList(@PathVariable String id){
		FormResultBean<List<SysRoleMessage>> result = new FormResultBean<List<SysRoleMessage>>();
		try{
			result.setData(this.getDao().roleMessageList(id));
			result.setSuccess(true);
		}catch(Exception e){
			result.setErrorMessage(e.getMessage());
			log.error(e);
		}
		return result;
	}
	/**消息类型保存方法*/
	@RequestMapping(value={"/RoleMessage"},method = RequestMethod.POST)
	@ResponseBody
	protected Map<String,Object> RoleMessage(SysRoleMessageDto record){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("success", false);
		try{
			this.getDao().RoleMessage(record);
			result.put("success", true);
		}catch(Exception e){
			log.error(e);
			e.printStackTrace();
			result.put("msg", e.getMessage());
		}
		return result;
	}
}
