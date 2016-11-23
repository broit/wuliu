package com.broit.model.dto;

import java.util.ArrayList;

public class MouldLogicDtoMap extends AccMouldDto{
	
	private ArrayList<AccMouldDto> mouldsLogic;	//逻辑模具列表(最外层)

	public ArrayList<AccMouldDto> getMouldsLogic() {
		return mouldsLogic;
	}

	public void setMouldsLogic(ArrayList<AccMouldDto> mouldsLogic) {
		this.mouldsLogic = mouldsLogic;
	}
	
}