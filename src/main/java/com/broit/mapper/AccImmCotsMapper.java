package com.broit.mapper;

import com.broit.model.AccImmCots;

public interface AccImmCotsMapper {
    int deleteByPrimaryKey(String id);

    int insert(AccImmCots record);

    int insertSelective(AccImmCots record);

    AccImmCots selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AccImmCots record);

    int updateByPrimaryKey(AccImmCots record);
    
    int deleteByImmid(String id);
}