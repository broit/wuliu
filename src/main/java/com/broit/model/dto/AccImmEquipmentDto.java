package com.broit.model.dto;

import java.util.ArrayList;


public class AccImmEquipmentDto extends AccImmDto{

	private ArrayList<AccMouldDto> moulds;	//模具列表
	private ArrayList<AccRobotDto> robots;	//模具列表
	private ArrayList<AccCotsDto> cotss;	//模具列表
	
	public ArrayList<AccMouldDto> getMoulds() {
		return moulds;
	}
	public void setMoulds(ArrayList<AccMouldDto> moulds) {
		this.moulds = moulds;
	}
	public ArrayList<AccRobotDto> getRobots() {
		return robots;
	}
	public void setRobots(ArrayList<AccRobotDto> robots) {
		this.robots = robots;
	}
	public ArrayList<AccCotsDto> getCotss() {
		return cotss;
	}
	public void setCotss(ArrayList<AccCotsDto> cotss) {
		this.cotss = cotss;
	}
	
	
}
