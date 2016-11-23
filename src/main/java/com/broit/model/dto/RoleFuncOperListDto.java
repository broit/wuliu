package com.broit.model.dto;

import java.util.List;

import com.broit.model.SysRolefunc;
import com.broit.model.SysRoleoper;

public class RoleFuncOperListDto {

	private String roleUid;
	
	private List<SysRolefunc> rfList;
	
	private List<SysRoleoper> roList;

	public String getRoleUid() {
		return roleUid;
	}

	public void setRoleUid(String roleUid) {
		this.roleUid = roleUid;
	}

	public List<SysRolefunc> getRfList() {
		return rfList;
	}

	public void setRfList(List<SysRolefunc> rfList) {
		this.rfList = rfList;
	}

	public List<SysRoleoper> getRoList() {
		return roList;
	}

	public void setRoList(List<SysRoleoper> roList) {
		this.roList = roList;
	}
}
