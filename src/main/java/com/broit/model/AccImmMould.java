package com.broit.model;

public class AccImmMould  implements IBaseModel{
    private String id;

    private String immid;

    private String mouldid;

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

    public String getMouldid() {
        return mouldid;
    }

    public void setMouldid(String mouldid) {
        this.mouldid = mouldid == null ? null : mouldid.trim();
    }
}