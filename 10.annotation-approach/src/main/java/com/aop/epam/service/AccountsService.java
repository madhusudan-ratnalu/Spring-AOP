package com.aop.epam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.epam.model.Accounts;
import com.aop.epam.repository.AccountsRepository;

@Service
public class AccountsService {

	@Autowired
	private AccountsRepository accountsRepository;

	public Accounts save(Accounts accounts) {
		return accountsRepository.save(accounts);
	}

	public Accounts findById(Integer id) {
		return accountsRepository.findById(id).orElseThrow();
	}
}
