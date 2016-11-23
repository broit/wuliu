package com.broit.model.dto;

import java.math.BigDecimal;

import com.broit.model.SysRoleMessage;

public class SysRoleMessageDto extends SysRoleMessage{
	
	private String roleMid;
	
	private String roleUid;
	
	private String roleName;
	
	private BigDecimal waring;
	
	private BigDecimal forecast;
	
	private BigDecimal eMessage;
	 
	private BigDecimal dMessage;
 

	public BigDecimal getWaring() {
		return waring;
	}

	public void setWaring(BigDecimal waring) {
		this.waring = waring;
	}

	public BigDecimal getForecast() {
		return forecast;
	}

	public void setForecast(BigDecimal forecast) {
		this.forecast = forecast;
	}

	public BigDecimal geteMessage() {
		return eMessage;
	}

	public void seteMessage(BigDecimal eMessage) {
		this.eMessage = eMessage;
	}

	public BigDecimal getdMessage() {
		return dMessage;
	}

	public void setdMessage(BigDecimal dMessage) {
		this.dMessage = dMessage;
	}

	public String getRoleMid() {
		return roleMid;
	}

	public void setRoleMid(String roleMid) {
		this.roleMid = roleMid;
	}

	public String getRoleUid() {
		return roleUid;
	}

	public void setRoleUid(String roleUid) {
		this.roleUid = roleUid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}