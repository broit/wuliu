package com.broit.mapper;


import java.util.List;

import com.broit.model.dto.DataImmParamcodeDto;

public interface DataImmParamcodeMapper<E> extends IBaseMapper<DataImmParamcodeDto>{

	void beOrdisAble(DataImmParamcodeDto dto);
	
	int name(DataImmParamcodeDto dto);
	
	int paramcode(DataImmParamcodeDto dto);
	
	List<DataImmParamcodeDto> selectParamcodeList();
	
}