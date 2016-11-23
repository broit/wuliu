package com.broit.model.dto;

import java.util.List;

import com.broit.model.AccImm;

public class H5Group {
	
	private AccImm imm;
	
	private List<H5Plan> planList;
	
	private double grids;
	
	private double startGrid;
	
	private long minTime;

	public AccImm getImm() {
		return imm;
	}

	public void setImm(AccImm imm) {
		this.imm = imm;
	}

	public List<H5Plan> getPlanList() {
		return planList;
	}

	public void setPlanList(List<H5Plan> planList) {
		this.planList = planList;
	}

	public double getGrids() {
		return grids;
	}

	public void setGrids(double grids) {
		this.grids = grids;
	}

	public long getMinTime() {
		return minTime;
	}

	public void setMinTime(long minTime) {
		this.minTime = minTime;
	}

	public double getStartGrid() {
		return startGrid;
	}

	public void setStartGrid(double startGrid) {
		this.startGrid = startGrid;
	}
}
