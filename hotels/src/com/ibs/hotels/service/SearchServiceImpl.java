package com.ibs.hotels.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.hotels.DAO.SearchDAO;
import com.ibs.hotels.form.Hotel;




@Service("searchService")
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	private SearchDAO searchDAO;
	
	public void setSearchDAO(SearchDAO searchDAO) {
		this.searchDAO = searchDAO;
	}

	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom ){
		
		
		return  searchDAO.listHotels(location,checkIn,checkOut,noOfRoom );
		
	}

}
