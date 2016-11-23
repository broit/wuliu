package com.broit.model.dto;

import com.broit.model.AccMouldFault;

public class AccMouldFaultDto extends AccMouldFault {
	
	public String mouldname;
	
	public String typename;

	public String getMouldname() {
		return mouldname;
	}

	public void setMouldname(String mouldname) {
		this.mouldname = mouldname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	
}