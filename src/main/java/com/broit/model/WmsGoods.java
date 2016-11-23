package com.broit.model;

import java.math.BigDecimal;

public class WmsGoods implements IBaseModel{
    private String id;

    private String prtid;

    private String type;

    private String name;   
    
    private BigDecimal stock;

    private BigDecimal stockllimit;

    private BigDecimal stockulimit;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getStockllimit() {
        return stockllimit;
    }

    public void setStockllimit(BigDecimal stockllimit) {
        this.stockllimit = stockllimit;
    }

    public BigDecimal getStockulimit() {
        return stockulimit;
    }

    public void setStockulimit(BigDecimal stockulimit) {
        this.stockulimit = stockulimit;
    }
}