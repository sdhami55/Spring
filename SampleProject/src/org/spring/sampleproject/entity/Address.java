package org.spring.sampleproject.entity;

public class Address {
	
	private String 	hNo;
	private String 	street;
	private String 	area;
	private String 	city;
	private String 	zipCode;
	public Address() {
		super();
	}
	
	public Address(String hNo, String street, String area, String city, String zipCode) {
		super();
		this.hNo = hNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", area=" + area + ", city=" + city + ", zipCode="
				+ zipCode + "]";
	}
	
	
	
	
	
	

}
