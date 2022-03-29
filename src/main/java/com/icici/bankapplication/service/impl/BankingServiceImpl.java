/**
 * 
 */
package com.icici.bankapplication.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icici.bankapplication.dao.AccountDao;
import com.icici.bankapplication.dto.Account;
import com.icici.bankapplication.repo.AccountRepo;
import com.icici.bankapplication.service.BankingService;

/**
 * @author admin
 *
 */
@Service
public class BankingServiceImpl implements BankingService {

	private List<Account> al = new ArrayList<>();
	
	@Autowired
	AccountRepo accountRepo;

	@Override
	public Account create(Account ac) {
		// TODO Auto-generated method stub
		ac.setAccountNo("9204" + Math.random());
		al.add(ac);
		
		AccountDao accountDao =new AccountDao();
		accountDao.setAccountBal(ac.getAccountBal());
		accountDao.setAccountName(ac.getAccountName());
		accountDao.setAccountNo(ac.getAccountNo());
		accountDao.setDob(ac.getDob());
		
		accountRepo.save(accountDao);
		return ac;
	}

	@Override
	public boolean delete(String acctNo) {
		// TODO Auto-generated method stub

		if (!al.isEmpty()) {
			int index = 0;
			for (Account acc : al) {

				if (acc.getAccountNo().equalsIgnoreCase(acctNo)) {
					al.remove(index);
					return true;
				}
				index++;
			}
		}
		return false;
	}

	@Override
	public Account getByAccountNo(String acctNo) {
		// TODO Auto-generated method stub
		if (!al.isEmpty()) {
			int index = 0;
			for (Account acc : al) {

				if (acc.getAccountNo().equalsIgnoreCase(acctNo)) {
					return al.get(index);
				}
				index++;
			}
		}
		return null;
	}

	@Override
	public List<AccountDao> getAll() {
		// TODO Auto-generated method stub
		return accountRepo.findAll();
	}

	@Override
	public Account update(Account ac) {
		// TODO Auto-generated method stub
		if (!al.isEmpty()) {
			int index = 0;
			for (Account acc : al) {

				if (acc.getAccountNo().equalsIgnoreCase(ac.getAccountNo())) {
					Account old = al.get(index);
					old.setAccountName(ac.getAccountName());
					return old;
				}
				index++;
			}
		}
		return null;
	}

}
