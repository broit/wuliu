package com.broit.mapper;

import com.broit.model.AccMouldPrt;

public interface AccMouldPrtMapper<E>  extends IBaseMapper<AccMouldPrt>{
	
	void deleteByMould(String id);
	
}