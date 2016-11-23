package com.broit.model;

import java.math.BigDecimal;

public class AccRobotParam  implements IBaseModel{
    private String id;

    private String robotid;

    private String paramcode;

    private String param;

    private BigDecimal value;

    private BigDecimal ulimit;

    private BigDecimal llimit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRobotid() {
        return robotid;
    }

    public void setRobotid(String robotid) {
        this.robotid = robotid == null ? null : robotid.trim();
    }

    public String getParamcode() {
        return paramcode;
    }

    public void setParamcode(String paramcode) {
        this.paramcode = paramcode == null ? null : paramcode.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
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
}