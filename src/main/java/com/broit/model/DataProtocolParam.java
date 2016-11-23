package com.broit.model;

public class DataProtocolParam implements IBaseModel{
    private String id;

    private String protocolcode;

    private String paramtocken;

    private String paramcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProtocolcode() {
        return protocolcode;
    }

    public void setProtocolcode(String protocolcode) {
        this.protocolcode = protocolcode == null ? null : protocolcode.trim();
    }

    public String getParamtocken() {
        return paramtocken;
    }

    public void setParamtocken(String paramtocken) {
        this.paramtocken = paramtocken == null ? null : paramtocken.trim();
    }

    public String getParamcode() {
        return paramcode;
    }

    public void setParamcode(String paramcode) {
        this.paramcode = paramcode == null ? null : paramcode.trim();
    }
}