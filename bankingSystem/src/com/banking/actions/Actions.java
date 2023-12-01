package com.banking.actions;

import java.math.BigDecimal;

import com.bank.User;

public class Actions {
	
	public static void balanceInquiry(User user) {
		//fetch customer data 
		// read from database
		BigDecimal currentBalance=user.getBalance();
		System.out.println("your available balance is"+currentBalance);
	}
	public static void deposit(User user,BigDecimal enteredAmount) {
		// fetch customer data 
		// update customer record
		BigDecimal updatedBalance= enteredAmount.add(user.getBalance());
		user.setBalance(updatedBalance);
		System.out.println("amount is deposited successfully your available balance is : "+updatedBalance);	
	}
public static BigDecimal withdrawl (User user,BigDecimal enteredAmount) {
	//fetch balance data for the user 
	BigDecimal updatedBalance;
	BigDecimal currentBalance=user.getBalance();
	// check needed account is available to  withdraw;
	if(currentBalance.compareTo(enteredAmount) > 0) {
		updatedBalance= currentBalance.subtract(enteredAmount);
         // update customer record
		user.setBalance(updatedBalance);
		System.out.println("Please wait your transaction is processing");
		System.out.println(" Your available balance is : "+updatedBalance);	

		return enteredAmount;
	}else {
		System.out.println("You don't have enough balance");
		return null;
	}
	
}

}
