package com.demo.Rest.Controller;

import java.util.Collection;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Rest.Services.*;
import com.demo.Rest.pojo.BankAccount;
import com.demo.Rest.pojo.CurrentAccount;
import com.demo.Rest.pojo.Customer;
import com.demo.Rest.pojo.SavingsAccount;

@RestController
public class BankController {

	ServicesBankApp service = new ServicesBankApp();

	// Hello method
	@RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = "application/json")
	public String hello( String name) {
		
		return "hello " + name;
	}

	// Save New Account
	@RequestMapping(value = "/saveNewAccount", method = RequestMethod.POST, consumes = "application/json")
	public BankAccount saveNewAccount(@RequestBody BankAccount bankAccount) {
		System.out.println(bankAccount);
		String accType = bankAccount.getAccType();
		System.out.println(accType);
		SavingsAccount savingsAccount = null;
		CurrentAccount currentAccount;
		int accNo = 0;

		if (accType.equals("savingsAccount")) {
			System.out.println(accType);

			// savingsAccount = (SavingsAccount) bankAccount;
			service.addNewAccount(bankAccount);

		} else if (accType.equals("currentAccount")) {

			// currentAccount = (CurrentAccount) bankAccount;
			service.addNewAccount(bankAccount);

		}
		System.out.println(accNo);
		bankAccount = service.getAccountByAccNo(accNo);
		System.out.println(bankAccount);

		return bankAccount;
	}

	// View All Accounts
	@RequestMapping(value = "/viewAllAccounts", method = RequestMethod.GET)
	public Collection<BankAccount> viewAllAccounts() {

		Collection<BankAccount> bankAccounts = service.viewAllAccounts();
		return bankAccounts;
	}

	// Delete Account By Account No.
	@RequestMapping(value = "/delete/{accNo}", method = RequestMethod.DELETE)
	public String deleteAccountByAccNo(@PathVariable int accNo) {
		return service.deleteAccountByAccNo(accNo);
	}
}
