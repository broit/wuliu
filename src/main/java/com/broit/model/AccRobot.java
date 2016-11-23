package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.util.DateSerializer;
import com.broit.util.DateTimeSerializer;

public class AccRobot  implements IBaseModel{
    private String id;

    private String name;

    private String no;

    private String brand;

    private String model;

    private String xroute;

    private String yroute;

    private String zroute;

    private BigDecimal swoopweight;

    private BigDecimal intramodetime;

    private Date prddate;

    private String remark;

    private String creater;

    private Date createdate;

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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getXroute() {
        return xroute;
    }

    public void setXroute(String xroute) {
        this.xroute = xroute == null ? null : xroute.trim();
    }

    public String getYroute() {
        return yroute;
    }

    public void setYroute(String yroute) {
        this.yroute = yroute == null ? null : yroute.trim();
    }

    public String getZroute() {
        return zroute;
    }

    public void setZroute(String zroute) {
        this.zroute = zroute == null ? null : zroute.trim();
    }

    public BigDecimal getSwoopweight() {
        return swoopweight;
    }

    public void setSwoopweight(BigDecimal swoopweight) {
        this.swoopweight = swoopweight;
    }

    public BigDecimal getIntramodetime() {
        return intramodetime;
    }

    public void setIntramodetime(BigDecimal intramodetime) {
        this.intramodetime = intramodetime;
    }
    
    @JsonSerialize(using = DateSerializer.class)
    public Date getPrddate() {
        return prddate;
    }

    public void setPrddate(Date prddate) {
        this.prddate = prddate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}