package com.ibs.hotels.json;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HotelList")
public class HotelList {
	@XmlAttribute(name = "size")
	Integer size;

	@XmlAttribute(name = "activePropertyCount")
	Integer activePropertyCount;

	@XmlElement(name = "HotelSummary")
	List<HotelSummary> hotelSummary;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getActivePropertyCount() {
		return activePropertyCount;
	}

	public void setActivePropertyCount(Integer activePropertyCount) {
		this.activePropertyCount = activePropertyCount;
	}

	public List<HotelSummary> getHotelSummary() {
		return hotelSummary;
	}

	public void setHotelSummary(List<HotelSummary> hotelSummary) {
		this.hotelSummary = hotelSummary;
	}

}
