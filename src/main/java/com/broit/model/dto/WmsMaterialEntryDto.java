package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.WmsMaterialEntry;

public class WmsMaterialEntryDto extends WmsMaterialEntry{
//	private static final long serialVersionUID = 1L;
	
	private String mark;
	
	private String name;
	
	private String batchName;
	
	private String nameMark;
		
	private String mId;
	
	private String isdefault;
	
    private BigDecimal stockllimit;

    private BigDecimal stockulimit;
	
    private BigDecimal stock;
    
    private BigDecimal allStock;

    public BigDecimal getAllStock() {
		return allStock;
	}

	public void setAllStock(BigDecimal allStock) {
		this.allStock = allStock;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}
	public BigDecimal getStockllimit() {
		return stockllimit;
	}

	public void setStockllimit(BigDecimal stockllimit) {
		this.stockllimit = stockllimit;
	}

	public BigDecimal getStockulimit() {
		return stockulimit;
	}

	public void setStockulimit(BigDecimal stockulimit) {
		this.stockulimit = stockulimit;
	}

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	private List<WmsMaterialEntryDto> list;

	public List<WmsMaterialEntryDto> getList() {
		return list;
	}

	public void setList(List<WmsMaterialEntryDto> list) {
		this.list = list;
	}
	
	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
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