package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdLinePart;

public interface PrdLinePartMapper extends IBaseMapper<PrdLinePart>{
	
	/**根据生产线id删除*/
	public void deleteByLineId(String lineid);
	
	/**构成 生产线 - 批量插入*/
	public void batchInsertLinePart(List<PrdLinePart> list);
	
	/**把构成生产线恢复为单生产线*/
	public void recoverPartToSignle(String lineid);
	
	/**把单生产线改为构成生产线*/
	public void updateSignleToPart(String lineid);
}