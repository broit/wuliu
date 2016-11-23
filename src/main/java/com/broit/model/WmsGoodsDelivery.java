package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class WmsGoodsDelivery implements IBaseModel{
    private String id;

    private String goodsId;

    private String batchId;

    private String reftype;

    private String refid;

    private BigDecimal serial;

    private BigDecimal deliverynum;

    private Date deliverydate;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getReftype() {
        return reftype;
    }

    public void setReftype(String reftype) {
        this.reftype = reftype == null ? null : reftype.trim();
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}