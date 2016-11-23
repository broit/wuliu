package com.broit.model.dto;

import java.util.List;

import com.broit.model.ServPrtFormulaItem;

public class ServPrtFormulaItemDto extends ServPrtFormulaItem{

	/**配方项原料*/
	private List<ServPrtFormulaMaterialDto> material;

	public List<ServPrtFormulaMaterialDto> getMaterial() {
		return material;
	}

	public void setMaterial(List<ServPrtFormulaMaterialDto> material) {
		this.material = material;
	}
}
