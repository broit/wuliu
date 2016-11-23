package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.AccAmmeter;

public class AccAmmeterDto extends AccAmmeter {
	
	private List<AccAmmImmDto> list;//前台注塑机下拉框
	
	private List<AccAmmImmDto> accImm;//电表注塑机对照

	private String immid;
	
	private BigDecimal rate;
	
	private String ammid;
	
	private String immName;

	public String getImmName() {
		return immName;
	}

	public void setImmName(String immName) {
		this.immName = immName;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
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

	public List<AccAmmImmDto> getAccImm() {
		return accImm;
	}

	public void setAccImm(List<AccAmmImmDto> accImm) {
		this.accImm = accImm;
	}

	public List<AccAmmImmDto> getList() {
		return list;
	}

	public void setList(List<AccAmmImmDto> list) {
		this.list = list;
	}
	
}