package com.broit.model.dto;

import com.broit.model.AccCotsFault;


public class AccCotsFaultDto extends AccCotsFault {

	public String cotsname;
	
	public String typename;


	public String getCotsname() {
		return cotsname;
	}

	public void setCotsname(String cotsname) {
		this.cotsname = cotsname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	
}
