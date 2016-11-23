package com.broit.model.dto;

import java.util.List;

import com.broit.model.BaseBranch;
import com.broit.model.BaseTeam;
import com.broit.model.BaseWs;

public class BaseTeamDto extends BaseTeam{

	private String branchid;
	
	private String branchName;
	
	private String wsName;
	
	private String shiftName;
	
	private List<BaseBranch> branchList;
	
	private List<BaseWs> wsList;

	public String getBranchid() {
		return branchid;
	}

	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getWsName() {
		return wsName;
	}

	public void setWsName(String wsName) {
		this.wsName = wsName;
	}

	public List<BaseBranch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<BaseBranch> branchList) {
		this.branchList = branchList;
	}

	public List<BaseWs> getWsList() {
		return wsList;
	}

	public void setWsList(List<BaseWs> wsList) {
		this.wsList = wsList;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}
}
