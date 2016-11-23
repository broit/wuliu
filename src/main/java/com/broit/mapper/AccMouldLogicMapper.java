package com.broit.mapper;

import com.broit.model.AccMouldLogic;

public interface AccMouldLogicMapper<E> extends IBaseMapper<AccMouldLogic> {
	
	void deleteMould(String id);

}