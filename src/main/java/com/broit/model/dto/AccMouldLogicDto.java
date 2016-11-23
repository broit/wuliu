package com.broit.model.dto;

import java.math.BigDecimal;

import com.broit.model.AccMouldLogic;

public class AccMouldLogicDto extends AccMouldLogic{
	
	private String gName;
	
	private String gCode;
	
	private BigDecimal gNum;
	
	private String pName;
	
	private String prtid;
	
	private String lgid;
	
	private String lid;

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getLgid() {
		return lgid;
	}

	public void setLgid(String lgid) {
		this.lgid = lgid;
	}

	public String getPrtid() {
		return prtid;
	}

	public void setPrtid(String prtid) {
		this.prtid = prtid;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgCode() {
		return gCode;
	}

	public void setgCode(String gCode) {
		this.gCode = gCode;
	}

	public BigDecimal getgNum() {
		return gNum;
	}

	public void setgNum(BigDecimal gNum) {
		this.gNum = gNum;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
}