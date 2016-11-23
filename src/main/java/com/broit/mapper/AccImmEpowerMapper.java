package com.broit.mapper;

import java.util.List;

import com.broit.bean.PageBean;
import com.broit.model.AccImmEpower;
import com.broit.model.dto.AccImmEpowerDto;

public interface AccImmEpowerMapper<E> extends IBaseMapper<AccImmEpowerDto> {
	
	/**分页列表*/
	List<AccImmEpowerDto> selectListCcid(PageBean<AccImmEpowerDto> page);
	
	/**功能列表计数*/
    int countListCcid(PageBean<AccImmEpowerDto> page);
    
	int updateByCcid(AccImmEpower record);
	
	int countImm(AccImmEpower record);
	
	List<AccImmEpower> selectByCcid(AccImmEpower record);
	
	AccImmEpowerDto select(AccImmEpower record);
	


}