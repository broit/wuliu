package com.broit.model;

import java.io.Serializable;

public class SysRolefunc implements Serializable,IBaseModel {
    private String rolefuncUid;

    private String rolefuncRoleid;

    private String rolefuncFuncid;
    
	private static final long serialVersionUID = 1L;

    public String getRolefuncUid() {
        return rolefuncUid;
    }

    public void setRolefuncUid(String rolefuncUid) {
        this.rolefuncUid = rolefuncUid == null ? null : rolefuncUid.trim();
    }

    public String getRolefuncRoleid() {
        return rolefuncRoleid;
    }

    public void setRolefuncRoleid(String rolefuncRoleid) {
        this.rolefuncRoleid = rolefuncRoleid == null ? null : rolefuncRoleid.trim();
    }

    public String getRolefuncFuncid() {
        return rolefuncFuncid;
    }

    public void setRolefuncFuncid(String rolefuncFuncid) {
        this.rolefuncFuncid = rolefuncFuncid == null ? null : rolefuncFuncid.trim();
    }

	@Override
	public String getId() {
		return this.rolefuncUid;
	}
}