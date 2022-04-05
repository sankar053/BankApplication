package com.icici.bankapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icici.bankapplication.dao.AccountDao;

@Repository
public interface AccountRepo extends JpaRepository<AccountDao, Long> {
	
	AccountDao findByAccountNoAndDob(String accountNo,String dob);
	

}
