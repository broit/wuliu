package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdLineCots;

public interface PrdLineCotsMapper extends IBaseMapper<PrdLineCots>{
	
	/**根据生产线id删除*/
	public void deleteByLineId(String lineid);
	
	/**生产线检测设备 - 批量插入*/
	public void batchInsertLineCots(List<PrdLineCots> list);
}