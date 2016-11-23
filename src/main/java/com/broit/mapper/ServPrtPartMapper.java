package com.broit.mapper;

import com.broit.model.ServPrtPart;

public interface ServPrtPartMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServPrtPart record);

    int insertSelective(ServPrtPart record);

    ServPrtPart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServPrtPart record);

    int updateByPrimaryKey(ServPrtPart record);
}