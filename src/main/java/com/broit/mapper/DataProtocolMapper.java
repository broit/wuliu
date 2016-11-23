package com.broit.mapper;

import java.util.List;

import com.broit.model.DataProtocol;

public interface DataProtocolMapper<E> extends IBaseMapper<DataProtocol> {

	int name(DataProtocol record);
	
	int code(DataProtocol record);
	
	List<DataProtocol> selectList();
}