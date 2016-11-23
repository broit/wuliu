package com.broit.model;

import java.math.BigDecimal;

public class PrdPrtMaterial implements IBaseModel{
    private String id;

    private String prtid;

    private String materialtype;

    private String itemid;

    private BigDecimal evalnum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPrtid() {
        return prtid;
    }

    public void setPrtid(String prtid) {
        this.prtid = prtid == null ? null : prtid.trim();
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype == null ? null : materialtype.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public BigDecimal getEvalnum() {
        return evalnum;
    }

    public void setEvalnum(BigDecimal evalnum) {
        this.evalnum = evalnum;
    }
}