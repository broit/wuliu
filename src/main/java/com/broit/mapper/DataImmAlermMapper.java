package com.broit.mapper;

import java.util.List;

import com.broit.model.DataImmAlerm;

public interface DataImmAlermMapper extends IBaseMapper<DataImmAlerm>{
    /**根据注塑机ID查询报警信息*/
    List<DataImmAlerm> selectByImmid(String immid);
}