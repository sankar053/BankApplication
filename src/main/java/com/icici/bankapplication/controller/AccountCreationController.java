/**
 * 
 */
package com.icici.bankapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icici.bankapplication.dao.AccountDao;
import com.icici.bankapplication.dto.Account;
import com.icici.bankapplication.service.BankingService;

/**
 * @author Emmanuvel
 *
 */
@RestController
@RequestMapping("/icici")
public class AccountCreationController {

	@Autowired
	private BankingService bankingService;

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {

		List<AccountDao> accList = bankingService.getAll();
		if(accList.isEmpty())
			new ResponseEntity("No Data Found", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity(accList, HttpStatus.OK);
	}

	@GetMapping("/getAccountNo/{accNo}/{dob}")
	public ResponseEntity<?> myAcccout(@PathVariable(name = "accNo", required = true) String accNo,
			@PathVariable(name = "dob", required = true) String dob) {
		AccountDao accountDao = bankingService.getByAccountNo(accNo,dob);
		return ResponseEntity.ok(accountDao);
	}




	@PostMapping
	public ResponseEntity<?> CreateAccount(@Valid @RequestBody Account accDto) {

		
		Account accDao = bankingService.create(accDto);

		ResponseEntity<Account> rs = new ResponseEntity(accDao, HttpStatus.OK);

		return rs;

	}

	@PutMapping
	public ResponseEntity<?> updateAccount(@Valid @RequestBody Account acDto) {

		AccountDao accDao = bankingService.update(acDto);
		ResponseEntity<Account> rs = new ResponseEntity(accDao, HttpStatus.OK);

		return rs;

	}



	@DeleteMapping
	public ResponseEntity<?> deleteAccount(@RequestParam Long accId) {

		Boolean flag = bankingService.delete(accId);
		if (flag) {
			return new ResponseEntity("Deleted SuccessFully", HttpStatus.OK);
		}
		return null;

	}



}