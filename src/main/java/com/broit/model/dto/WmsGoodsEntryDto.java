package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.WmsGoodsEntry;

public class WmsGoodsEntryDto extends WmsGoodsEntry{
	
//	private static final long serialVersionUID = 1L;
	
	private String mark;
	
	private String name;
	
	private String batchName;
	
	private String nameType;
		
	private String gId;
	
    private BigDecimal stock;
    
    private BigDecimal allStock;
    
    private BigDecimal stockllimit;

    private BigDecimal stockulimit;
    
    private String pId;
    
    private String no;
    
    private String pNo;
    
	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public BigDecimal getAllStock() {
		return allStock;
	}

	public void setAllStock(BigDecimal allStock) {
		this.allStock = allStock;
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

	public String getgId() {
		return gId;
	}

	public void setgId(String gId) {
		this.gId = gId;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	private List<WmsMaterialEntryDto> list;

	public List<WmsMaterialEntryDto> getList() {
		return list;
	}

	public void setList(List<WmsMaterialEntryDto> list) {
		this.list = list;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
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