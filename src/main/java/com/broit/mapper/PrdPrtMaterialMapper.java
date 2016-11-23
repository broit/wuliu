package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdPrtMaterial;
import com.broit.model.dto.PrdPrtMaterialDto;

public interface PrdPrtMaterialMapper extends IBaseMapper<PrdPrtMaterial>{
    
	/**批量插入订单产品材料*/
	void batchInsertPrdPrtMaterial(List<PrdPrtMaterial> list);
	
	/**删除订单产品材料*/
	void deleteOrderProductMaterial(String orderid);
	
	/**根据订单产品ID删除原料*/
	void deleteByOrderprtid(String orderprtid);
	
	/**根据订单排产ID删除原料*/
	void deleteByOrderprtplanid(String orderprtplanid);
	
	/**查询订单产品用料*/
	List<PrdPrtMaterialDto> selectPrtMaterial(PrdPrtMaterialDto dto);
	
	/**查询物料需求量*/
	PrdPrtMaterialDto selectRequiredMaterial(String materialId);
	
	/**查询生产计划需要的物料*/
	List<PrdPrtMaterialDto> selectByPlanid(String planid);
}