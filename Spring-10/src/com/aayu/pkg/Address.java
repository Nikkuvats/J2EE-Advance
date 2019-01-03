package com.aayu.pkg;

public class Address {
	
	private String addressline;
	private String city;
	private String state;
	private String country;
	
	
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString()
	{
		return addressline+":"+city+":"+state+":"+country;
	}	
}
