package com.hclamerica.challenge2;

public class Address {
	
	private String adressLine;
	private String zipCode;
	private String state;
	private String county;
	
	
	public Address() {
		super();
	}

	public Address(String adressLine, String state, String zipCode,
			String county) {
		super();
		this.adressLine = adressLine;
		this.zipCode = zipCode;
		this.state = state;
		this.county = county;
	}



	public String getAdressLine() {
		return adressLine;
	}


	public void setAdressLine(String adressLine) {
		this.adressLine = adressLine;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}
}