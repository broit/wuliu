package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.AccImmEpower;

public class AccImmEpowerDto extends AccImmEpower{
	
	private String immName;
	
	private String ammName;	
	
	private BigDecimal sumEpower;
	
	private List<AccImmEpowerDto> AccImmEpower;
	
	public List<AccImmEpowerDto> getAccImmEpower() {
		return AccImmEpower;
	}
	public void setAccImmEpower(List<AccImmEpowerDto> accImmEpower) {
		AccImmEpower = accImmEpower;
	}
	public BigDecimal getSumEpower() {
		return sumEpower;
	}
	public void setSumEpower(BigDecimal sumEpower) {
		this.sumEpower = sumEpower;
	}
	public String getImmName() {
		return immName;
	}
	public void setImmName(String immName) {
		this.immName = immName;
	}
	public String getAmmName() {
		return ammName;
	}
	public void setAmmName(String ammName) {
		this.ammName = ammName;
	}
}