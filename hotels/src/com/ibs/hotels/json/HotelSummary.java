package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HotelSummary")
public class HotelSummary {
	@XmlAttribute(name="order")
	Integer order;
	
	@XmlElement(name = "hotelId")
	Integer hotelId;
	
	@XmlElement(name = "name")
	String name;
	
	@XmlElement(name = "address1")
	String address1;
	
	@XmlElement(name = "city")
	String city;
	
	@XmlElement(name = "stateProvinceCode")
	String stateProvinceCode;
	
	@XmlElement(name = "postalCode")
	String postalCode;
	
	@XmlElement(name = "countryCode")
	String countryCode;
	
	@XmlElement(name = "airportCode")
	String airportCode;
	
	@XmlElement(name = "supplierType")
	String supplierType;
	
	@XmlElement(name = "propertyCategory")
	String propertyCategory;
	
	@XmlElement(name = "hotelRating")
	String hotelRating;
	
	@XmlElement(name = "confidenceRating")
	String confidenceRating;
	
	@XmlElement(name = "amenityMask")
	String amenityMask;
	
	@XmlElement(name = "tripAdvisorRating")
	String tripAdvisorRating;
	
	@XmlElement(name = "locationDescription")
	String locationDescription;
	
	@XmlElement(name = "shortDescription")
	String shortDescription;
	
	@XmlElement(name = "highRate")
	String highRate;
	
	@XmlElement(name = "lowRate")
	String lowRate;
	
	@XmlElement(name = "rateCurrencyCode")
	String rateCurrencyCode;
	
	@XmlElement(name = "latitude")
	String latitude;
	
	@XmlElement(name = "longitude")
	String longitude;
	
	@XmlElement(name = "proximityDistance")
	String proximityDistance;
	
	@XmlElement(name = "proximityUnit")
	String proximityUnit;
	
	@XmlElement(name = "hotelInDestination")
	Boolean hotelInDestination;
	
	@XmlElement(name = "thumbNailUrl")
	String thumbNailUrl;
	
	@XmlElement(name = "deepLink")
	String deepLink;
	
	@XmlElement(name = "RoomRateDetailsList")
	RoomRateDetailsList roomRateDetailsList;

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvinceCode() {
		return stateProvinceCode;
	}

	public void setStateProvinceCode(String stateProvinceCode) {
		this.stateProvinceCode = stateProvinceCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public String getPropertyCategory() {
		return propertyCategory;
	}

	public void setPropertyCategory(String propertyCategory) {
		this.propertyCategory = propertyCategory;
	}

	public String getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}

	public String getConfidenceRating() {
		return confidenceRating;
	}

	public void setConfidenceRating(String confidenceRating) {
		this.confidenceRating = confidenceRating;
	}

	public String getAmenityMask() {
		return amenityMask;
	}

	public void setAmenityMask(String amenityMask) {
		this.amenityMask = amenityMask;
	}

	public String getTripAdvisorRating() {
		return tripAdvisorRating;
	}

	public void setTripAdvisorRating(String tripAdvisorRating) {
		this.tripAdvisorRating = tripAdvisorRating;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getHighRate() {
		return highRate;
	}

	public void setHighRate(String highRate) {
		this.highRate = highRate;
	}

	public String getLowRate() {
		return lowRate;
	}

	public void setLowRate(String lowRate) {
		this.lowRate = lowRate;
	}

	public String getRateCurrencyCode() {
		return rateCurrencyCode;
	}

	public void setRateCurrencyCode(String rateCurrencyCode) {
		this.rateCurrencyCode = rateCurrencyCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProximityDistance() {
		return proximityDistance;
	}

	public void setProximityDistance(String proximityDistance) {
		this.proximityDistance = proximityDistance;
	}

	public String getProximityUnit() {
		return proximityUnit;
	}

	public void setProximityUnit(String proximityUnit) {
		this.proximityUnit = proximityUnit;
	}

	public Boolean getHotelInDestination() {
		return hotelInDestination;
	}

	public void setHotelInDestination(Boolean hotelInDestination) {
		this.hotelInDestination = hotelInDestination;
	}

	public String getThumbNailUrl() {
		return thumbNailUrl;
	}

	public void setThumbNailUrl(String thumbNailUrl) {
		this.thumbNailUrl = thumbNailUrl;
	}

	public String getDeepLink() {
		return deepLink;
	}

	public void setDeepLink(String deepLink) {
		this.deepLink = deepLink;
	}

	public RoomRateDetailsList getRoomRateDetailsList() {
		return roomRateDetailsList;
	}

	public void setRoomRateDetailsList(RoomRateDetailsList roomRateDetailsList) {
		this.roomRateDetailsList = roomRateDetailsList;
	}
	
	
}
