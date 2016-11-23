package com.broit.model;

import java.math.BigDecimal;

public class ServPrtFormulaItem implements IBaseModel{
    private String id;

    private String formulaid;

    private String materialtype;

    private BigDecimal rate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFormulaid() {
        return formulaid;
    }

    public void setFormulaid(String formulaid) {
        this.formulaid = formulaid == null ? null : formulaid.trim();
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype == null ? null : materialtype.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}