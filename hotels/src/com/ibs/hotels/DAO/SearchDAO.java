package com.ibs.hotels.DAO;

import java.util.Date;
import java.util.List;

import com.ibs.hotels.form.Hotel;

public interface SearchDAO {
	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom );
}
