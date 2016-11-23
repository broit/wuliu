package com.broit.model;

public class AccImmRobot  implements IBaseModel{
    private String id;

    private String immid;

    private String robotid;

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

    public String getRobotid() {
        return robotid;
    }

    public void setRobotid(String robotid) {
        this.robotid = robotid == null ? null : robotid.trim();
    }
}