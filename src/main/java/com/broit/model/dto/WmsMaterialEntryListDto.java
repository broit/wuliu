package com.broit.model.dto;

import java.util.List;

import com.broit.model.WmsMaterialEntry;

public class WmsMaterialEntryListDto extends WmsMaterialEntry{

	private List<WmsMaterialEntryDto> list;

	public List<WmsMaterialEntryDto> getList() {
		return list;
	}
	
	public void setList(List<WmsMaterialEntryDto> list) {
		this.list = list;
	}


}
