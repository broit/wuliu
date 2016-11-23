package com.broit.mapper;

import com.broit.model.dto.AccDocArchiveDto;

public interface AccDocArchiveMapper<E>  extends IBaseMapper<AccDocArchiveDto>{
	
	int deleteByDocid(String id);
	
}