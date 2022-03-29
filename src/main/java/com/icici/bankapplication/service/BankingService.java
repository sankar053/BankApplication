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
	
	boolean delete(String acctNo);
	
	Account getByAccountNo(String acctNo);
	
	List<AccountDao> getAll();
	
	Account update(Account ac);

}
