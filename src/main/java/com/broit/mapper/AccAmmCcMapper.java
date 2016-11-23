package com.broit.mapper;

import java.util.List;

import com.broit.model.AccAmmCc;
import com.broit.model.dto.AccAmmCcDto;

public interface AccAmmCcMapper<E> extends IBaseMapper<AccAmmCcDto> {
	
	List<AccAmmCc> selectId(String id);
	
	int serialCount(AccAmmCcDto record);
	
	AccAmmCc selectByAmmid(String ammid);
	
	AccAmmCcDto selectAccAmmeterByAmmid(String ammid);
}