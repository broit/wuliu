package com.broit.model.dto;

import java.math.BigDecimal;

import com.broit.model.PrdPrtReject;

public class PrdPrtRejectDto extends PrdPrtReject{
	
	private String name;
	
	private String planNo;
	
	private String code;
	
	private BigDecimal serial;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}

	public String getPlanNo() {
		return planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}