/**
 * 
 */
package com.icici.bankapplication.service;

import java.util.List;

import com.icici.bankapplication.dao.AccountDao;
import com.icici.bankapplication.dto.Account;

/**
 * @author admin
 *
 */
public interface BankingService {
	
	
	Account create(Account ac);
	
	boolean delete(Long acctNo);
	
	AccountDao getByAccountNo(String acctNo,String dob);
	
	List<AccountDao> getAll();
	
	AccountDao update(Account ac);

}
