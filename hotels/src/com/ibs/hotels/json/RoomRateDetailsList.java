package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RoomRateDetailsList")
public class RoomRateDetailsList {
	@XmlElement(name = "RoomRateDetails")
	RoomRateDetails roomRateDetails;

	public RoomRateDetails getRoomRateDetails() {
		return roomRateDetails;
	}

	public void setRoomRateDetails(RoomRateDetails roomRateDetails) {
		this.roomRateDetails = roomRateDetails;
	}
	
}
