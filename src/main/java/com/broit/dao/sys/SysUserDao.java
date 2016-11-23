package com.broit.dao.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.broit.bean.AuthBean;
import com.broit.bean.TreeNodeBean;
import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysUserMapper;
import com.broit.mapper.SysUserroleMapper;
import com.broit.model.BaseTeam;
import com.broit.model.SysUser;
import com.broit.model.dto.SysRolefuncDto;
import com.broit.util.MD5;

@Repository
public class SysUserDao extends AbstractCurdDao<SysUserMapper,SysUser>{
	
	@Autowired
	private SysUserroleMapper userRoleMapper;

	Log log = LogFactory.getLog(SysUserDao.class);
	
	/**
	 * 是不是系统管理员
	 * @param uid
	 * @return
	 */
	public String isSysManager(String id){
		String admin = "0";
		try {
			Integer isSysManager= this.getMapper().isSysManager(id);
			if(isSysManager!=0){
				admin = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admin;
	}
	
	/**
	 * 根据用户ID查用户列表
	 * @param userUid
	 * @return
	 */
	public SysUser selectByPrimaryKey(String id){
		SysUser user = this.getMapper().loadForm(id);
		user.setPassword(null);
		return user;
	}
	
	/**
	 * 保存用户信息
	 * */
	public void saveMethod(SysUser user){
		if(StringUtils.isEmpty(user.getId())){
			user.setPassword(MD5.encoding(user.getPassword()));
			user.setStatus("1");
			this.getMapper().insert(user);
		}else{
			//比较密码
			String oldpwd = this.getMapper().selectByPrimaryKey(user.getId()).getPassword();
			if(StringUtils.isNotEmpty(user.getPassword())){
				String curpwd = MD5.encoding(user.getPassword());
				if(!curpwd.equals(oldpwd)){
					user.setPassword(curpwd);
				}
			}else{
				user.setPassword(oldpwd);
			}
			this.getMapper().updateByPrimaryKey(user);
		}
	}
	
	/**
	 * 用户登录名不能重复添加验证
	 * @param bean
	 * @return
	 */
	protected String validateSave(SysUser bean){
		if(this.getMapper().validateUserCode(bean)>0){
			return "用户登录名重复";
		}
		return null;
	}
	
	/**查询用户权限*/
	public AuthBean selecUserAuth(String userid){
		List<String> roleIdList = userRoleMapper.queryUserRole(userid);
		if(roleIdList.isEmpty()){
			throw new RuntimeException("用户没有分配权限,无法登录");
		}
		AuthBean auth = new AuthBean();
		List<SysRolefuncDto> funcOperList = this.getMapper().selectFuncOper(roleIdList);
		List<TreeNodeBean> funcTree = this.funcTree(funcOperList);
		Map<String,List<String>> operMap = this.operMap(funcOperList);
		auth.setFuncTree(funcTree);
		auth.setOperMap(operMap);
		return auth;
	}
	
	/**根据车间id查询班组*/
	public List<BaseTeam> selectTeamByWsid(String wsid){
		return this.getMapper().selectTeamByWsid(wsid);
	}
	
	/**功能树*/
	private List<TreeNodeBean> funcTree(List<SysRolefuncDto> funcOperList){
		TreeNodeBean root = new TreeNodeBean();
		root.setText("根节点");
		Map<String,TreeNodeBean> treeMap = new HashMap<String,TreeNodeBean>();
		treeMap.put("root", root);
		//构建功能树
		for(SysRolefuncDto rf : funcOperList){
			if("func".equals(rf.getFuncType())){
				String parent = rf.getFuncParent();
				TreeNodeBean parentNode = treeMap.get(parent);
				TreeNodeBean node = new TreeNodeBean();
				node.setText(rf.getFuncName());
				node.setView(rf.getFuncUrl());
				node.setCode(rf.getFuncCode());
				node.setRouteId(rf.getFuncUid());
				node.setIconCls("x-fa "+rf.getFuncImg());
				parentNode.addChildren(node);
				treeMap.put(rf.getFuncUid(), node);
			}
		}
		return root.getChildren();
	}
	
	/**操作权限*/
	private Map<String,List<String>> operMap(List<SysRolefuncDto> funcOperList){
		Map<String,List<String>> authMap = new HashMap<String,List<String>>();
		//构建权限
		for(SysRolefuncDto rf : funcOperList){
			if("func".equals(rf.getFuncType())){
				String funcCode = rf.getFuncCode();
				if(authMap.get(funcCode)==null){
					List<String> operList = new ArrayList<String>();
					authMap.put(funcCode, operList);
				}
			}else if("oper".equals(rf.getFuncType())){
				String funcCode = rf.getFuncParent();
				List<String> operList = authMap.get(funcCode);
				if(operList!=null){
					operList.add(rf.getFuncCode());
				}
			}
		}
		return authMap;
	}
	
	/**启用或者禁用用户*/
	public void beOrdisAble(SysUser user){
		this.getMapper().beOrdisAble(user);
	}
	
	/**
	 * 查询班组下的成员
	 * @param teamid 班组ID
	 * */
	public List<SysUser> selectUserByTeamid(String teamid){
		return this.getMapper().selectUserByTeamid(teamid);
	}
	
	/**
	 * 登陆
	 * @param code  登录名
	 * @param password 密码
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public SysUser adminLogin(String code, String password) throws Exception {
		SysUser sysUser = new SysUser();
		
		sysUser = this.getMapper().userPassword(code);//根据用户名查询密码
		
		if(sysUser==null){
			throw new Exception("该用户不存在！");
		}
		
		//加入超级密码的验证
		String pass = sysUser.getPassword();
		String genPass = MD5.encoding(pass);
		
		String PARAM_MD5 = MD5.encoding(password);
		
		if(PARAM_MD5.toUpperCase().equals(genPass.toUpperCase())||(pass!=null&&pass.toUpperCase().equals(PARAM_MD5.toUpperCase()))){
             if(sysUser.getStatus().equals("1")){
            	 log.info( "登录成功, "+"用户名["+code+"]用户登录，成功！");
             }else{
            	 throw new Exception("该用户已被禁用，请联系管理员！");
             }
		}else{
			throw new Exception("密码错误");
		}
		
		return sysUser;
	}
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public SysUser modify(String id, String password) throws Exception {
		SysUser sysUser = new SysUser();
		
		String genPass = MD5.encoding(password);
		this.getMapper().modify(id,genPass);
		
		
		return sysUser;
	}
	
	
}
