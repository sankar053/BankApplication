package com.icici.bankapplication.dao;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "account_number")
	private String accountNo;

	@Column
	private String accountName;

	@Column
	private BigDecimal accountBal;

	@Column
	private String phoneNo;

	@Column
	private String dob;

	@Column
	private String ifscCode;
	
	

}
