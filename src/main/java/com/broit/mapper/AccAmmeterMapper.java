package com.broit.mapper;

import com.broit.model.dto.AccAmmeterDto;

public interface AccAmmeterMapper<E> extends IBaseMapper<AccAmmeterDto> {
	
	AccAmmeterDto selectByAccImm(String id);//电表、注塑机对应表
	
    int validateName(AccAmmeterDto AccAmmeterDto);//名称验证
    
    int validateNo(AccAmmeterDto AccAmmeterDto);//编号验证
	
}