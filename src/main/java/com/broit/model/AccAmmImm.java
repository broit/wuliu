package com.broit.model;

import java.math.BigDecimal;

public class AccAmmImm implements IBaseModel{
	
	private String id;
	
	private String ammid;
	
	private String immid;
	
	private BigDecimal rate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAmmid() {
		return ammid;
	}

	public void setAmmid(String ammid) {
		this.ammid = ammid;
	}

	public String getImmid() {
		return immid;
	}

	public void setImmid(String immid) {
		this.immid = immid;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}	
	
}