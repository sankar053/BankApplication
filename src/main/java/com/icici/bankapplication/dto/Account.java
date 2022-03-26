package com.icici.bankapplication.dto;

import java.math.BigDecimal;

public class Account {
	private String accountNo;
	private String accountName;
	private BigDecimal accountBal;
	private String phoneNo;
	private String dob;
	private String ifscCode;
	private Address address;
	
	
	
	
	
	/**
	 * 
	 */
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public BigDecimal getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(BigDecimal accountBal) {
		this.accountBal = accountBal;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	/**
	 * @param accountNo
	 * @param accountName
	 * @param accountBal
	 * @param phoneNo
	 * @param dob
	 * @param ifscCode
	 * @param address
	 */
	public Account(String accountNo, String accountName, BigDecimal accountBal, String phoneNo, String dob,
			String ifscCode, Address address) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBal = accountBal;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.ifscCode = ifscCode;
		this.address = address;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
