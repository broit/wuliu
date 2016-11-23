package com.broit.model.dto;

import com.broit.model.PrdPlan;

public class H5Plan extends PrdPlan{

	private double grids;
	
	private double preSpace;
	
	private Long producenum;
	
	private String stopType;

	public double getGrids() {
		return grids;
	}

	public void setGrids(double grids) {
		this.grids = grids;
	}

	public Long getProducenum() {
		return producenum;
	}

	public void setProducenum(Long producenum) {
		this.producenum = producenum;
	}

	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	public double getPreSpace() {
		return preSpace;
	}

	public void setPreSpace(double preSpace) {
		this.preSpace = preSpace;
	}
	
}
