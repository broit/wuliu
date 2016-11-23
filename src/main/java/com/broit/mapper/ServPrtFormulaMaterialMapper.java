package com.broit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

//import org.apache.ibatis.annotations.Param;

import com.broit.model.ServPrtFormulaMaterial;
import com.broit.model.dto.ServPrtFormulaMaterialDto;

public interface ServPrtFormulaMaterialMapper extends IBaseMapper<ServPrtFormulaMaterial> {
	
	/**插入配方项原料*/
    void batchInsertFormulaMaterial(@Param("map")Map<String,List<ServPrtFormulaMaterialDto>> map);
    
    /**查询配方项对应的默认物料*/
    ServPrtFormulaMaterial selectDefaultItemMaterial(String itemid);
}