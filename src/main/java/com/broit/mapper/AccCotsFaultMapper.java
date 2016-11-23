package com.broit.mapper;

import com.broit.model.dto.AccCotsFaultDto;

public interface AccCotsFaultMapper<E> extends IBaseMapper<AccCotsFaultDto> {
	
	int deleteByCotid(String id);
}