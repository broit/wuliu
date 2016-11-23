package com.broit.model;

import java.math.BigDecimal;

public class PrdLineParam  implements IBaseModel{
    private String id;

    private String lineid;

    private String paramcode;

    private BigDecimal value;

    private BigDecimal ulimit;

    private BigDecimal llimit;
    
    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
    
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}