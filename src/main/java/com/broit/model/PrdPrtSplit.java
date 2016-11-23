package com.broit.model;

import java.math.BigDecimal;

public class PrdPrtSplit implements IBaseModel{
    private String id;

    private String prtid;

    private String prdprtid;
    
    private String formulaid;
    
    private BigDecimal producenum;

    private BigDecimal readynum;

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

    public String getPrdprtid() {
        return prdprtid;
    }

    public void setPrdprtid(String prdprtid) {
        this.prdprtid = prdprtid == null ? null : prdprtid.trim();
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

	public String getFormulaid() {
		return formulaid;
	}

	public void setFormulaid(String formulaid) {
		this.formulaid = formulaid;
	}
}