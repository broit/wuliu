package com.broit.model.dto;

import java.util.List;

import com.broit.model.BaseBranch;
import com.broit.model.BaseWs;

public class BaseWsDto extends BaseWs{

	private String branchName;
	
	private List<BaseBranch> branchList;

	public List<BaseBranch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<BaseBranch> branchList) {
		this.branchList = branchList;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
}
