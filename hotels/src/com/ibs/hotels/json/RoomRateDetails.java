package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RoomRateDetails")
public class RoomRateDetails {
	@XmlElement(name = "roomTypeCode")
	String roomTypeCode;
	
	@XmlElement(name = "rateCode")
	String rateCode;
	
	@XmlElement(name = "maxRoomOccupancy")
	Integer maxRoomOccupancy;
	
	@XmlElement(name = "quotedRoomOccupancy")
	Integer quotedRoomOccupancy;
	
	@XmlElement(name = "minGuestAge")
	Integer minGuestAge;
	
	@XmlElement(name = "roomDescription")
	String roomDescription;
	
	@XmlElement(name = "promoId")
	String promoId;
	
	@XmlElement(name = "promoDescription")
	String promoDescription;
	
	@XmlElement(name = "currentAllotment")
	Integer currentAllotment;
	
	@XmlElement(name = "propertyAvailable")
	Boolean propertyAvailable;
	
	@XmlElement(name = "propertyRestricted")
	Boolean propertyRestricted;
	
	@XmlElement(name = "expediaPropertyId")
	String expediaPropertyId;
	
	@XmlElement(name = "rateKey")
	String rateKey;
	
	@XmlElement(name = "RateInfo")
	RateInfo rateInfo;
	
	@XmlElement(name = "ValueAdds")
	ValueAdds valueAdds;

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public Integer getMaxRoomOccupancy() {
		return maxRoomOccupancy;
	}

	public void setMaxRoomOccupancy(Integer maxRoomOccupancy) {
		this.maxRoomOccupancy = maxRoomOccupancy;
	}

	public Integer getQuotedRoomOccupancy() {
		return quotedRoomOccupancy;
	}

	public void setQuotedRoomOccupancy(Integer quotedRoomOccupancy) {
		this.quotedRoomOccupancy = quotedRoomOccupancy;
	}

	public Integer getMinGuestAge() {
		return minGuestAge;
	}

	public void setMinGuestAge(Integer minGuestAge) {
		this.minGuestAge = minGuestAge;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public String getPromoId() {
		return promoId;
	}

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getPromoDescription() {
		return promoDescription;
	}

	public void setPromoDescription(String promoDescription) {
		this.promoDescription = promoDescription;
	}

	public Integer getCurrentAllotment() {
		return currentAllotment;
	}

	public void setCurrentAllotment(Integer currentAllotment) {
		this.currentAllotment = currentAllotment;
	}

	public Boolean getPropertyAvailable() {
		return propertyAvailable;
	}

	public void setPropertyAvailable(Boolean propertyAvailable) {
		this.propertyAvailable = propertyAvailable;
	}

	public Boolean getPropertyRestricted() {
		return propertyRestricted;
	}

	public void setPropertyRestricted(Boolean propertyRestricted) {
		this.propertyRestricted = propertyRestricted;
	}

	public String getExpediaPropertyId() {
		return expediaPropertyId;
	}

	public void setExpediaPropertyId(String expediaPropertyId) {
		this.expediaPropertyId = expediaPropertyId;
	}

	public String getRateKey() {
		return rateKey;
	}

	public void setRateKey(String rateKey) {
		this.rateKey = rateKey;
	}

	public RateInfo getRateInfo() {
		return rateInfo;
	}

	public void setRateInfo(RateInfo rateInfo) {
		this.rateInfo = rateInfo;
	}

	public ValueAdds getValueAdds() {
		return valueAdds;
	}

	public void setValueAdds(ValueAdds valueAdds) {
		this.valueAdds = valueAdds;
	}
	
	
}
