package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NightlyRate")
public class NightlyRate {
	@XmlAttribute(name = "baseRate")
	String baseRate;
	
	@XmlAttribute(name = "rate")
	String rate;
	
	@XmlAttribute(name = "promo")
	String promo;

	public String getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(String baseRate) {
		this.baseRate = baseRate;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}
	
	
}
