package com.broit.mapper;

import com.broit.model.DataProtocolParam;
import com.broit.model.dto.DataProtocolParamDto;

public interface DataProtocolParamMapper<E> extends IBaseMapper<DataProtocolParamDto> {

	DataProtocolParamDto code(String protocolcode);
	
	int deleteByProtocolcode(String protocolcode);
	
	int paramtocken(DataProtocolParam record);
	
	int paramcode(DataProtocolParam record);
}