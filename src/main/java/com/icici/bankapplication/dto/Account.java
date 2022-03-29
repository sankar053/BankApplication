package com.icici.bankapplication.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private String accountNo;
	private String accountName;
	private BigDecimal accountBal;
	private String phoneNo;
	private String dob;
	private String ifscCode;
	private Address address;
	
	
	
	
	
	
	
	
	
	
	
}
