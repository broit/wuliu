package com.broit.model.dto;

import java.util.List;

import com.broit.model.SysFuncOper;

public class FuncOperListDto {

	private String funcUid;
	
	private List<SysFuncOper> list;

	public String getFuncUid() {
		return funcUid;
	}

	public void setFuncUid(String funcUid) {
		this.funcUid = funcUid;
	}

	public List<SysFuncOper> getList() {
		return list;
	}

	public void setList(List<SysFuncOper> list) {
		this.list = list;
	}
}
