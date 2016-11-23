package com.broit.model;

import java.io.Serializable;

public class SysUserrole implements Serializable,IBaseModel {
    private String userroleUid;

    private String userroleUserid;

    private String userroleRoleid;


	private static final long serialVersionUID = 1L;

    public String getUserroleUid() {
        return userroleUid;
    }

    public void setUserroleUid(String userroleUid) {
        this.userroleUid = userroleUid == null ? null : userroleUid.trim();
    }

    public String getUserroleUserid() {
        return userroleUserid;
    }

    public void setUserroleUserid(String userroleUserid) {
        this.userroleUserid = userroleUserid == null ? null : userroleUserid.trim();
    }

    public String getUserroleRoleid() {
        return userroleRoleid;
    }

    public void setUserroleRoleid(String userroleRoleid) {
        this.userroleRoleid = userroleRoleid == null ? null : userroleRoleid.trim();
    }

	@Override
	public String getId() {
		return this.userroleUid;
	}

}