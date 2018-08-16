package com.cg.spring.mvc.bankApp.services;

import java.util.Collection;

import com.cg.spring.mvc.bankApp.dao.DaoBankAppImpl;
import com.cg.spring.mvc.bankApp.pojo.BankAccount;
import com.cg.spring.mvc.bankApp.pojo.CurrentAccount;
import com.cg.spring.mvc.bankApp.pojo.Customer;
import com.cg.spring.mvc.bankApp.pojo.SavingsAccount;

public class ServicesBankApp {

	DaoBankAppImpl dao = new DaoBankAppImpl();
	
	public void populateAccount() {
		dao.populateAccounts();
	}
	
	public void addSavingsAccount(Customer customer, int balance, boolean isSalaried) {
		dao.addSavingsAccount(customer, balance, isSalaried);
	}

	public void addCurrentAccount(Customer customer, int balance, int odLimit) {
		dao.addCurrentAccount(customer, balance, odLimit);
	}
	public Collection<BankAccount> viewAllAccounts() {
		return dao.viewAllAccounts();
	}
	
	public int deposit (int accNo, int amount) {
		System.out.println("running deposit service");
		//dao.deposit(accNo, amount);
		return dao.deposit(accNo, amount);
	}
	public int withdraw (int accNo, int amount) {
		System.out.println("running withdraw service");
		//dao.deposit(accNo, amount);
		return dao.withdraw(accNo, amount);
	}
}
