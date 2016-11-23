package com.broit.mapper;

import com.broit.model.ServOrderPrtQuality;

public interface ServOrderPrtQualityMapper extends IBaseMapper<ServOrderPrtQuality>{
	
    /**根据订单ID删除订单产品品质标准*/
	void deleteOrderPrtQuality(String id);
}