package com.bank;

import java.math.BigDecimal;

import com.banking.actions.Actions;

public class Main {

	public static void main(String[] args) {
		
       User bankUser= new User("Ahmed", "Ahmed@123",new BigDecimal(120000));
       
       Actions.balanceInquiry(bankUser);
       Actions.deposit(bankUser, new BigDecimal(5000));
       Actions.withdrawl(bankUser, new BigDecimal(3000));
       BigDecimal balanceAfterInterest= bankUser.calculateIntrest();
       System.out.println("Your balance after adding interest will be :"+balanceAfterInterest);
       
	}

}
