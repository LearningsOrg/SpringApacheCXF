package com.ibs.hotels.service;

import java.util.Date;
import java.util.List;

import com.ibs.hotels.form.Hotel;

public interface SearchService {
	
	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom );

}
