package com.broit.bean;

import java.util.List;

import com.broit.model.dto.SysUserroleDto;

public class LoginUserBean{
	
	private String userId;
	
	private String userName;
	
	private String  job;
	
	private String code;//登录名
	
	private List<SysUserroleDto> role_uid;//角色ID
	
	public List<SysUserroleDto> getRole_uid() {
		return role_uid;
	}

	public void setRole_uid(List<SysUserroleDto> role_uid) {
		this.role_uid = role_uid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	/**级别*/
	private Integer rank;
	
	/**分公司*/
	private String branch;
	
	/**车间*/
	private String ws;
	
	/**班组*/
	private String team;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getWs() {
		return ws;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
}
