package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class DataImmProtoalerm implements IBaseModel{
    private String id;

    private String immid;

    private String lineid;

    private String type;

    private String value;

    private String content;

    private BigDecimal serial;

    private String iscurrent;

    private Date cycledate;

    private Date cycletime;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getImmid() {
        return immid;
    }

    public void setImmid(String immid) {
        this.immid = immid == null ? null : immid.trim();
    }

    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getSerial() {
        return serial;
    }

    public void setSerial(BigDecimal serial) {
        this.serial = serial;
    }

    public String getIscurrent() {
        return iscurrent;
    }

    public void setIscurrent(String iscurrent) {
        this.iscurrent = iscurrent == null ? null : iscurrent.trim();
    }

    public Date getCycledate() {
        return cycledate;
    }

    public void setCycledate(Date cycledate) {
        this.cycledate = cycledate;
    }

    public Date getCycletime() {
        return cycletime;
    }

    public void setCycletime(Date cycletime) {
        this.cycletime = cycletime;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}