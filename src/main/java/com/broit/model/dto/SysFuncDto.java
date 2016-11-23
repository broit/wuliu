package com.broit.model.dto;

import java.util.List;

import com.broit.model.SysFunc;

public class SysFuncDto extends SysFunc {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1917373680775843164L;

	private String funcParentName;
	
	private List<SysFuncDto> otherFuncs;

	public String getFuncParentName() {
		return funcParentName;
	}

	public void setFuncParentName(String funcParentName) {
		this.funcParentName = funcParentName;
	}

	public List<SysFuncDto> getOtherFuncs() {
		return otherFuncs;
	}

	public void setOtherFuncs(List<SysFuncDto> otherFuncs) {
		this.otherFuncs = otherFuncs;
	}
}
