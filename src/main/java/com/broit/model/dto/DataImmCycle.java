package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.Date;

public class DataImmCycle {

	private String paramcode;
	
	private BigDecimal value;
	
	private Date cycletime;

	public String getParamcode() {
		return paramcode;
	}

	public void setParamcode(String paramcode) {
		this.paramcode = paramcode;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Date getCycletime() {
		return cycletime;
	}

	public void setCycletime(Date cycletime) {
		this.cycletime = cycletime;
	}
}
