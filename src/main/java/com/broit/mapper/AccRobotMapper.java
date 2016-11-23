package com.broit.mapper;

import java.util.List;

import com.broit.model.AccRobot;
import com.broit.model.dto.AccRobotDto;

public interface AccRobotMapper<E> extends IBaseMapper<AccRobotDto> {
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
    
    List<AccRobot> selectByImmId(String id);
}