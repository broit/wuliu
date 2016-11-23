package com.broit.model.dto;

import com.broit.model.ServOrderPrt;

public class ServOrderPrtDto extends ServOrderPrt{

	/**产品名称*/
	private String name;
	
	/**库存*/
	private Long stock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}
}
