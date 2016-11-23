package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.util.DateSerializer;
import com.broit.util.DateTimeSerializer;

public class AccImm  implements IBaseModel{
    private String id;

    private String name;

    private String no;

    private String brand;

    private String model;

    private BigDecimal ton;

    private String idnumber;

    private Date makedate;

    private BigDecimal mpower;

    private BigDecimal epower;

    private String bmaterial;

    private String screwmaterial;

    private String surface;

    private String isspecialscrew;

    private String screwdiam;

    private String sratio;

    private String maxshoot;

    private String molarnum;

    private String specilpro;

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

    public BigDecimal getTon() {
        return ton;
    }

    public void setTon(BigDecimal ton) {
        this.ton = ton;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    @JsonSerialize(using = DateSerializer.class)
    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public BigDecimal getMpower() {
        return mpower;
    }

    public void setMpower(BigDecimal mpower) {
        this.mpower = mpower;
    }

    public BigDecimal getEpower() {
        return epower;
    }

    public void setEpower(BigDecimal epower) {
        this.epower = epower;
    }

    public String getBmaterial() {
        return bmaterial;
    }

    public void setBmaterial(String bmaterial) {
        this.bmaterial = bmaterial == null ? null : bmaterial.trim();
    }

    public String getScrewmaterial() {
        return screwmaterial;
    }

    public void setScrewmaterial(String screwmaterial) {
        this.screwmaterial = screwmaterial == null ? null : screwmaterial.trim();
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface == null ? null : surface.trim();
    }

    public String getIsspecialscrew() {
        return isspecialscrew;
    }

    public void setIsspecialscrew(String isspecialscrew) {
        this.isspecialscrew = isspecialscrew == null ? null : isspecialscrew.trim();
    }

    public String getScrewdiam() {
        return screwdiam;
    }

    public void setScrewdiam(String screwdiam) {
        this.screwdiam = screwdiam == null ? null : screwdiam.trim();
    }

    public String getSratio() {
        return sratio;
    }

    public void setSratio(String sratio) {
        this.sratio = sratio == null ? null : sratio.trim();
    }

    public String getMaxshoot() {
        return maxshoot;
    }

    public void setMaxshoot(String maxshoot) {
        this.maxshoot = maxshoot == null ? null : maxshoot.trim();
    }

    public String getMolarnum() {
        return molarnum;
    }

    public void setMolarnum(String molarnum) {
        this.molarnum = molarnum == null ? null : molarnum.trim();
    }

    public String getSpecilpro() {
        return specilpro;
    }

    public void setSpecilpro(String specilpro) {
        this.specilpro = specilpro == null ? null : specilpro.trim();
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