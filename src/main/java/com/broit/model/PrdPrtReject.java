package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class PrdPrtReject implements IBaseModel{
    private String id;

    private String type;

    private BigDecimal num;

    private String planid;

    private BigDecimal weigharea;

    private BigDecimal mouldarea;

    private Date checksdate;
    
    private Date checkedate;

    private Date prdsdate;
    
    private Date prdedate;

    private String iswaste;

    private String remark;

    private String creater;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    public BigDecimal getWeigharea() {
        return weigharea;
    }

    public void setWeigharea(BigDecimal weigharea) {
        this.weigharea = weigharea;
    }

    public BigDecimal getMouldarea() {
        return mouldarea;
    }

    public void setMouldarea(BigDecimal mouldarea) {
        this.mouldarea = mouldarea;
    }

    public Date getChecksdate() {
		return checksdate;
	}

	public void setChecksdate(Date checksdate) {
		this.checksdate = checksdate;
	}

	public Date getCheckedate() {
		return checkedate;
	}

	public void setCheckedate(Date checkedate) {
		this.checkedate = checkedate;
	}

	public Date getPrdsdate() {
		return prdsdate;
	}

	public void setPrdsdate(Date prdsdate) {
		this.prdsdate = prdsdate;
	}

	public Date getPrdedate() {
		return prdedate;
	}

	public void setPrdedate(Date prdedate) {
		this.prdedate = prdedate;
	}

	public String getIswaste() {
        return iswaste;
    }

    public void setIswaste(String iswaste) {
        this.iswaste = iswaste == null ? null : iswaste.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}