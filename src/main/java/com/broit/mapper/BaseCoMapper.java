package com.broit.mapper;

import com.broit.model.BaseCo;

public interface BaseCoMapper<E> extends IBaseMapper<BaseCo> {
	
	BaseCo select();
	
}