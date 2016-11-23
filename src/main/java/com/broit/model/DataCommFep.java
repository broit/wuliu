package com.broit.model;

public class DataCommFep implements IBaseModel{
    private String id;

    private String name;

    private String conntype;

    private String commtype;

    private String ip;

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

    public String getConntype() {
        return conntype;
    }

    public void setConntype(String conntype) {
        this.conntype = conntype == null ? null : conntype.trim();
    }

    public String getCommtype() {
        return commtype;
    }

    public void setCommtype(String commtype) {
        this.commtype = commtype == null ? null : commtype.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}