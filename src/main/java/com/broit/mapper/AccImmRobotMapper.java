package com.broit.mapper;

import com.broit.model.AccImmRobot;

public interface AccImmRobotMapper {
    int deleteByPrimaryKey(String id);

    int insert(AccImmRobot record);

    int insertSelective(AccImmRobot record);

    AccImmRobot selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AccImmRobot record);

    int updateByPrimaryKey(AccImmRobot record);
    
    int deleteByImmid(String id);
}