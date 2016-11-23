package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.AccAmmCc;

public class AccAmmCcDto extends AccAmmCc {

	private String ammName;
	
	private List<AccImmEpowerDto> AccImmEpower;
	
	
	private BigDecimal initemn;
	
	public BigDecimal getInitemn() {
		return initemn;
	}
	public void setInitemn(BigDecimal initemn) {
		this.initemn = initemn;
	}
	public List<AccImmEpowerDto> getAccImmEpower() {
		return AccImmEpower;
	}
	public void setAccImmEpower(List<AccImmEpowerDto> accImmEpower) {
		AccImmEpower = accImmEpower;
	}

	public String getAmmName() {
		return ammName;
	}

	public void setAmmName(String ammName) {
		this.ammName = ammName;
	}
	
	
	
}