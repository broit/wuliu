package com.broit.mapper;

import com.broit.model.dto.AccRobotFaultDto;

public interface AccRobotFaultMapper<E> extends IBaseMapper<AccRobotFaultDto> {
	int deleteByRobotid(String id);
}