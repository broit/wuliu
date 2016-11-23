package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdPrtSplit;

public interface PrdPrtSplitMapper extends IBaseMapper<PrdPrtSplit>{
 
	/**根据订单ID删除订单排产*/
	void deleteByOrderid(String orderid);
	
	/**批量插入订单排产产品*/
	void batchInsertSplitplan(List<PrdPrtSplit> list);
	
	/**根据产品ID删除订单产品排产*/
	void deleteByPrtid(String prtid);
	
	/**根据订单产品ID查询排产*/
	List<PrdPrtSplit> selectByOrderPrtid(String orderprtid);
}