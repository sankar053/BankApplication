/**
 * 
 */
package com.icici.bankapplication.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.icici.bankapplication.dto.Account;
import com.icici.bankapplication.service.BankingService;

/**
 * @author admin
 *
 */
@Service
public class BankingServiceImpl implements BankingService {

	private List<Account> al = new ArrayList<>();

	@Override
	public Account create(Account ac) {
		// TODO Auto-generated method stub
		ac.setAccountNo("9204" + Math.random());
		al.add(ac);
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
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return al;
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
