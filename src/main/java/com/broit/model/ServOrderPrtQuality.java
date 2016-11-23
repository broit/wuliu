package com.broit.model;

import java.math.BigDecimal;

public class ServOrderPrtQuality implements IBaseModel{
    private String id;

    private String orderprtid;

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

    public String getOrderprtid() {
        return orderprtid;
    }

    public void setOrderprtid(String orderprtid) {
        this.orderprtid = orderprtid == null ? null : orderprtid.trim();
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