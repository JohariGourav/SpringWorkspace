package com.demo.Rest.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.Rest.pojo.BankAccount;
import com.demo.Rest.pojo.CurrentAccount;
import com.demo.Rest.pojo.Customer;
import com.demo.Rest.pojo.SavingsAccount;

@Repository
public class DaoBankAppImpl {
	private Map<Integer, BankAccount> bankDb = new HashMap<>();
	CurrentAccount currentAccount;
	SavingsAccount savingsAccount;
	BankAccount bankAccount;
	int flag = 0;

	// populate accounts
	public void populateAccounts() {
		bankAccount = new SavingsAccount(new Customer("Ravi", "ravi@gmail.com", "15-10-1995", "85468787"), 0, true);
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);

		bankAccount = new SavingsAccount(new Customer("karan", "karan@gmail.com", "12-11-1994", "85464567"), 5000,
				false);
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);

		bankAccount = new CurrentAccount(new Customer("Rina", "rina@gmail.com", "10-08-1996", "85464154"), 15000,
				10000);
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);

		bankAccount = new CurrentAccount(new Customer("Tina", "tina@gmail.com", "05-04-1995", "85466749"), 5000, 2000);
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);
	}

	// add Savings Account
	public SavingsAccount addSavingsAccount(Customer customer, int balance, boolean isSalaried) {
		System.out.println("running savings");
		savingsAccount = new SavingsAccount(customer, balance, isSalaried);
		bankAccount = savingsAccount;
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);
		bankAccount.getAccountNumber();
		System.out.println(bankAccount.getAccountNumber());
		return savingsAccount;
	}

	// add Current Account
	public CurrentAccount addCurrentAccount(Customer customer, int balance, int odLimit) {
		System.out.println("running current");
		currentAccount = new CurrentAccount(customer, balance, odLimit);
		bankAccount = currentAccount;
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);
		bankAccount.getAccountNumber();
		System.out.println(bankAccount.getAccountNumber());
		return currentAccount;
	}

	// add New Account
	public void addNewAccount(BankAccount bankAccount) {
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);
	}

	// View All Accounts
	public Collection<BankAccount> viewAllAccounts() {
		if (flag == 0) {
			populateAccounts();
			flag++;
		}

		return bankDb.values();
	}

	// View Account By Account No.
	public BankAccount getAccountByAccNo(int accNo) {
		if (bankDb.containsKey(accNo)) {
			return bankDb.get(accNo);
		} else
			return null;
	}

	// Delete Account By Account No.
	public String deleteAccountByAccNo(int accNo) {
		if (bankDb.containsKey(accNo)) {
			bankDb.remove(accNo);
			return "Account deleted";
		} else
			return "Account not present";
	}
}
