package com.broit.mapper;

import java.util.List;

import com.broit.model.ServPrtFormula;
import com.broit.model.dto.ServPrtFormulaDto;
import com.broit.model.dto.ServPrtFormulaMaterialDto;

public interface ServPrtFormulaMapper extends IBaseMapper<ServPrtFormulaDto> {
	
	/**配方列表*/
	List<ServPrtFormula> formulaList(ServPrtFormula e);
	
	/**名称和色母*/
	List<ServPrtFormulaMaterialDto> selectFormulaMaterial(ServPrtFormulaMaterialDto material);
	
	/**根据配方ID删除配方中的材料*/
	void deleteFormulaMaterial(String formulaId);
	
	/**根据配方ID删除配方项 */
	void deleteFormulaItem(String formulaId);
	
	/**加载表单*/
	ServPrtFormulaDto loadForm(String id);

	/**
	 * 设置默认配方
	 * @param id 配方ID
	 * */
	int setDefault(String id);
	
	/**
	 * 取消默认配方
	 * @param id 产品ID
	 * */
	int cancelDefault(String id);
	
	/**
	 * 获得默认配方
	 * @param id 产品ID
	 * */
	ServPrtFormulaDto getDefault(String id);
}