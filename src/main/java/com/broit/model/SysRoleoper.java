package com.broit.model;

import java.io.Serializable;

public class SysRoleoper implements Serializable,IBaseModel {
    private String roleoperUid;

    private String roleoperRoleid;

    private String roleoperOperid;

    private static final long serialVersionUID = 1L;

    public String getRoleoperUid() {
        return roleoperUid;
    }

    public void setRoleoperUid(String roleoperUid) {
        this.roleoperUid = roleoperUid == null ? null : roleoperUid.trim();
    }

    public String getRoleoperRoleid() {
        return roleoperRoleid;
    }

    public void setRoleoperRoleid(String roleoperRoleid) {
        this.roleoperRoleid = roleoperRoleid == null ? null : roleoperRoleid.trim();
    }

    public String getRoleoperOperid() {
        return roleoperOperid;
    }

    public void setRoleoperOperid(String roleoperOperid) {
        this.roleoperOperid = roleoperOperid == null ? null : roleoperOperid.trim();
    }

	@Override
	public String getId() {
		return this.roleoperUid;
	}
}