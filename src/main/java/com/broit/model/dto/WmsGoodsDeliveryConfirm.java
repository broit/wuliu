package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.WmsGoodsDelivery;

public class WmsGoodsDeliveryConfirm extends WmsGoodsDelivery{
	
	private String name;
	
	private String no;
	
	private BigDecimal allocatenum; 
	
	private BigDecimal stock; 
	
	private BigDecimal allNum; 
	
	private BigDecimal readynum; 
	
	private String batchinfo;
	
	private BigDecimal orderStatus;
	
	private List<WmsGoodsDeliveryConfirm> list;

	public List<WmsGoodsDeliveryConfirm> getList() {
		return list;
	}

	public BigDecimal getReadynum() {
		return readynum;
	}

	public void setReadynum(BigDecimal readynum) {
		this.readynum = readynum;
	}

	public void setList(List<WmsGoodsDeliveryConfirm> list) {
		this.list = list;
	}

	public BigDecimal getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(BigDecimal orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public BigDecimal getAllocatenum() {
		return allocatenum;
	}

	public void setAllocatenum(BigDecimal allocatenum) {
		this.allocatenum = allocatenum;
	}

	public BigDecimal getAllNum() {
		return allNum;
	}

	public void setAllNum(BigDecimal allNum) {
		this.allNum = allNum;
	}

	public String getBatchinfo() {
		return batchinfo;
	}

	public void setBatchinfo(String batchinfo) {
		this.batchinfo = batchinfo;
	} 
	
}