package com.broit.model;

import java.math.BigDecimal;

public class ServOrderPrt implements IBaseModel{
    private String id;

    private String orderid;

    private String prtid;

    private BigDecimal ordernum;

    private BigDecimal spilthnum;

    private BigDecimal allocatenum;

    private BigDecimal producenum;

    private BigDecimal readynum;
    
    private BigDecimal status;

    private String iscurrent;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getPrtid() {
        return prtid;
    }

    public void setPrtid(String prtid) {
        this.prtid = prtid == null ? null : prtid.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getSpilthnum() {
        return spilthnum;
    }

    public void setSpilthnum(BigDecimal spilthnum) {
        this.spilthnum = spilthnum;
    }

    public BigDecimal getAllocatenum() {
        return allocatenum;
    }

    public void setAllocatenum(BigDecimal allocatenum) {
        this.allocatenum = allocatenum;
    }

    public BigDecimal getProducenum() {
        return producenum;
    }

    public void setProducenum(BigDecimal producenum) {
        this.producenum = producenum;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public String getIscurrent() {
		return iscurrent;
	}

	public void setIscurrent(String iscurrent) {
		this.iscurrent = iscurrent;
	}

	public BigDecimal getReadynum() {
		return readynum;
	}

	public void setReadynum(BigDecimal readynum) {
		this.readynum = readynum;
	}
}