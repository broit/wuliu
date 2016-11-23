package com.broit.model.dto;

import java.util.Date;

import com.broit.model.PrdPrtStatus;

public class PrdPrtStatusDto extends PrdPrtStatus{

	/**实际结束时间*/
	private Date realedate;
	
	/**停止方式:0,停止计划,1:停止并且开始下一计划*/
	private String stopType;
	
	/**调整方向 up:向上,down:向下,top:置顶*/
	private String direction;
	
	/**已完成数量*/
	private Long producenum;
	
	/**生产计划ID*/
	private String planid;

	public Date getRealedate() {
		return realedate;
	}

	public void setRealedate(Date realedate) {
		this.realedate = realedate;
	}

	/**停止方式:0,停止计划,1:停止并且开始下一计划*/
	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Long getProducenum() {
		return producenum;
	}

	public void setProducenum(Long producenum) {
		this.producenum = producenum;
	}

	public String getPlanid() {
		return planid;
	}

	public void setPlanid(String planid) {
		this.planid = planid;
	}
}
