package com.broit.mapper;

import com.broit.model.SysOper;

public interface SysOperMapper<E> extends IBaseMapper<SysOper>{
    
    /**
     * 根据编码计数
     * */
    int countByCode(E entity);
}