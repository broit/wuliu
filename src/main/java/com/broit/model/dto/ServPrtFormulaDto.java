package com.broit.model.dto;

import java.util.List;

import com.broit.model.ServPrtFormula;

public class ServPrtFormulaDto extends ServPrtFormula{

	/**配方项*/
	private List<ServPrtFormulaItemDto> formulaItem;
	
	public ServPrtFormulaDto(){
		super();
	}
	
	public ServPrtFormulaDto(String prtid){
		super.setPrtid(prtid);
	}

	public List<ServPrtFormulaItemDto> getFormulaItem() {
		return formulaItem;
	}

	public void setFormulaItem(List<ServPrtFormulaItemDto> formulaItem) {
		this.formulaItem = formulaItem;
	}
}
