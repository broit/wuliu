package com.broit.model.dto;

import com.broit.model.AccImmFault;

public class AccImmFaultDto extends AccImmFault {

	public String immname;
	
	public String typename;

	

	public String getImmname() {
		return immname;
	}

	public void setImmname(String immname) {
		this.immname = immname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	
}
