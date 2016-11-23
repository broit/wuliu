package com.broit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysRole implements Serializable,IBaseModel {
    private String roleUid;

    private String roleName;

    private Date roleCreatedate;

    private String roleRemark;
    
    private BigDecimal roleComp;
    
    private static final long serialVersionUID = 1L;
    
    public String getRoleUid() {
        return roleUid;
    }

    public void setRoleUid(String roleUid) {
        this.roleUid = roleUid == null ? null : roleUid.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getRoleCreatedate() {
        return roleCreatedate;
    }

    public void setRoleCreatedate(Date roleCreatedate) {
        this.roleCreatedate = roleCreatedate;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark == null ? null : roleRemark.trim();
    }

    public BigDecimal getRoleComp() {
        return roleComp;
    }

    public void setRoleComp(BigDecimal roleComp) {
        this.roleComp = roleComp;
    }

	@Override
	public String getId() {
		return this.roleUid;
	}
}