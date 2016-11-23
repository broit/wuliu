package com.broit.mapper;

import java.util.List;

import com.broit.model.AccAmmImm;

public interface AccAmmImmMapper<E> extends IBaseMapper<AccAmmImm> {
	
	int deleteByAmm(String id);
	
	List<AccAmmImm> immid(String id);
	
	int countAmmeter(String id);

}