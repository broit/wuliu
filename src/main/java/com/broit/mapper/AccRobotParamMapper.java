package com.broit.mapper;

import com.broit.model.AccRobotParam;

public interface AccRobotParamMapper {
    int deleteByPrimaryKey(String id);

    int insert(AccRobotParam record);

    int insertSelective(AccRobotParam record);

    AccRobotParam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AccRobotParam record);

    int updateByPrimaryKey(AccRobotParam record);
}