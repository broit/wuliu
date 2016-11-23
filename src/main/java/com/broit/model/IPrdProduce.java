package com.broit.model;

import java.math.BigDecimal;

/**
 * 直接排产接口
 * */
public interface IPrdProduce {

	/**主键ID*/
	public String getId();
	
	/**产品ID*/
	public String getPrtid();
	
	/**生产数量*/
	public BigDecimal getProducenum();
}
