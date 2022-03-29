package com.icici.bankapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icici.bankapplication.dao.AccountDao;

public interface AccountRepo extends JpaRepository<AccountDao, Long> {

}
