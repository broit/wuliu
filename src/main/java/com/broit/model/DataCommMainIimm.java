package com.broit.model;

public class DataCommMainIimm implements IBaseModel{
    private String id;

    private String immid;

    private String commid;

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

    public String getCommid() {
        return commid;
    }

    public void setCommid(String commid) {
        this.commid = commid == null ? null : commid.trim();
    }
}