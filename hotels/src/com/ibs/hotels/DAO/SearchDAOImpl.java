package com.ibs.hotels.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ibs.hotels.form.Hotel;
import com.ibs.hotels.json.HotelListRespons;

@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO{
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom ){
		List<Hotel> htlLst = new ArrayList<Hotel>();
		htlLst.add(new Hotel("Taj", "Mumbai", new BigDecimal(15000)));
		htlLst.add(new Hotel("Marriot", "Mumbai",  new BigDecimal(8000)));
		htlLst.add(new Hotel("Paradise", "Mumbai",  new BigDecimal(7000)));
		htlLst.add(new Hotel("DTDC", "Mumbai",  new BigDecimal(6000)));
		
		String url = "http://api.ean.com/ean-services/rs/hotel/v3/list?" +
				"&apiKey=3n2ek8y77sgyx7ur7zwk79fm" +
				"&arrivalDate=03/22/2014" +
				"&departureDate=03/24/2014" +
				"&room1=1,5,12" +
				"&city=Chicago" +
				"&numberOfResults=2";
		//RestTemplate restTemplate = new RestTemplate();
		 
		//Create a list for the message converters
		 
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		 
		//Add the Jackson Message converter
		messageConverters.add(new MarshallingHttpMessageConverter());
		 
		//Add the message converters to the restTemplate
		restTemplate.setMessageConverters(messageConverters);
		 
		//A simple GET request, the response will be mapped to Example.class
		HotelListRespons result = restTemplate.getForObject(url, HotelListRespons.class);
		
		System.out.println(result);
		return htlLst;
	}

}
