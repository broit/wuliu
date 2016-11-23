package com.broit.model.dto;

import com.broit.model.SysFuncOper;

public class SysFuncOperDto extends SysFuncOper {

	public String operName;
	
	public String funcName;

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
	
	
}
