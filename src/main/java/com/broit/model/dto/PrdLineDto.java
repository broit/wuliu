package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.broit.model.AccImm;
import com.broit.model.AccMould;
import com.broit.model.BaseBranch;
import com.broit.model.PrdLine;
import com.broit.model.PrdLineCots;
import com.broit.model.PrdLineOwner;
import com.broit.model.PrdLinePart;
import com.broit.model.PrdLineRobot;

public class PrdLineDto extends PrdLine{

	/**生产线所属*/
	private List<PrdLineOwner> owner;
	
	/**机械手*/
	private List<PrdLineRobot> robot;
	
	/**检测设备*/
	private List<PrdLineCots> cots;
	
	/**构成生产线ID*/
	private List<PrdLinePart> part;
	
	/**注塑机列表*/
	private List<AccImm> immList;
	
	/**模具列表*/
	private List<AccMould> mouldList;
	
	/**分公司列表*/
	private List<BaseBranch> branchList;
	
	/**注塑机名称*/
	private String immName;
	
	/**模具名称*/
	private String mouldName;
	
	/**切换状态*/
	private BigDecimal switchStatus;
	
	private String param;
	
	private String paramcode;
	
	/**模具穴数*/
	private BigDecimal mouldNum;

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

	public List<PrdLineOwner> getOwner() {
		return owner;
	}

	public void setOwner(List<PrdLineOwner> owner) {
		this.owner = owner;
	}

	public List<PrdLineRobot> getRobot() {
		return robot;
	}

	public void setRobot(List<PrdLineRobot> robot) {
		this.robot = robot;
	}

	public List<PrdLineCots> getCots() {
		return cots;
	}

	public void setCots(List<PrdLineCots> cots) {
		this.cots = cots;
	}

	public List<PrdLinePart> getPart() {
		return part;
	}

	public void setPart(List<PrdLinePart> part) {
		this.part = part;
	}

	public List<AccImm> getImmList() {
		return immList;
	}

	public void setImmList(List<AccImm> immList) {
		this.immList = immList;
	}

	public List<AccMould> getMouldList() {
		return mouldList;
	}

	public void setMouldList(List<AccMould> mouldList) {
		this.mouldList = mouldList;
	}

	public List<BaseBranch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<BaseBranch> branchList) {
		this.branchList = branchList;
	}

	public BigDecimal getSwitchStatus() {
		return switchStatus;
	}

	public void setSwitchStatus(BigDecimal switchStatus) {
		this.switchStatus = switchStatus;
	}

	public String getImmName() {
		return immName;
	}

	public void setImmName(String immName) {
		this.immName = immName;
	}

	public String getMouldName() {
		return mouldName;
	}

	public void setMouldName(String mouldName) {
		this.mouldName = mouldName;
	}

	public BigDecimal getMouldNum() {
		return mouldNum;
	}

	public void setMouldNum(BigDecimal mouldNum) {
		this.mouldNum = mouldNum;
	}
	
}
