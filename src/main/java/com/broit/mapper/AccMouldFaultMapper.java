package com.broit.mapper;

import com.broit.model.dto.AccMouldFaultDto;

public interface AccMouldFaultMapper<E> extends IBaseMapper<AccMouldFaultDto>{

	int deleteByMouldid(String id);
}