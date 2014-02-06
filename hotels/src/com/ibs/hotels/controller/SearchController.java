/*
 * @author Satheesh.C.K
 * @project hotels
 * Date Created:22 Jan 2014
 * 
 * */

package com.ibs.hotels.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibs.hotels.form.Hotel;
import com.ibs.hotels.form.SearchMenu;
import com.ibs.hotels.form.SearchMenuValidator;
import com.ibs.hotels.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchMenuValidator searchValidator;
	
	private ConversionService conversionService;
	
	/*private FormattingConversionServiceFactoryBean conversionService;*/


	@InitBinder
	private void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
		binder.setValidator(searchValidator);
		binder.setConversionService(conversionService);
	}

	@Autowired
	private SearchService searchService;

	@RequestMapping("/search")
	public ModelAndView showContacts() {

		return new ModelAndView("searchHome", "newSearch", new SearchMenu());
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public ModelAndView listHotels(
			@ModelAttribute("newSearch") SearchMenu srch,
			/* @ModelAttribute("newSearch") @Valid SearchMenu srch, */
			BindingResult result) {
		searchValidator.validate(srch, result);
		if (result.hasErrors()) {
			return new ModelAndView("searchHome", "newSearch", srch);
		} else {
			List<Hotel> htlLst = new ArrayList<Hotel>();
			Map<String, Object> map = new HashMap<String, Object>();
			System.out.println(srch);
			htlLst = searchService.listHotels(srch.getLocation(),
					srch.getCheckIn(), srch.getCheckOut(), srch.getNoOfRooms());
			map.put("newSearch", srch);
			map.put("hotelList", htlLst);

			return new ModelAndView("searchResult", map);
		}
	}

	@Valid
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

}
