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

import com.broit.bean.AuthBean;
import com.broit.bean.FormResultBean;
import com.broit.bean.TreeNodeBean;
import com.broit.controller.BaseController;
import com.broit.dao.sys.SysUserDao;
import com.broit.dao.sys.SysUserroleDao;
import com.broit.model.BaseTeam;
import com.broit.model.SysUser;
import com.broit.model.dto.UserRoleListDto;

@Controller
@Scope("prototype")
@RequestMapping(value="/user")
public class UserController extends BaseController<SysUserDao,SysUser>{

	Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private SysUserroleDao userRoleDao;
	
	/**查询用户角色*/
	@RequestMapping(value={"/userRole/{id}"},method = RequestMethod.GET)
	@ResponseBody
	public FormResultBean<List<TreeNodeBean>> userRoleList(@PathVariable String id){
		return userRoleDao.userRoleList(id);
	}
	
	/**保存用户角色*/
	@RequestMapping(value={"/userRole"},method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> saveUserRole(UserRoleListDto ur){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			userRoleDao.saveUserRole(ur);
			result.put("success", true);
		}catch(Exception e){
			log.error(e);
			result.put("success", false);
			result.put("errorMsg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping(value={"/userAuth"},method = RequestMethod.GET)
	@ResponseBody
	public AuthBean userAuth(){
		String userid = this.loginBean == null?"2EB3154A30B858AAE055000000000001":this.loginBean.getUserId();
		AuthBean auth = null;
		try{
			auth =  this.getDao().selecUserAuth(userid);
			auth.setSuccess(true);
		}catch(Exception e){
			log.error(e);
			auth = new AuthBean();
			auth.setSuccess(false);
			auth.setErrorMessage(e.getMessage());
		}
		return auth;
	}
	
	@RequestMapping(value={"/teamList"},method = RequestMethod.GET)
	@ResponseBody
	public List<BaseTeam> selectTeamByWsid(String wsid){
		return this.getDao().selectTeamByWsid(wsid);
	}
	
	@RequestMapping(value={"/teamUserList"},method = RequestMethod.GET)
	@ResponseBody
	public List<SysUser> selectUserByTeamid(String teamid){
		return this.getDao().selectUserByTeamid(teamid);
	}

	/**启用或者禁用用户*/
	@RequestMapping(value={"/enable","disable"},method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> beOrdisAble(SysUser user){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			this.getDao().beOrdisAble(user);
			result.put("success", true);
		}catch(Exception e){
			log.error(e);
			result.put("success", false);
			result.put("errorMsg", e.getMessage());
		}
		return result;
	}
}
