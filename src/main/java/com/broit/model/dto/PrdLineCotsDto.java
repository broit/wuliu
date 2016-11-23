package com.broit.model.dto;

import com.broit.model.PrdLineCots;

public class PrdLineCotsDto extends PrdLineCots{

	private String name;
	
	private String no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public String getRemark(){
		return this.getPosition();
	}
}
