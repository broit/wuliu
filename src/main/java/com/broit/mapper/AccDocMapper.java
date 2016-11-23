package com.broit.mapper;

import com.broit.model.dto.AccDocArchiveDto;
import com.broit.model.dto.AccDocDto;

public interface AccDocMapper<E>  extends IBaseMapper<AccDocDto>{

	int insert(AccDocArchiveDto record);
	
	int deleteByPrefid(String id);
}