package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdLineOwner;

public interface PrdLineOwnerMapper extends IBaseMapper<PrdLineOwner>{
    
	/**根据生产线id删除*/
	public void deleteByLineId(String lineid);
	
	/**生产线所属 - 批量插入 */
	public void batchInsertLineOwner(List<PrdLineOwner> list);
}