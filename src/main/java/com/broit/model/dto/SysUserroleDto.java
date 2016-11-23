package com.broit.model.dto;

import com.broit.model.SysUserrole;

public class SysUserroleDto  extends SysUserrole {

	private static final long serialVersionUID = 1L;

    
    private String roleUid;
    
    private String roleName;


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getRoleUid() {
		return roleUid;
	}


	public void setRoleUid(String roleUid) {
		this.roleUid = roleUid;
	}

}