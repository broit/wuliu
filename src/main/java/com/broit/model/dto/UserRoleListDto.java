package com.broit.model.dto;

import java.util.List;

import com.broit.model.SysUserrole;

public class UserRoleListDto {

	private String userId;
	
	private List<SysUserrole> list;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<SysUserrole> getList() {
		return list;
	}

	public void setList(List<SysUserrole> list) {
		this.list = list;
	}
}
