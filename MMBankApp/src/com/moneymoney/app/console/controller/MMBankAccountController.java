package com.moneymoney.app.console.controller;

import java.util.Collection;
import java.util.Map;

import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.controller.BankController;
import com.moneymoney.app.model.factory.*;

public class MMBankAccountController extends BankController {
	
	MMBankFactory bankFactory = new MMBankFactory();
	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		
		
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> savingsAccount) {
		
		bankFactory.createNewSavingsAccount(savingsAccount);
	}

	@Override
	public Collection<BankAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
