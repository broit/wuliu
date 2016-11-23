package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.SysFunc;
import com.broit.model.dto.SysFuncDto;

public interface SysFuncMapper<E> extends IBaseMapper<SysFuncDto> {
    
    /**查询表单数据*/
	SysFuncDto loadForm(@Param("funcUid")String funcUid);
    
    /**
     * 父功能列表
     * */
    List<SysFunc> parentList(@Param("funcUid")String funcUid);
    
    /**
     * 根据编码计数
     * */
    int countByCode(SysFunc entity);
}