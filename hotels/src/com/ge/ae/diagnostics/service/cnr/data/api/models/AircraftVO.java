package com.ge.ae.diagnostics.service.cnr.data.api.models;

import java.util.List;

public class AircraftVO {
	String aircraftType;
	String aircraftTailNumber;
	List<String> esns;
	public String getAircraftType() {
		return aircraftType;
	}
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	public String getAircraftTailNumber() {
		return aircraftTailNumber;
	}
	public void setAircraftTailNumber(String aircraftTailNumber) {
		this.aircraftTailNumber = aircraftTailNumber;
	}
	public List<String> getEsns() {
		return esns;
	}
	public void setEsns(List<String> esns) {
		this.esns = esns;
	}
	
	
}
