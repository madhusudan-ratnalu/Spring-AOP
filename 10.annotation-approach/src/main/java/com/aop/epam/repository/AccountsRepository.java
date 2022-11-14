package com.aop.epam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aop.epam.model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

	
}