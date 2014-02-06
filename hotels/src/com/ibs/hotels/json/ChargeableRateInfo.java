package com.ibs.hotels.json;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;;

@XmlRootElement(name = "ChargeableRateInfo")
public class ChargeableRateInfo {
	@XmlAttribute(name = "averageBaseRate")
	String averageBaseRate;
	
	@XmlAttribute(name = "averageRate")
	String averageRate;
	
	@XmlAttribute(name = "commissionableUsdTotal")
	String commissionableUsdTotal;
	
	@XmlAttribute(name = "currencyCode")
	String currencyCode;
	
	@XmlAttribute(name = "maxNightlyRate")
	String maxNightlyRate;
	
	@XmlAttribute(name = "nightlyRateTotal")
	String nightlyRateTotal;
	
	@XmlAttribute(name = "surchargeTotal")
	String surchargeTotal;
	
	@XmlAttribute(name = "total")
	String total;
	
	@XmlElement(name = "NightlyRatesPerRoom")
	NightlyRatesPerRoom nightlyRatesPerRoom;
	
	@XmlElement(name = "Surcharges")
	Surcharges surcharges;

	public String getAverageBaseRate() {
		return averageBaseRate;
	}

	public void setAverageBaseRate(String averageBaseRate) {
		this.averageBaseRate = averageBaseRate;
	}

	public String getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(String averageRate) {
		this.averageRate = averageRate;
	}

	public String getCommissionableUsdTotal() {
		return commissionableUsdTotal;
	}

	public void setCommissionableUsdTotal(String commissionableUsdTotal) {
		this.commissionableUsdTotal = commissionableUsdTotal;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getMaxNightlyRate() {
		return maxNightlyRate;
	}

	public void setMaxNightlyRate(String maxNightlyRate) {
		this.maxNightlyRate = maxNightlyRate;
	}

	public String getNightlyRateTotal() {
		return nightlyRateTotal;
	}

	public void setNightlyRateTotal(String nightlyRateTotal) {
		this.nightlyRateTotal = nightlyRateTotal;
	}

	public String getSurchargeTotal() {
		return surchargeTotal;
	}

	public void setSurchargeTotal(String surchargeTotal) {
		this.surchargeTotal = surchargeTotal;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public NightlyRatesPerRoom getNightlyRatesPerRoom() {
		return nightlyRatesPerRoom;
	}

	public void setNightlyRatesPerRoom(NightlyRatesPerRoom nightlyRatesPerRoom) {
		this.nightlyRatesPerRoom = nightlyRatesPerRoom;
	}

	public Surcharges getSurcharges() {
		return surcharges;
	}

	public void setSurcharges(Surcharges surcharges) {
		this.surcharges = surcharges;
	}
	
	
}
