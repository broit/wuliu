package com.broit.model;

public class BaseTeam  implements IBaseModel{
    private String id;

    private String wsid;

    private String name;

    private String manager;

    private String shiftid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid == null ? null : wsid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid == null ? null : shiftid.trim();
    }
}