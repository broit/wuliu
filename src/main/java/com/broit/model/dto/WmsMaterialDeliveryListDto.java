package com.broit.model.dto;

import java.util.List;

import com.broit.model.WmsMaterialDelivery;

   public class WmsMaterialDeliveryListDto extends WmsMaterialDelivery{ 

	private List<WmsMaterialDeliveryDto> list;	

	public List<WmsMaterialDeliveryDto> getList() {
		return list;
	}

	public void setList(List<WmsMaterialDeliveryDto> list) {
		this.list = list;
	}
	
}