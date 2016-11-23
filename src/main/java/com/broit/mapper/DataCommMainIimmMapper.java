package com.broit.mapper;

import java.util.List;

import com.broit.bean.PageBean;
import com.broit.model.dto.DataCommMainIimmDto;

public interface DataCommMainIimmMapper<E> extends IBaseMapper<DataCommMainIimmDto> {
    int deleteByImm(String id);

	List<DataCommMainIimmDto> selectListImmid(PageBean<DataCommMainIimmDto> page);
	
    int countListImmid(PageBean<DataCommMainIimmDto> page);
}