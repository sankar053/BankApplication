package com.icici.bankapplication.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	private Long id;
	private String accountNo;

	@NotBlank(message = "Name is mandatory")
	@Schema(defaultValue = "sankar")
	private String accountName;
	
	@NotNull(message = "minimum balance need to give")
	private BigDecimal accountBal;

	@NotNull
	@Size(min = 10, message = "phoneNo should have atleast 10 characters")
	private String phoneNo;
	
	private String dob;
	private String ifscCode;
	private Address address;
	
	/*
	 * @Email private Sring emailAddress;
	 */

}
