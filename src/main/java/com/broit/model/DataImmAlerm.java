package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

public class DataImmAlerm implements IBaseModel{
    private String id;

    private String immid;

    private String lineid;

    private String paramcode;

    private BigDecimal standardvalue;

    private BigDecimal ulimit;

    private BigDecimal llimit;

    private BigDecimal value;

    private BigDecimal serial;

    private Date cycledate;

    private Date createdate;

    private Date cycletime;

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

    public String getParamcode() {
        return paramcode;
    }

    public void setParamcode(String paramcode) {
        this.paramcode = paramcode == null ? null : paramcode.trim();
    }

    public BigDecimal getStandardvalue() {
        return standardvalue;
    }

    public void setStandardvalue(BigDecimal standardvalue) {
        this.standardvalue = standardvalue;
    }

    public BigDecimal getUlimit() {
        return ulimit;
    }

    public void setUlimit(BigDecimal ulimit) {
        this.ulimit = ulimit;
    }

    public BigDecimal getLlimit() {
        return llimit;
    }

    public void setLlimit(BigDecimal llimit) {
        this.llimit = llimit;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getSerial() {
        return serial;
    }

    public void setSerial(BigDecimal serial) {
        this.serial = serial;
    }

    public Date getCycledate() {
        return cycledate;
    }

    public void setCycledate(Date cycledate) {
        this.cycledate = cycledate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getCycletime() {
        return cycletime;
    }

    public void setCycletime(Date cycletime) {
        this.cycletime = cycletime;
    }
}