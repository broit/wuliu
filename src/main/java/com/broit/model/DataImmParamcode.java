package com.broit.model;

import java.math.BigDecimal;

public class DataImmParamcode  implements IBaseModel{
    private String id;

    private String param;

    private String paramcode;
    
    private BigDecimal serial;

    private String isusable;

    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getParamcode() {
        return paramcode;
    }

    public void setParamcode(String paramcode) {
        this.paramcode = paramcode == null ? null : paramcode.trim();
    }

    public String getIsusable() {
        return isusable;
    }

    public void setIsusable(String isusable) {
        this.isusable = isusable == null ? null : isusable.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}
    
}