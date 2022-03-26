/**
 * 
 */
package com.icici.bankapplication.controller;

import java.util.List;

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

		List<Account> accList = bankingService.getAll();
		if(accList.isEmpty())
			new ResponseEntity("No Data Found", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity(accList, HttpStatus.OK);
	}

	@GetMapping("/getAccountNo/{accNo}")
	public ResponseEntity<?> myAcccout(@PathVariable(name = "accNo", required = true) String accNo) {
		Account accountDao = bankingService.getByAccountNo(accNo);
		return ResponseEntity.ok(accountDao);
	}




	@PostMapping
	public ResponseEntity<?> CreateAccount(@RequestBody Account accDto) {

		Account accDao = bankingService.create(accDto);

		ResponseEntity<Account> rs = new ResponseEntity(accDao, HttpStatus.OK);

		return rs;

	}

	@PutMapping
	public ResponseEntity<?> updateAccount(@RequestBody Account acDto) {

		Account accDao = bankingService.update(acDto);
		ResponseEntity<Account> rs = new ResponseEntity(accDao, HttpStatus.OK);

		return rs;

	}



	@DeleteMapping
	public ResponseEntity<?> deleteAccount(@RequestParam String accNo) {

		Boolean flag = bankingService.delete(accNo);
		if (flag) {
			return new ResponseEntity("Deleted SuccessFully", HttpStatus.OK);
		}
		return null;

	}



}