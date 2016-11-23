package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class WmsMaterialDelivery implements IBaseModel{
    private String id;

    private String materialid;

    private String batchId;

    private BigDecimal serial;

    private BigDecimal deliverynum;

    private Date deliverydate;
    
    private String isdefault;

    public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid == null ? null : materialid.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public BigDecimal getSerial() {
        return serial;
    }

    public void setSerial(BigDecimal serial) {
        this.serial = serial;
    }

    public BigDecimal getDeliverynum() {
        return deliverynum;
    }

    public void setDeliverynum(BigDecimal deliverynum) {
        this.deliverynum = deliverynum;
    }
    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }
}