package com.broit.model.dto;
import java.util.List;

import com.broit.model.WmsGoodsDelivery;

   public class WmsGoodsDeliveryListDto extends WmsGoodsDelivery{ 

	private List<WmsGoodsDeliveryDto> list;	

	public List<WmsGoodsDeliveryDto> getList() {
		return list;
	}

	public void setList(List<WmsGoodsDeliveryDto> list) {
		this.list = list;
	}
	
}