package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class SysMessage implements IBaseModel{
    private String id;

    private BigDecimal mtype;

    private String origin;

    private String refid;

    private BigDecimal mlevel;

    private String content;

    private String remindtype;
    
    private BigDecimal status;
    
    private String operater;
    
    private Date operatedate;

    private String flag;

    public BigDecimal getStatus() {
		return status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public String getOperater() {
		return operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
	}
	

	public Date getOperatedate() {
		return operatedate;
	}

	public void setOperatedate(Date operatedate) {
		this.operatedate = operatedate;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getMtype() {
        return mtype;
    }

    public void setMtype(BigDecimal mtype) {
        this.mtype = mtype;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public BigDecimal getMlevel() {
        return mlevel;
    }

    public void setMlevel(BigDecimal mlevel) {
        this.mlevel = mlevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemindtype() {
        return remindtype;
    }

    public void setRemindtype(String remindtype) {
        this.remindtype = remindtype == null ? null : remindtype.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}