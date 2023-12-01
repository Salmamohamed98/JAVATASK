package com.bank;

import java.math.BigDecimal;

import com.banking.actions.InterestCalculator;

public class User implements InterestCalculator{
	private String name;
	private String Password;
	private BigDecimal balance;
	
	
	
	
	public User(String name, String password, BigDecimal balance) {
		super();
		this.name = name;
		Password = password;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public BigDecimal calculateIntrest() {
		double interest=3.5;
		return (this.balance).multiply(new BigDecimal(interest));
	}

	
	
	


}
