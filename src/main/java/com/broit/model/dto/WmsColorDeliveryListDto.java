package com.broit.model.dto;
import java.util.List;

import com.broit.model.WmsColorDelivery;

   public class WmsColorDeliveryListDto extends WmsColorDelivery{ 

	private List<WmsColorDeliveryDto> list;	

	public List<WmsColorDeliveryDto> getList() {
		return list;
	}

	public void setList(List<WmsColorDeliveryDto> list) {
		this.list = list;
	}
	
}