package com.cg.spring.mvc.bankApp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.spring.mvc.bankApp.pojo.BankAccount;
import com.cg.spring.mvc.bankApp.pojo.CurrentAccount;
import com.cg.spring.mvc.bankApp.pojo.Customer;
import com.cg.spring.mvc.bankApp.pojo.SavingsAccount;

public class DaoBankAppImpl {
	private Map<Integer, BankAccount> bankDb = new HashMap<>();
	CurrentAccount currentAccount;
	SavingsAccount savingsAccount;
	BankAccount bankAccount;

	public void populateAccounts() {
		bankAccount = new SavingsAccount(new Customer("Ravi", "ravi@gmail.com", "15-10-1995", "85468787"), 0, true);
		bankDb.put(bankAccount.getAccountNumber(), bankAccount);
		
		bankAccount = new SavingsAccount(new Customer("karan", "karan@gmail.com", "12-11-1994", "85464567"), 5000, false);
		bankDb.put(bankAccount.getAccountNumber(),bankAccount);
		
		bankAccount = new CurrentAccount(new Customer("Rina", "rina@gmail.com", "10-08-1996", "85464154"), 15000, 10000);
		bankDb.put(bankAccount.getAccountNumber(),bankAccount);
		
		bankAccount = new CurrentAccount(new Customer("Tina", "tina@gmail.com", "05-04-1995", "85466749"), 5000, 2000);
		bankDb.put(bankAccount.getAccountNumber(),bankAccount);
	}

	public void addSavingsAccount(Customer customer, int balance, boolean isSalaried) {
		System.out.println("running savings");
		savingsAccount = new SavingsAccount(customer, balance, isSalaried);
		bankAccount = savingsAccount;
		bankDb.put(bankAccount.getAccountNumber(),bankAccount);
		bankAccount.getAccountNumber();
		System.out.println(bankAccount.getAccountNumber());
	}

	public void addCurrentAccount(Customer customer, int balance, int odLimit) {
		System.out.println("running current");
		currentAccount = new CurrentAccount(customer, balance, odLimit);
		bankAccount = currentAccount;
		bankDb.put(bankAccount.getAccountNumber(),bankAccount);
		bankAccount.getAccountNumber();
		System.out.println(bankAccount.getAccountNumber());
	}

	public Collection<BankAccount> viewAllAccounts() {
		System.out.println(bankDb.values());
		return bankDb.values();
	}

	public int deposit(int accNo, int amount) {
		System.out.println("running dao deposit");
		if (bankDb.containsKey(accNo)) {
			SavingsAccount sa = null;
			CurrentAccount ca = null;
			//System.out.println(bankDb.get(accNo));
			if (bankDb.get(accNo).toString().contains("SavingsAccount")) { 
			sa = (SavingsAccount) bankDb.get(accNo);
			int bal = sa.getAccBalance();
			System.out.println(bal);

			bal += amount;
			sa.setAccBalance(bal);
			//System.out.println(sa.getAccBalance());
			return sa.getAccBalance();
			}else {
				ca = (CurrentAccount) bankDb.get(accNo);
				int bal = ca.getAccBalance();
				//System.out.println(bal);

				bal += amount;
				ca.setAccBalance(bal);
				//System.out.println(ca.getAccBalance());
				return ca.getAccBalance();

			}
		}

		else {
			//System.out.println("account doesn't exist");
			return 0;
		}

	}

	public int withdraw(int accNo, int amount) {
		//System.out.println("running dao withdraw");
		int bal = 0;
		if (bankDb.containsKey(accNo)) {
			SavingsAccount sa = null;
			CurrentAccount ca = null;

			//System.out.println(bankDb.get(accNo));

			if (bankDb.get(accNo).toString().contains("SavingsAccount")) {
				sa = (SavingsAccount) bankDb.get(accNo);
				bal = sa.getAccBalance();

				if (bal >= amount) {
					//System.out.println(bal);

					bal -= amount;
					sa.setAccBalance(bal);
					//System.out.println(sa.getAccBalance());
					return sa.getAccBalance();
				} else {
					//System.out.println("insufficient bal");
					return -1;
				}

			} else {
				ca = (CurrentAccount) bankDb.get(accNo);
				bal = ca.getAccBalance();
				int odLimit = ca.getOdLimit();

				if ((bal+odLimit) >= amount) {
					//System.out.println(bal);

					bal -= amount;
					ca.setAccBalance(bal);
					//System.out.println(ca.getAccBalance());
					return ca.getAccBalance();
				} else {
					//System.out.println("insufficient bal");
					return -1;
				}
			}

		} else {
			//System.out.println("account doesn't exist");
			return -2;
		}
	}
}
