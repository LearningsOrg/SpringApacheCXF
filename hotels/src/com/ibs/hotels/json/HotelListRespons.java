package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HotelListResponse")
public class HotelListRespons {
	
	@XmlElement(name = "customerSessionId")
	String customerSessionId;
	
	@XmlElement(name = "numberOfRoomsRequested")
	Integer numberOfRoomsRequested;
	
	@XmlElement(name = "moreResultsAvailable")
	Boolean moreResultsAvailable;
	
	@XmlElement(name = "cacheKey")
	String cacheKey;
	
	@XmlElement(name = "cacheLocation")
	String cacheLocation;
	
	@XmlElement(name = "HotelList")
	HotelList hotelList;

	public String getCustomerSessionId() {
		return customerSessionId;
	}

	public void setCustomerSessionId(String customerSessionId) {
		this.customerSessionId = customerSessionId;
	}

	public Integer getNumberOfRoomsRequested() {
		return numberOfRoomsRequested;
	}

	public void setNumberOfRoomsRequested(Integer numberOfRoomsRequested) {
		this.numberOfRoomsRequested = numberOfRoomsRequested;
	}

	public Boolean getMoreResultsAvailable() {
		return moreResultsAvailable;
	}

	public void setMoreResultsAvailable(Boolean moreResultsAvailable) {
		this.moreResultsAvailable = moreResultsAvailable;
	}

	public String getCacheKey() {
		return cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getCacheLocation() {
		return cacheLocation;
	}

	public void setCacheLocation(String cacheLocation) {
		this.cacheLocation = cacheLocation;
	}

	public HotelList getHotelList() {
		return hotelList;
	}

	public void setHotelList(HotelList hotelList) {
		this.hotelList = hotelList;
	}

}
