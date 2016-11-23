package com.broit.mapper;

import java.util.List;

import com.broit.model.ServOrder;
import com.broit.model.ServOrderPrt;
import com.broit.model.dto.ServOrderDto;

public interface ServOrderMapper extends IBaseMapper<ServOrderDto>{
	
	/**查询表单内容*/
	ServOrderDto loadInfo(String id);
	
	/**已下单的订单*/
	List<ServOrder> orderedOrder();
	
	List<ServOrderDto>orderList(String goodsId);
	
	List<ServOrderPrt>orderPrtList(String no);
}