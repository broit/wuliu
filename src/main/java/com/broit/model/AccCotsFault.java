package com.broit.model;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.util.DateTimeSerializer;

public class AccCotsFault  implements IBaseModel{
    private String id;

    private String cotsid;

    private String type;

    private Date occurdate;

    private String reason;

    private String duty;

    private String repperson;

    private Date shutdowndate;

    private String mroprocess;

    private Date startupdate;

    private String creater;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCotsid() {
		return cotsid;
	}

	public void setCotsid(String cotsid) {
		this.cotsid = cotsid == null ? null : cotsid.trim();;
	}

	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @JsonSerialize(using = DateTimeSerializer.class)
    public Date getOccurdate() {
        return occurdate;
    }

    public void setOccurdate(Date occurdate) {
        this.occurdate = occurdate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getRepperson() {
        return repperson;
    }

    public void setRepperson(String repperson) {
        this.repperson = repperson == null ? null : repperson.trim();
    }

    @JsonSerialize(using = DateTimeSerializer.class)
    public Date getShutdowndate() {
        return shutdowndate;
    }

    public void setShutdowndate(Date shutdowndate) {
        this.shutdowndate = shutdowndate;
    }

    public String getMroprocess() {
        return mroprocess;
    }

    public void setMroprocess(String mroprocess) {
        this.mroprocess = mroprocess == null ? null : mroprocess.trim();
    }

    @JsonSerialize(using = DateTimeSerializer.class)
    public Date getStartupdate() {
        return startupdate;
    }

    public void setStartupdate(Date startupdate) {
        this.startupdate = startupdate;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    @JsonSerialize(using = DateTimeSerializer.class)
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}