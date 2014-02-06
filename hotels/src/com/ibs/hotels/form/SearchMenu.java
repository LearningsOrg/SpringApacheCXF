package com.ibs.hotels.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class SearchMenu {
	private String location;
	private Date checkIn;
	private Date checkOut;

	@NumberFormat(style = Style.NUMBER)
	private Integer noOfRooms;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public SearchMenu() {
		super();
	}

	public SearchMenu(String location, Date checkIn, Date checkOut,
			Integer noOfRooms) {
		super();
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.noOfRooms = noOfRooms;
	}

	@Override
	public String toString() {

		return "location=" + location + ",checkIn=" + checkIn + ",checkOut="
				+ checkOut + "Number of Rooms=" + noOfRooms;
	}

}
