package com.broit.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.broit.bean.AuthBean;
import com.broit.bean.LoginUserBean;
import com.broit.bean.PageBean;

import com.broit.dao.sys.SysRoleDao;
import com.broit.dao.sys.SysUserDao;
import com.broit.dao.sys.SysUserroleDao;
import com.broit.mapper.SysUserroleMapper;
import com.broit.model.BaseCo;
import com.broit.model.SysParam;
import com.broit.model.SysRoleMessage;
import com.broit.model.SysUser;
import com.broit.model.dto.SysRoleMessageDto;
import com.broit.model.dto.SysUserroleDto;
import com.broit.model.dto.UserLevelDto;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

@Controller
@Scope("prototype")
@RequestMapping(value="/")
public class LoginController {

	Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private SysUserDao userDao;
	
	@Resource
	private SysUserroleDao sysUserroleDao;
	

	
	@Resource
	private SysRoleDao sysRoleDao;
	
	@Autowired
	private SysUserroleMapper userroleMapper;
	
	/**转到主界面*/
	@RequestMapping(value={"/toMain"},method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView toMain(HttpServletRequest request,String code,String password,SessionScope scope){
		ModelAndView mav = new ModelAndView("main.jsp");
		AuthBean auth = null;
		try{
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60*60*2);
			LoginUserBean loginUserBean =(LoginUserBean)session.getAttribute("loginUser");
//			BaseCo BaseCo =(BaseCo)session.getAttribute("BaseCo");

			auth =  userDao.selecUserAuth(loginUserBean.getUserId());
			auth.setSuccess(true);
			JSON json = JSONSerializer.toJSON(auth);
		
		
			List<SysRoleMessageDto> sysRoleMessage = new ArrayList<SysRoleMessageDto>();
			PageBean<SysRoleMessage> page=new PageBean<SysRoleMessage>();
			SysRoleMessage roleMessage= new SysRoleMessage();
			for(SysUserroleDto fo:loginUserBean.getRole_uid()){//循环角色权限id
				roleMessage.setRoleid(fo.getRoleUid());
				page.setParam(roleMessage);
				sysRoleMessage=sysRoleDao.SysRoleMessagelistPage(page);
				JSON message =JSONSerializer.toJSON(sysRoleMessage);
				mav.addObject("message",message);
			}
			mav.addObject("auth",json);
			

		}catch(Exception e){
			log.error(e);
			e.printStackTrace();
			auth = new AuthBean();
			auth.setSuccess(false);
			auth.setErrorMessage(e.getMessage());
		}
		return mav;
	}
	  
	/**登陆页面 */
	@RequestMapping(value={"/welcome"},method = RequestMethod.GET)
	public ModelAndView toMai(HttpServletRequest request){
		ModelAndView mav = new ModelAndView("login.jsp");
	
		return mav;
	}
		
	/**
	 * 登陆页面提交验证
	 */
	@RequestMapping(value={"/login"},method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> toView(HttpServletRequest request,String code,String password,SessionScope scope){
		HttpSession session = request.getSession();
		Map<String,Object> result = new HashMap<String, Object>();
		
		try{
			SysUser sysUser= userDao.adminLogin(code,password);	//验证用户名密码
			List<SysUserroleDto> foList = userroleMapper.userRoleList(sysUser.getId());//查询用户角色
			LoginUserBean user = new LoginUserBean();
			user.setUserId(sysUser.getId());
			user.setCode(sysUser.getCode());
			user.setRole_uid(foList);
			user.setUserName(sysUser.getName());
			user.setRank(sysUser.getRank());
			user.setJob(sysUser.getJob());
			user.setBranch(sysUser.getBranch());
			user.setWs(sysUser.getWs());
			user.setTeam(sysUser.getTeam());
			session.setAttribute("loginUser",user);
			
			result.put("success", true);
			log.info("登陆信息:name:::"+code);
		}catch(Exception e){
			result.put("success", false);
			result.put("msg",e.getMessage());
		}
		return result;
	}
	/**
	 * 退出登陆
	 */
	@RequestMapping(value={"/exit"},method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView exit(HttpServletRequest request){
		HttpSession session = request.getSession();
		
		session.removeAttribute("loginUser");
		ModelAndView mav = new ModelAndView("login.jsp");
		return mav;
	}
	
	@RequestMapping(value={"/modify"},method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> modify(HttpServletRequest request,String oldpassword,String password,SessionScope scope){
		HttpSession session = request.getSession();
		Map<String,Object> result = new HashMap<String, Object>();
		
		LoginUserBean user = (LoginUserBean)session.getAttribute("loginUser");
		
		try{
			userDao.adminLogin(user.getCode(),oldpassword);	//验证用户名密码
			userDao.modify(user.getUserId(), password);//修改密码
			
			result.put("success", true);
			log.info("修改成功:name:::"+user.getCode());
		}catch(Exception e){
			result.put("success", false);
			result.put("msg",e.getMessage());
		}
		return result;
	}
	
	
}
