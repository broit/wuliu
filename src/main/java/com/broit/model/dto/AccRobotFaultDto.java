package com.broit.model.dto;

import com.broit.model.AccRobotFault;

public class AccRobotFaultDto extends AccRobotFault {

	public String robotname;
	
	public String typename;

	public String getRobotname() {
		return robotname;
	}

	public void setRobotname(String robotname) {
		this.robotname = robotname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	
}
