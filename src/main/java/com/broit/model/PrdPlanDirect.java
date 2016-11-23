package com.broit.model;

import java.math.BigDecimal;

public class PrdPlanDirect implements IBaseModel,IPrdProduce{
    private String id;

    private String prtid;

    private BigDecimal producenum;
    
    private BigDecimal readynum;
    
    private BigDecimal status;
    
    private String iscurrent;
    
    private String no;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPrtid() {
        return prtid;
    }

    public void setPrtid(String prtid) {
        this.prtid = prtid == null ? null : prtid.trim();
    }

    public BigDecimal getProducenum() {
        return producenum;
    }

    public void setProducenum(BigDecimal producenum) {
        this.producenum = producenum;
    }

	public BigDecimal getReadynum() {
		return readynum;
	}

	public void setReadynum(BigDecimal readynum) {
		this.readynum = readynum;
	}

	public BigDecimal getStatus() {
		return status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public String getIscurrent() {
		return iscurrent;
	}

	public void setIscurrent(String iscurrent) {
		this.iscurrent = iscurrent;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}