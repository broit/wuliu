package com.broit.mapper;

import com.broit.model.dto.AccImmFaultDto;

public interface AccImmFaultMapper<E> extends IBaseMapper<AccImmFaultDto> {
	
	int deleteByImmid(String id);
}