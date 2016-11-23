package com.broit.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.PrdPrtStatus;

public interface PrdPrtStatusMapper extends IBaseMapper<PrdPrtStatus>{
    
	/**
	 * 订单产品流程状态 - 批量插入
	 * */
	void batchInsertOrderPrtStatus(List<PrdPrtStatus> list);
	
	/**根据订单ID删除订单产品流程*/
	void deleteByOrderid(String orderid);
	
	/**根据订单产品ID删除订单产品流程*/
	void deleteByOrderPrtid(String prtid);
	
	/**
	 * 根据订单产品ID和状态删除订单产品流程
	 * @param orderprtid 订单产品ID
	 * @param status 流程状态
	 * */
	void deleteByOrderPrtidAndStatus(@Param("prtid")String prtid,@Param("status")BigDecimal status);
	
	/**根据订单ID查询订单流程状态*/
	List<PrdPrtStatus> selectByOrderid(String orderid);
}