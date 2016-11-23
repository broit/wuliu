package com.broit.model;

import java.math.BigDecimal;

public class WmsGoodsBatch implements IBaseModel{
    private String id;

    private String goodsId;

    private String batchtype;

    private String name;

    private BigDecimal stock;
    
    private String isdefault;

    public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getBatchtype() {
        return batchtype;
    }

    public void setBatchtype(String batchtype) {
        this.batchtype = batchtype == null ? null : batchtype.trim();
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
}