package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.BaseBranch;
import com.broit.model.BaseTeam;
import com.broit.model.BaseWs;
import com.broit.model.SysParam;
import com.broit.model.SysUser;

public class SysUserDto  extends SysUser {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userroleRoleid;
	 
	 private String roleUid;
		 
	 private String funcUid;
	 
	 private String rolefuncFuncid;
	 
	 private BigDecimal funcLevel;
	 
	 private String funcParent;
	 
	 private String funcIserial;
	 
	 private String userroleUserid;
	 
	 private String userroleUid;
	 
	 private String jobName;
	 
	 private String branchName;
	 
	 private String wsName;
	 
	 private String teamName;
	 
	 private List<BaseBranch> branchList;
		
	 private List<BaseWs> wsList;
	 
	 private List<BaseTeam> teamList;
	 
	 private List<SysParam> jobList;

	public String getUserroleRoleid() {
		return userroleRoleid;
	}

	public void setUserroleRoleid(String userroleRoleid) {
		this.userroleRoleid = userroleRoleid;
	}

	public String getRoleUid() {
		return roleUid;
	}

	public void setRoleUid(String roleUid) {
		this.roleUid = roleUid;
	}

	public String getFuncUid() {
		return funcUid;
	}

	public void setFuncUid(String funcUid) {
		this.funcUid = funcUid;
	}

	public String getRolefuncFuncid() {
		return rolefuncFuncid;
	}

	public void setRolefuncFuncid(String rolefuncFuncid) {
		this.rolefuncFuncid = rolefuncFuncid;
	}

	public BigDecimal getFuncLevel() {
		return funcLevel;
	}

	public void setFuncLevel(BigDecimal funcLevel) {
		this.funcLevel = funcLevel;
	}

	public String getFuncParent() {
		return funcParent;
	}

	public void setFuncParent(String funcParent) {
		this.funcParent = funcParent;
	}

	public String getFuncIserial() {
		return funcIserial;
	}

	public void setFuncIserial(String funcIserial) {
		this.funcIserial = funcIserial;
	}

	public String getUserroleUserid() {
		return userroleUserid;
	}

	public void setUserroleUserid(String userroleUserid) {
		this.userroleUserid = userroleUserid;
	}

	public String getUserroleUid() {
		return userroleUid;
	}

	public void setUserroleUid(String userroleUid) {
		this.userroleUid = userroleUid;
	}

	public List<BaseBranch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<BaseBranch> branchList) {
		this.branchList = branchList;
	}

	public List<BaseWs> getWsList() {
		return wsList;
	}

	public void setWsList(List<BaseWs> wsList) {
		this.wsList = wsList;
	}

	public List<BaseTeam> getTeamList() {
		return teamList;
	}

	public void setTeamList(List<BaseTeam> teamList) {
		this.teamList = teamList;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getWsName() {
		return wsName;
	}

	public void setWsName(String wsName) {
		this.wsName = wsName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<SysParam> getJobList() {
		return jobList;
	}

	public void setJobList(List<SysParam> jobList) {
		this.jobList = jobList;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	 
}