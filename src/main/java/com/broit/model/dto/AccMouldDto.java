package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.AccMould;

public class AccMouldDto extends AccMould {

	private String param;
	
	private String paramcode;
	
	private String mouldid;
	
	private String prtid;
	
	private String prtName;
	
	private List<AccMouldPrtDto> list;//前台产品下拉框
	
	private List<AccMouldLogicDto> logic;//逻辑模具数组
	
	private BigDecimal value;
	
	private String gName;
	
	private String gCode;
	
	private BigDecimal gNum;
	
	private String groupid;	
	
	private String lgid;

	private String lid;
	
	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getLgid() {
		return lgid;
	}

	public void setLgid(String lgid) {
		this.lgid = lgid;
	}

	public List<AccMouldLogicDto> getLogic() {
		return logic;
	}

	public void setLogic(List<AccMouldLogicDto> logic) {
		this.logic = logic;
	}

	public String getgName() {
		return gName;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgCode() {
		return gCode;
	}

	public void setgCode(String gCode) {
		this.gCode = gCode;
	}

	public BigDecimal getgNum() {
		return gNum;
	}

	public void setgNum(BigDecimal gNum) {
		this.gNum = gNum;
	}


	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public List<AccMouldPrtDto> getList() {
		return list;
	}

	public void setList(List<AccMouldPrtDto> list) {
		this.list = list;
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

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getParamcode() {
		return paramcode;
	}

	public void setParamcode(String paramcode) {
		this.paramcode = paramcode;
	}

	public String getMouldid() {
		return mouldid;
	}

	public void setMouldid(String mouldid) {
		this.mouldid = mouldid;
	}

	
	
}
