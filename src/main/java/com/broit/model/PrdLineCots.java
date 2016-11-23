package com.broit.model;

public class PrdLineCots implements IBaseModel{
    private String id;

    private String lineid;

    private String cotsid;

    private String position;

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

    public String getCotsid() {
        return cotsid;
    }

    public void setCotsid(String cotsid) {
        this.cotsid = cotsid == null ? null : cotsid.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}