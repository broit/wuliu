package com.broit.mapper;

import java.util.List;

import com.broit.bean.PageBean;
import com.broit.model.PrdPrtReject;
import com.broit.model.dto.PrdPrtRejectDto;

public interface PrdPrtRejectMapper<E>  extends IBaseMapper<PrdPrtReject>{

	List<PrdPrtRejectDto> typeList(PageBean<PrdPrtRejectDto> page);
	
	int countTypeList(PageBean<PrdPrtRejectDto> page);
	
	int typeName(E entity);
	
	PrdPrtReject rejectCount(String planid);
	
}