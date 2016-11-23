package com.broit.model.dto;

import com.broit.model.PrdLineOwner;

public class PrdLineOwnerDto extends PrdLineOwner{

	/**分公司名称*/
	private String branch;
	
	/**车间名称*/
	private String ws;
	
	/**班组名称*/
	private String team;
	
	/**用户姓名*/
	private String name;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getWs() {
		return ws;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
