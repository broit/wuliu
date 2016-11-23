package com.broit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MobileTracebackMapper {
	
	public List<Map<String,Object>> getCycledata(@Param("planid")String planid,@Param("cycledate")String cycledate,@Param("serial")long serial);//查询工艺参数
	
	public List<Map<String,Object>> getPrtInfo(@Param("planid")String planid);//获取产品信息
	
	public List<Map<String,Object>> getPrdInfo(@Param("planid")String planid);//获取生产信息
	
}