package com.broit.model;

import java.math.BigDecimal;

public class WmsMaterial implements IBaseModel{
    private String id;

    private String name;

    private String mark;

    private BigDecimal stock;

    private BigDecimal stockllimit;

    private BigDecimal stockulimit;

    private BigDecimal purchcycle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
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

    public BigDecimal getPurchcycle() {
        return purchcycle;
    }

    public void setPurchcycle(BigDecimal purchcycle) {
        this.purchcycle = purchcycle;
    }
}