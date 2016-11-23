package com.broit.model.dto;

import java.util.List;

import com.broit.model.WmsColorEntry;

public class WmsColorEntryListDto extends WmsColorEntry{
//	private static final long serialVersionUID = 1L;
	
	private String mark;
	
	private String name;
	
	private String batchName;
	
	private String nameMark;
		
	private String cId;
	
	private List<WmsColorEntryDto> list;

	public List<WmsColorEntryDto> getList() {
		return list;
	}

	public void setList(List<WmsColorEntryDto> list) {
		this.list = list;
	}
	
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getNameMark() {
		return nameMark;
	}

	public void setNameMark(String nameMark) {
		this.nameMark = nameMark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}