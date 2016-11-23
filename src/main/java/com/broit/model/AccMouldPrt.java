package com.broit.model;

public class AccMouldPrt  implements IBaseModel{
    private String id;

    private String mouldid;

    private String prtid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMouldid() {
        return mouldid;
    }

    public void setMouldid(String mouldid) {
        this.mouldid = mouldid == null ? null : mouldid.trim();
    }

    public String getPrtid() {
        return prtid;
    }

    public void setPrtid(String prtid) {
        this.prtid = prtid == null ? null : prtid.trim();
    }
}