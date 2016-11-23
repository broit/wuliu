package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.WmsGoodsDelivery;

public class WmsGoodsDeliveryDto extends WmsGoodsDelivery{
	
//	private static final long serialVersionUID = 1L;
	
	private String mark;
	
	private String name;
	
	private String batchName;
	
	private String nameType;

	private BigDecimal stock;
	
	private BigDecimal allStock;
	
	private String gId;
	
	private List<WmsColorDeliveryDto> list;	
	
    private BigDecimal stockllimit;

    private BigDecimal stockulimit;
    
    private String no;

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

	public List<WmsColorDeliveryDto> getList() {
		return list;
	}

	public void setList(List<WmsColorDeliveryDto> list) {
		this.list = list;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
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