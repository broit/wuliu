package com.broit.mapper;

import com.broit.model.PrdLineStatus;

public interface PrdLineStatusMapper extends IBaseMapper<PrdLineStatus>{
    
	/**根据生产线id删除*/
	public void deleteByLineId(String lineid);
}