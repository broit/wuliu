package com.broit.mapper;

import java.util.List;

import com.broit.model.ServOrderPrt;

public interface ServOrderPrtMapper extends IBaseMapper<ServOrderPrt>{
	
	/**根据订单ID删除*/
	void deleteByOrderId(String orderid);
	
	/**
	 * 订单产品 - 批量插入
	 * */
	void batchInsertOrderProduct(List<ServOrderPrt> list);
	
	/**根据订单ID查询*/
	List<ServOrderPrt> selectByOrderId(String orderid);
}