package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.util.DateTimeSerializer;



public class AccAmmeter implements IBaseModel{
	
	private String id;
	
	private String name;
	
	private String no;
	
	private String brand;
	
	private String model;
	
	private Date prddate;
	
	private BigDecimal initemn;
	
	private BigDecimal nowemn;
	
	private String remark;
	
	private String creater;
	
	private Date createdate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
	@JsonSerialize(using = DateTimeSerializer .class)
	public Date getPrddate() {
		return prddate;
	}

	public void setPrddate(Date prddate) {
		this.prddate = prddate;
	}

	public BigDecimal getInitemn() {
		return initemn;
	}

	public void setInitemn(BigDecimal initemn) {
		this.initemn = initemn;
	}

	public BigDecimal getNowemn() {
		return nowemn;
	}

	public void setNowemn(BigDecimal nowemn) {
		this.nowemn = nowemn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
		
}