package com.broit.model.dto;

import java.math.BigDecimal;

import com.broit.model.PrdPrtMaterial;

public class PrdPrtMaterialDto extends PrdPrtMaterial{

	private String type;
	
	private String name;
	
	private BigDecimal stock;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}
}
