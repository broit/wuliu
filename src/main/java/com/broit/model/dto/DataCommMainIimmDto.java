package com.broit.model.dto;

import java.util.List;

import com.broit.model.DataCommMainIimm;

public class DataCommMainIimmDto extends DataCommMainIimm{
	
	private List<DataCommMainIimmDto> mainImm;
	
	private String name;

    private String conntype;

    private String commtype;
    
    private String protocolcode;

    private String datascope;

    private String ip;

    private String immtoken;
    
    private String protocolName;
    

	public String getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConntype() {
		return conntype;
	}

	public void setConntype(String conntype) {
		this.conntype = conntype;
	}

	public String getCommtype() {
		return commtype;
	}

	public void setCommtype(String commtype) {
		this.commtype = commtype;
	}

	public String getProtocolcode() {
		return protocolcode;
	}

	public void setProtocolcode(String protocolcode) {
		this.protocolcode = protocolcode;
	}

	public String getDatascope() {
		return datascope;
	}

	public void setDatascope(String datascope) {
		this.datascope = datascope;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImmtoken() {
		return immtoken;
	}

	public void setImmtoken(String immtoken) {
		this.immtoken = immtoken;
	}

	public List<DataCommMainIimmDto> getMainImm() {
		return mainImm;
	}

	public void setMainImm(List<DataCommMainIimmDto> mainImm) {
		this.mainImm = mainImm;
	}
	
}