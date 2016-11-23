package com.broit.mapper;

import com.broit.model.AccImmMould;

public interface AccImmMouldMapper extends IBaseMapper<AccImmMould>{
    int deleteByPrimaryKey(String id);

    int insert(AccImmMould record);

    int insertSelective(AccImmMould record);

    AccImmMould selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AccImmMould record);

    int updateByPrimaryKey(AccImmMould record);
    
    int deleteByImmid(String id);
}