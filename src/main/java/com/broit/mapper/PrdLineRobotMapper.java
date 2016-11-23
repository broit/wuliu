package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdLineRobot;

public interface PrdLineRobotMapper extends IBaseMapper<PrdLineRobot>{
	/**根据生产线id删除*/
	public void deleteByLineId(String lineid);
	
	/**生产线机械手 - 批量插入*/
	public void batchInsertLineRobot(List<PrdLineRobot> list);
}