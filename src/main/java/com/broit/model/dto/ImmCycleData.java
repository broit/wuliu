package com.broit.model.dto;

public class ImmCycleData {

	private double cycleCount;
	
	private double cycleTime;
	
	private double injectionTime;
	
	private double plasticizingTime;
	
	private double injectionEndPosition;
	
	private double plasticizingEndPosition;

	public double getCycleCount() {
		return cycleCount;
	}

	public void setCycleCount(double cycleCount) {
		this.cycleCount = cycleCount;
	}

	public double getCycleTime() {
		return cycleTime;
	}

	public void setCycleTime(double cycleTime) {
		this.cycleTime = cycleTime;
	}

	public double getInjectionTime() {
		return injectionTime;
	}

	public void setInjectionTime(double injectionTime) {
		this.injectionTime = injectionTime;
	}

	public double getPlasticizingTime() {
		return plasticizingTime;
	}

	public void setPlasticizingTime(double plasticizingTime) {
		this.plasticizingTime = plasticizingTime;
	}

	public double getInjectionEndPosition() {
		return injectionEndPosition;
	}

	public void setInjectionEndPosition(double injectionEndPosition) {
		this.injectionEndPosition = injectionEndPosition;
	}

	public double getPlasticizingEndPosition() {
		return plasticizingEndPosition;
	}

	public void setPlasticizingEndPosition(double plasticizingEndPosition) {
		this.plasticizingEndPosition = plasticizingEndPosition;
	}
}
