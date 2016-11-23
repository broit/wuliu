package com.broit.model;

import java.math.BigDecimal;

public class AccImmEpower implements IBaseModel{
	
	private String id;
	
	private String ccid;
	
	private String immid;
	
	private BigDecimal epower;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCcid() {
		return ccid;
	}

	public void setCcid(String ccid) {
		this.ccid = ccid;
	}

	public String getImmid() {
		return immid;
	}

	public void setImmid(String immid) {
		this.immid = immid;
	}

	public BigDecimal getEpower() {
		return epower;
	}

	public void setEpower(BigDecimal epower) {
		this.epower = epower;
	}	
	
}