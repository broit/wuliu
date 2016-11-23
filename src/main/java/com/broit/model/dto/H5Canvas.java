package com.broit.model.dto;

import java.util.ArrayList;
import java.util.List;

public class H5Canvas {

	private Long startDate;
	
	private Double grids;
	
	private List<H5Group> groupList = new ArrayList<H5Group>();

	public List<H5Group> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<H5Group> groupList) {
		this.groupList = groupList;
	}

	public Long getStartDate() {
		return startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public Double getGrids() {
		return grids;
	}

	public void setGrids(Double grids) {
		this.grids = grids;
	}
}
