package com.broit.model.dto;

import java.math.BigDecimal;

import com.broit.model.WmsMaterialBatch;

public class WmsMaterialBatchDto extends WmsMaterialBatch{
	
//	private static final long serialVersionUID = 1L;
	
	private String batchName;
	
	private String nameMark;
	
    private BigDecimal entrynum;
    
    private BigDecimal deliverynum;

    private String batchId;
    
    private BigDecimal serial;

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
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

	public BigDecimal getEntrynum() {
		return entrynum;
	}

	public void setEntrynum(BigDecimal entrynum) {
		this.entrynum = entrynum;
	}

	public BigDecimal getDeliverynum() {
		return deliverynum;
	}

	public void setDeliverynum(BigDecimal deliverynum) {
		this.deliverynum = deliverynum;
	}
    
    
}