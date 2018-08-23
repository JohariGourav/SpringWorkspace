package com.demo.Rest.Services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.demo.Rest.Dao.DaoBankAppImpl;
import com.demo.Rest.pojo.BankAccount;
import com.demo.Rest.pojo.CurrentAccount;
import com.demo.Rest.pojo.Customer;
import com.demo.Rest.pojo.SavingsAccount;

@Service
public class ServicesBankApp {

	DaoBankAppImpl dao = new DaoBankAppImpl();

	public void populateAccount() {
		dao.populateAccounts();
	}

	public SavingsAccount addSavingsAccount(Customer customer, int balance, boolean isSalaried) {
		return dao.addSavingsAccount(customer, balance, isSalaried);
	}

	public CurrentAccount addCurrentAccount(Customer customer, int balance, int odLimit) {
		return dao.addCurrentAccount(customer, balance, odLimit);
	}

	public void addNewAccount(BankAccount bankAccount) {
		dao.addNewAccount(bankAccount);
	}

	public Collection<BankAccount> viewAllAccounts() {
		return dao.viewAllAccounts();
	}

	public BankAccount getAccountByAccNo(int accNo) {
		return dao.getAccountByAccNo(accNo);
	}

	public String deleteAccountByAccNo(int accNo) {
		return dao.deleteAccountByAccNo(accNo);
	}

}
