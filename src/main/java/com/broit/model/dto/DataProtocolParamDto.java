package com.broit.model.dto;


import java.util.List;

import com.broit.model.DataProtocolParam;

public class DataProtocolParamDto extends DataProtocolParam{
	
	private String name;
	
    private String protocolcodeE;

    private String paramtockenE;

    private String paramcodeE;
     
    private List<DataProtocolParamDto> param;

	public List<DataProtocolParamDto> getParam() {
		return param;
	}

	public void setParam(List<DataProtocolParamDto> param) {
		this.param = param;
	}

	public String getProtocolcodeE() {
		return protocolcodeE;
	}

	public void setProtocolcodeE(String protocolcodeE) {
		this.protocolcodeE = protocolcodeE;
	}

	public String getParamtockenE() {
		return paramtockenE;
	}

	public void setParamtockenE(String paramtockenE) {
		this.paramtockenE = paramtockenE;
	}

	public String getParamcodeE() {
		return paramcodeE;
	}

	public void setParamcodeE(String paramcodeE) {
		this.paramcodeE = paramcodeE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}