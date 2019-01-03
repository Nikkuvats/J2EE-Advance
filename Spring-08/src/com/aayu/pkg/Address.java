package com.aayu.pkg;

public class Address {
	private String addressline;
	private String state;
	private String country;

	public Address(String addressline,String state,String country)
	{
		
		this.addressline=addressline;
		this.state=state;
		this.country=country;
			
	}
	public String toString()
	{
		return addressline+":"+state+":"+country;		
	}
}
