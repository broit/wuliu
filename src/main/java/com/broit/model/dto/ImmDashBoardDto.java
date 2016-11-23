package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.broit.model.DataImmProtoalerm;

public class ImmDashBoardDto {
	
	private String id;

	private String name;
	
	private String no;
	
	private String brand;
	
	private String model;
	
	private String status;
	
	private BigDecimal opmodel;
	
	private BigDecimal producenum;
	
	private BigDecimal readynum;
	
	private String prtname;
	
	private String planNo;
	
	private Date planedate;
	
	private List<DataImmProtoalerm> alerms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getOpmodel() {
		return opmodel;
	}

	public void setOpmodel(BigDecimal opmodel) {
		this.opmodel = opmodel;
	}

	public BigDecimal getProducenum() {
		return producenum;
	}

	public void setProducenum(BigDecimal producenum) {
		this.producenum = producenum;
	}

	public BigDecimal getReadynum() {
		return readynum;
	}

	public void setReadynum(BigDecimal readynum) {
		this.readynum = readynum;
	}

	public String getPrtname() {
		return prtname;
	}

	public void setPrtname(String prtname) {
		this.prtname = prtname;
	}

	public String getPlanNo() {
		return planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getPlanedate() {
		return planedate;
	}

	public void setPlanedate(Date planedate) {
		this.planedate = planedate;
	}

	public List<DataImmProtoalerm> getAlerms() {
		return alerms;
	}

	public void setAlerms(List<DataImmProtoalerm> alerms) {
		this.alerms = alerms;
	}
}
