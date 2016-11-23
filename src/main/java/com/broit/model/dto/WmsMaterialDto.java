package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.broit.model.WmsMaterial;

public class WmsMaterialDto  extends WmsMaterial{
	
//	private static final long serialVersionUID = 1L;

    private String materialid;

    private String isdefault;
    
    private String batchName;
    
    private String nameMark;
    
    private BigDecimal entrynum;
    
    private BigDecimal deliverynum;
    
    private Date entrydate;
    
    private Date deliverydate;
    
    private BigDecimal serial;
    
    private String batchid;
    
    private String materialName;
    
    private String warning;//该字段判断是否已撤销过报警消息

    public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
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

	public String getBatch() {
		return batchName;
	}

	public void setBatch(String batchName) {
		this.batchName = batchName;
	}

	public String getMaterialid() {
		return materialid;
	}

	public void setMaterialid(String materialid) {
		this.materialid = materialid;
	}

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
}