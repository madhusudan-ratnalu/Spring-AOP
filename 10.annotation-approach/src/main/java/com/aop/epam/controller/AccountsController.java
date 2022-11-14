package com.aop.epam.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.epam.model.Accounts;
import com.aop.epam.service.AccountsService;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

	@Autowired
	private AccountsService accountsService;

	@PostMapping
	public void saveAccountDetails(@RequestBody Accounts accounts) {
		accountsService.save(accounts);
	}

	@GetMapping("/{id}")
	public Accounts getAccountDetails(@PathVariable(value = "id") Integer accountId) {
		return accountsService.findById(accountId);
	}

}


//http://localhost:8080/accounts/1
//http://localhost:8080/accounts
