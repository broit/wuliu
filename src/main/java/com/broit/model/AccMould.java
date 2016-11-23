package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.util.DateSerializer;

public class AccMould  implements IBaseModel{
    private String id;

    private String name;

    private String no;

    private String brand;

    private String model;

    private BigDecimal num;

    private String origin;

    private Date makedate;

    private String ishotrunner;

    private String isneedlevalve;

    private String haspourgate;

    private String material;

    private BigDecimal weight;

    private String mouldsize;

    private String fixedmode;

    private String specialset;

    private String coolingmode;

    private String needleresetmode;

    private String surface;

    private Date prddate;

    private String remark;

    private String creater;

    private Date createdate;
    
    private String immid;

    public String getImmid() {
		return immid;
	}

	public void setImmid(String immid) {
		this.immid = immid;
	}

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

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    @JsonSerialize(using = DateSerializer.class)
    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getIshotrunner() {
        return ishotrunner;
    }

    public void setIshotrunner(String ishotrunner) {
        this.ishotrunner = ishotrunner == null ? null : ishotrunner.trim();
    }

    public String getIsneedlevalve() {
        return isneedlevalve;
    }

    public void setIsneedlevalve(String isneedlevalve) {
        this.isneedlevalve = isneedlevalve == null ? null : isneedlevalve.trim();
    }

    public String getHaspourgate() {
        return haspourgate;
    }

    public void setHaspourgate(String haspourgate) {
        this.haspourgate = haspourgate == null ? null : haspourgate.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getMouldsize() {
        return mouldsize;
    }

    public void setMouldsize(String mouldsize) {
        this.mouldsize = mouldsize == null ? null : mouldsize.trim();
    }

    public String getFixedmode() {
        return fixedmode;
    }

    public void setFixedmode(String fixedmode) {
        this.fixedmode = fixedmode == null ? null : fixedmode.trim();
    }
 
    public String getSpecialset() {
        return specialset;
    }

    public void setSpecialset(String specialset) {
        this.specialset = specialset == null ? null : specialset.trim();
    }

    public String getCoolingmode() {
        return coolingmode;
    }

    public void setCoolingmode(String coolingmode) {
        this.coolingmode = coolingmode == null ? null : coolingmode.trim();
    }

    public String getNeedleresetmode() {
        return needleresetmode;
    }

    public void setNeedleresetmode(String needleresetmode) {
        this.needleresetmode = needleresetmode == null ? null : needleresetmode.trim();
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface == null ? null : surface.trim();
    }
    @JsonSerialize(using = DateSerializer .class)
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}