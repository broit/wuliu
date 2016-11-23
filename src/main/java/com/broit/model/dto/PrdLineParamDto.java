package com.broit.model.dto;

import java.util.List;

import com.broit.model.PrdLineParam;

public class PrdLineParamDto extends PrdLineParam{
	
	private String param;	
	
	private String name;
	
	private String prtid;
	
	private String prtName;
	
	private String flagValue;
	
	public String getFlagValue() {
		return flagValue;
	}

	public void setFlagValue(String flagValue) {
		this.flagValue = flagValue;
	}

	private List<PrdLineParamDto> list;

	private String immid;
	
	public String getImmid() {
		return immid;
	}

	public void setImmid(String immid) {
		this.immid = immid;
	}

	public String getPrtid() {
		return prtid;
	}

	public void setPrtid(String prtid) {
		this.prtid = prtid;
	}

	public String getPrtName() {
		return prtName;
	}

	public void setPrtName(String prtName) {
		this.prtName = prtName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public List<PrdLineParamDto> getList() {
		return list;
	}

	public void setList(List<PrdLineParamDto> list) {
		this.list = list;
	}
	
}