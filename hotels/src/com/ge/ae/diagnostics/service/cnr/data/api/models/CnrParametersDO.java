package com.ge.ae.diagnostics.service.cnr.data.api.models;

public class CnrParametersDO {
	String parameterName;
	String flightPhase;
	int enginePosition;
	int startValue;
	int endValue;
	int overallChange;
	String cnrNumber;
	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getFlightPhase() {
		return flightPhase;
	}
	public void setFlightPhase(String flightPhase) {
		this.flightPhase = flightPhase;
	}
	public int getEnginePosition() {
		return enginePosition;
	}
	public void setEnginePosition(int enginePosition) {
		this.enginePosition = enginePosition;
	}
	public int getStartValue() {
		return startValue;
	}
	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}
	public int getEndValue() {
		return endValue;
	}
	public void setEndValue(int endValue) {
		this.endValue = endValue;
	}
	public int getOverallChange() {
		return overallChange;
	}
	public void setOverallChange(int overallChange) {
		this.overallChange = overallChange;
	}
	public String getCnrNumber() {
		return cnrNumber;
	}
	public void setCnrNumber(String cnrNumber) {
		this.cnrNumber = cnrNumber;
	}
	
	
}
