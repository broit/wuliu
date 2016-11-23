package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.AccMould;
import com.broit.model.dto.AccMouldDto;
import com.broit.model.dto.AccMouldLogicDto;
import com.broit.model.dto.AccMouldPrtDto;
import com.broit.model.dto.MouldLogicDtoMap;

public interface AccMouldMapper<E>  extends IBaseMapper<AccMouldDto>{
	
	MouldLogicDtoMap selectByLogic(String id);

	List<AccMouldPrtDto> productList();//加工产品列表
	
	List<AccMouldLogicDto> logicList(@Param("mouldid")String mouldid);//逻辑模具列表
	
    int validateName(@Param("name")String name,@Param("id")String id);//名称验证
    
    int validateNo(@Param("no")String no,@Param("id")String id);//编号验证
    
    List<AccMouldDto> immList();//静态参数列表
    
    List<AccMould> selectByImmId(String id);
}