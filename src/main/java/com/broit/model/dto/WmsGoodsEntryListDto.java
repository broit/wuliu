package com.broit.model.dto;

import java.util.List;

import com.broit.model.WmsGoodsEntry;

public class WmsGoodsEntryListDto extends WmsGoodsEntry{
//	private static final long serialVersionUID = 1L;
	
	private String mark;
	
	private String name;
	
	private String batchName;
	
	private String nameMark;
		
	private String gId;
	
	private List<WmsGoodsEntryDto> list;

	public List<WmsGoodsEntryDto> getList() {
		return list;
	}

	public void setList(List<WmsGoodsEntryDto> list) {
		this.list = list;
	}
	
	public String getGId() {
		return gId;
	}

	public void setGId(String gId) {
		this.gId = gId;
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