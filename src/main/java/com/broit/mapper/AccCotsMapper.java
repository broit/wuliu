package com.broit.mapper;

import java.util.List;

import com.broit.model.AccCots;
import com.broit.model.dto.AccCotsDto;

public interface AccCotsMapper<E> extends IBaseMapper<AccCotsDto>{
	/**
     * 根据编码计数
     * */
    int countByNo(E entity);
    /**
     * 根据名称计数
     * @param entity
     * @return
     */
    int countByName(E entity);
    
    List<AccCots> selectByImmId(String id);
}