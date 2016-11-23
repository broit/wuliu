package com.broit.mapper;

import com.broit.model.SysSet;

public interface SysSetMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysSet record);

    int insertSelective(SysSet record);

    SysSet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSet record);

    int updateByPrimaryKey(SysSet record);
}