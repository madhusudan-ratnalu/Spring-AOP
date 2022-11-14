package com.aop.epam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "full_name")
	private String accountHolderName;
	@Column(name = "account_type")
	private String accountType;
	private String city;
	private String state;
	private String country;
	private String pincode;
	@Column(name = "contact_number")
	private String contactNumber;

}
