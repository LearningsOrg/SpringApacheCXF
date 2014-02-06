package com.ibs.hotels.form;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MoneyFormatter implements Formatter<String>{
	
	private String pattern;

	@Override
	public String parse(String currency, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print(String currency, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public MoneyFormatter(String pattern) {
		super();
		this.pattern = pattern;
	}
	
	protected Currency getCurrencyFormat(Locale locale) {
        /*DateFormat dateFormat = new SimpleDateFormat(this.pattern, locale);
        dateFormat.setLenient(false);
        return dateFormat;*/
		return null;
    }

}
