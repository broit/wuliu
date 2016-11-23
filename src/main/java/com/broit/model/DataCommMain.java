package com.broit.model;

public class DataCommMain implements IBaseModel{
    private String id;
    
    private String name;

    private String conntype;

    private String commtype;
    
    private String protocolcode;

    private String datascope;

    private String ip;

    private String immtoken;

    private String param3;

    private String param4;

    private String param5;

    private String param6;

    private String param7;

    private String param8;

    private String param9;

    private String param10;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDatascope() {
		return datascope;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProtocolcode() {
		return protocolcode;
	}

	public void setProtocolcode(String protocolcode) {
		this.protocolcode = protocolcode;
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

    public void setDatascope(String datascope) {
        this.datascope = datascope == null ? null : datascope.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getImmtoken() {
        return immtoken;
    }

    public void setImmtoken(String immtoken) {
        this.immtoken = immtoken == null ? null : immtoken.trim();
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3 == null ? null : param3.trim();
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4 == null ? null : param4.trim();
    }

    public String getParam5() {
        return param5;
    }

    public void setParam5(String param5) {
        this.param5 = param5 == null ? null : param5.trim();
    }

    public String getParam6() {
        return param6;
    }

    public void setParam6(String param6) {
        this.param6 = param6 == null ? null : param6.trim();
    }

    public String getParam7() {
        return param7;
    }

    public void setParam7(String param7) {
        this.param7 = param7 == null ? null : param7.trim();
    }

    public String getParam8() {
        return param8;
    }

    public void setParam8(String param8) {
        this.param8 = param8 == null ? null : param8.trim();
    }

    public String getParam9() {
        return param9;
    }

    public void setParam9(String param9) {
        this.param9 = param9 == null ? null : param9.trim();
    }

    public String getParam10() {
        return param10;
    }

    public void setParam10(String param10) {
        this.param10 = param10 == null ? null : param10.trim();
    }
}