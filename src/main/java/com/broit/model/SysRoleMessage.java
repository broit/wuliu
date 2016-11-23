package com.broit.model;

import java.math.BigDecimal;

public class SysRoleMessage implements IBaseModel{
    private String id;

    private String roleid;

    private BigDecimal mtype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

	public BigDecimal getMtype() {
		return mtype;
	}

	public void setMtype(BigDecimal mtype) {
		this.mtype = mtype;
	}

}