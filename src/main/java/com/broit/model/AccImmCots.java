package com.broit.model;

public class AccImmCots  implements IBaseModel{
    private String id;

    private String immid;

    private String cotsid;

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

    public String getCotsid() {
        return cotsid;
    }

    public void setCotsid(String cotsid) {
        this.cotsid = cotsid == null ? null : cotsid.trim();
    }
}