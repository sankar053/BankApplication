package com.icici.bankapplication.dto;

public class Address {
	
	private String addresssL1;
	
	private String addresssL2;
	
	private String pinCode;
	
	private String city;
	
	private String state;
	
	
	
	

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param addresssL1
	 * @param addresssL2
	 * @param pinCode
	 * @param city
	 * @param state
	 */
	public Address(String addresssL1, String addresssL2, String pinCode, String city, String state) {
		super();
		this.addresssL1 = addresssL1;
		this.addresssL2 = addresssL2;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
	}

	/**
	 * @return the addresssL1
	 */
	public String getAddresssL1() {
		return addresssL1;
	}

	/**
	 * @param addresssL1 the addresssL1 to set
	 */
	public void setAddresssL1(String addresssL1) {
		this.addresssL1 = addresssL1;
	}

	/**
	 * @return the addresssL2
	 */
	public String getAddresssL2() {
		return addresssL2;
	}

	/**
	 * @param addresssL2 the addresssL2 to set
	 */
	public void setAddresssL2(String addresssL2) {
		this.addresssL2 = addresssL2;
	}

	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
	
	

}
