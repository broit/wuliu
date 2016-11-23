package com.broit.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SysFunc implements Serializable,IBaseModel {
    private String funcUid;

    private String funcName;

    private String funcParent;

    private BigDecimal funcLevel;

    private String funcUrl;

    private String funcImg;

    private BigDecimal funcType;

    private BigDecimal funcIserial;

    private String funcRemark;
    
    private String rolefuncFuncid;
    
    private String funcCode;
    
    public String getFuncCode() {
		return funcCode;
	}

	public void setFuncCode(String funcCode) {
		this.funcCode = funcCode;
	}

	public String getRolefuncFuncid() {
		return rolefuncFuncid;
	}

	public void setRolefuncFuncid(String rolefuncFuncid) {
		this.rolefuncFuncid = rolefuncFuncid;
	}

	public long getChildrenCount() {
		return childrenCount;
	}

	public void setChildrenCount(long childrenCount) {
		this.childrenCount = childrenCount;
	}

	private long childrenCount = 0;

    private static final long serialVersionUID = 1L;

    public String getFuncUid() {
        return funcUid;
    }

    public void setFuncUid(String funcUid) {
        this.funcUid = funcUid == null ? null : funcUid.trim();
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getFuncParent() {
        return funcParent;
    }

    public void setFuncParent(String funcParent) {
        this.funcParent = funcParent == null ? null : funcParent.trim();
    }

    public BigDecimal getFuncLevel() {
        return funcLevel;
    }

    public void setFuncLevel(BigDecimal funcLevel) {
        this.funcLevel = funcLevel;
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl == null ? null : funcUrl.trim();
    }

    public String getFuncImg() {
        return funcImg;
    }

    public void setFuncImg(String funcImg) {
        this.funcImg = funcImg == null ? null : funcImg.trim();
    }

    public BigDecimal getFuncType() {
        return funcType;
    }

    public void setFuncType(BigDecimal funcType) {
        this.funcType = funcType;
    }

    public BigDecimal getFuncIserial() {
        return funcIserial;
    }

    public void setFuncIserial(BigDecimal funcIserial) {
        this.funcIserial = funcIserial;
    }

    public String getFuncRemark() {
        return funcRemark;
    }

    public void setFuncRemark(String funcRemark) {
        this.funcRemark = funcRemark == null ? null : funcRemark.trim();
    }

	@Override
	public String getId() {
		return this.funcUid;
	}
}