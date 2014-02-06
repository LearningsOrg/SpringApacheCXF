package com.ibs.hotels.form;

import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class SearchMenuValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {

		return SearchMenu.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object cls, Errors err) {
		SearchMenu mnu = (SearchMenu) cls;

		// Validations for Empty inputs -Start
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "location",
				"search.location.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "checkIn",
				"search.checkIn");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "checkOut",
				"search.checkOut");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "noOfRooms",
				"search.noOfRooms");
		// Validations for Empty inputs -End
		Integer noOfRooms = 0;
		noOfRooms = mnu.getNoOfRooms();
		Date checkIn = mnu.getCheckIn();

		Date checkOut = mnu.getCheckOut();
		System.out.println(checkOut);
		System.out.println(checkIn);

		if (noOfRooms != null && noOfRooms < 1) {
			err.rejectValue("noOfRooms", "search.noOfRooms.lessThenOne");
		}

		if (checkOut != null && checkIn != null) {
			if (checkOut.before(checkIn)) {
				err.rejectValue("checkOut", "search.checkOut.beforeCheckIn");
			}

		}

	}

}
