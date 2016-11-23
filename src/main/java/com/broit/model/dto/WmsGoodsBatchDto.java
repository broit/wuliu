package com.broit.model.dto;

import java.math.BigDecimal;

import com.broit.model.WmsGoodsBatch;

public class WmsGoodsBatchDto extends WmsGoodsBatch{
	
//	private static final long serialVersionUID = 1L;
	
	private String batchName;
	
	private String nameType;
	
    private BigDecimal entrynum;
    
    private BigDecimal deliverynum;
    
    private String materialid;
    
    private String batchId;
    
    private BigDecimal serial;
    
    private String prtid;

	public String getPrtid() {
		return prtid;
	}

	public void setPrtid(String prtid) {
		this.prtid = prtid;
	}

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

	public String getMaterialid() {
		return materialid;
	}

	public void setMaterialid(String materialid) {
		this.materialid = materialid;
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