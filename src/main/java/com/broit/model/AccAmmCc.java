package com.broit.model;

import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.util.DateTimeSerializer;

public class AccAmmCc implements IBaseModel{
	
	private String id;
	
	private String ammid;
	
	private Date lastccdate;
	
	private BigDecimal lastemn;
	
	private BigDecimal nowemn;
	
	private BigDecimal epower;
	
	private BigDecimal serial;
	
	private String creater;
	
	private Date createdate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAmmid() {
		return ammid;
	}

	public void setAmmid(String ammid) {
		this.ammid = ammid;
	}
	@JsonSerialize(using = DateTimeSerializer .class)
	public Date getLastccdate() {
		return lastccdate;
	}

	public void setLastccdate(Date lastccdate) {
		this.lastccdate = lastccdate;
	}

	public BigDecimal getLastemn() {
		return lastemn;
	}

	public void setLastemn(BigDecimal lastemn) {
		this.lastemn = lastemn;
	}

	public BigDecimal getNowemn() {
		return nowemn;
	}

	public void setNowemn(BigDecimal nowemn) {
		this.nowemn = nowemn;
	}

	public BigDecimal getEpower() {
		return epower;
	}

	public void setEpower(BigDecimal epower) {
		this.epower = epower;
	}

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}
	@JsonSerialize(using = DateTimeSerializer .class)
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}	  
	
}