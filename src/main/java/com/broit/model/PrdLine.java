package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class PrdLine implements IBaseModel{
    private String id;

    private String name;

    private String code;

    private String type;

    private String immid;

    private String mouldid;

    private BigDecimal status;

    private Date prddate;

    private String iscurrent;

    private BigDecimal cycletime;

    private String flag;

    private String creater;

    private Date createdate;
    
    private BigDecimal checkdelay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImmid() {
        return immid;
    }

    public void setImmid(String immid) {
        this.immid = immid == null ? null : immid.trim();
    }

    public String getMouldid() {
        return mouldid;
    }

    public void setMouldid(String mouldid) {
        this.mouldid = mouldid == null ? null : mouldid.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public Date getPrddate() {
        return prddate;
    }

    public void setPrddate(Date prddate) {
        this.prddate = prddate;
    }

    public String getIscurrent() {
        return iscurrent;
    }

    public void setIscurrent(String iscurrent) {
        this.iscurrent = iscurrent == null ? null : iscurrent.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
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

	public BigDecimal getCheckdelay() {
		return checkdelay;
	}

	public void setCheckdelay(BigDecimal checkdelay) {
		this.checkdelay = checkdelay;
	}

	public BigDecimal getCycletime() {
		return cycletime;
	}

	public void setCycletime(BigDecimal cycletime) {
		this.cycletime = cycletime;
	}
}