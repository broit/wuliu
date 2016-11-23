package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class PrdPlan implements IBaseModel{
    private String id;

    private String type;
    
    private String no;

    private String refid;

    private String lineid;

    private BigDecimal serial;

    private Date plansdate;

    private Date planedate;

    private BigDecimal status;
    
    private String isnormal;

    private Date realsdate;

    private Date realedate;

    private String creater;

    private Date createdate;
    
    private BigDecimal prdnum;
    
    private BigDecimal cyclecount;
    
    private BigDecimal defectnum;

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

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

    public BigDecimal getSerial() {
        return serial;
    }

    public void setSerial(BigDecimal serial) {
        this.serial = serial;
    }

    public Date getPlansdate() {
        return plansdate;
    }

    public void setPlansdate(Date plansdate) {
        this.plansdate = plansdate;
    }

    public Date getPlanedate() {
        return planedate;
    }

    public void setPlanedate(Date planedate) {
        this.planedate = planedate;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public Date getRealsdate() {
        return realsdate;
    }

    public void setRealsdate(Date realsdate) {
        this.realsdate = realsdate;
    }

    public Date getRealedate() {
        return realedate;
    }

    public void setRealedate(Date realedate) {
        this.realedate = realedate;
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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getIsnormal() {
		return isnormal;
	}

	public void setIsnormal(String isnormal) {
		this.isnormal = isnormal;
	}

	public BigDecimal getPrdnum() {
		return prdnum;
	}

	public void setPrdnum(BigDecimal prdnum) {
		this.prdnum = prdnum;
	}

	public BigDecimal getCyclecount() {
		return cyclecount;
	}

	public void setCyclecount(BigDecimal cyclecount) {
		this.cyclecount = cyclecount;
	}

	public BigDecimal getDefectnum() {
		return defectnum;
	}

	public void setDefectnum(BigDecimal defectnum) {
		this.defectnum = defectnum;
	}
}