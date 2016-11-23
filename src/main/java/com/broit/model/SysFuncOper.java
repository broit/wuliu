package com.broit.model;

public class SysFuncOper implements IBaseModel{
    private String operUid;

    private String operCode;

    private String operFunc;

    public String getOperUid() {
        return operUid;
    }

    public void setOperUid(String operUid) {
        this.operUid = operUid == null ? null : operUid.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getOperFunc() {
        return operFunc;
    }

    public void setOperFunc(String operFunc) {
        this.operFunc = operFunc == null ? null : operFunc.trim();
    }

	@Override
	public String getId() {
		return this.getOperUid();
	}
}