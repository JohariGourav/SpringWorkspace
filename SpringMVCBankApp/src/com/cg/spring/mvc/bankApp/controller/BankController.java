package com.cg.spring.mvc.bankApp.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.spring.mvc.bankApp.pojo.BankAccount;
import com.cg.spring.mvc.bankApp.pojo.Customer;
import com.cg.spring.mvc.bankApp.services.ServicesBankApp;

@Controller
public class BankController {

	ServicesBankApp service = new ServicesBankApp();
	private int count = 0;

	@RequestMapping("/home")
	public String home() {
		System.out.println("running");
		if (count == 0) {
			service.populateAccount();
			count++;
		}

		return "home";
	}

	@RequestMapping("/addNewAccount")
	public String addNewAccount() {
		return "addNewAccount";
	}

	@RequestMapping("/saveNewAccount")
	public String saveNewAccount(@RequestParam("customerName") String name, @RequestParam("emailId") String emailId,
			@RequestParam("dob") String dob, @RequestParam("telephone") String phoneNo, @RequestParam("accType") String accType,
			@RequestParam("salaried") Boolean isSalaried , @RequestParam("balance") String balance, 
			@RequestParam("odLimit") String odLimit) {
		int openingBalance = Integer.parseInt(balance);
		System.out.println(accType);
		Customer customer = new Customer(name, emailId, dob, phoneNo);
		if(accType.equals("savingsAccount") ) {
			System.out.println(accType);
			service.addSavingsAccount(customer, openingBalance, isSalaried);
		}
		else if(accType.equals("currentAccount")) {
			int oDLimit = Integer.parseInt(odLimit);

			service.addCurrentAccount(customer, openingBalance, oDLimit);
		}
		return "saveNewAccount";
	}

	@RequestMapping("/viewAllAccounts")
	public String viewAllAccounts(Model model) {

		Collection<BankAccount> bankAccounts = service.viewAllAccounts();
		System.out.println(bankAccounts);

		model.addAttribute("bankAccounts", bankAccounts);

		return "viewAll";
	}

	@RequestMapping("/fundTransfer")
	public String fundTransfer() {
		return "fundTransfer";
	}

	@RequestMapping("/saveFundTransfer")
	public String saveFundTransfer(@RequestParam("fromAccNo") int fromAccNo, @RequestParam("amount") int amount,
			@RequestParam("toAccNo") int toAccNo, Model model) {

		System.out.println(fromAccNo + " " + toAccNo + " " + amount);
		int retrievedBalance = service.withdraw(fromAccNo, amount);
		System.out.println("ret bal" + retrievedBalance);
		if (retrievedBalance >= 0) {
			int accBal = service.deposit(toAccNo, amount);
			if (accBal != 0) {
				model.addAttribute("retrievedBalance", retrievedBalance);
				model.addAttribute("accBal", accBal);
				model.addAttribute("fromAccNo", fromAccNo);
				model.addAttribute("toAccNo", toAccNo);
				model.addAttribute("amount", amount);
				return "successFundTransfer";

			} else {
				return "errorAccNotFound";
			}
		} else if (retrievedBalance == -2)
			return "errorAccNotFound";
		else if (retrievedBalance == -1)
			return "insufficientBal";
		return "";
	}

	@RequestMapping("/deposit")
	public String deposit() {
		return "deposit";
	}

	@RequestMapping("/saveDeposit")
	public String saveDeposit(@RequestParam("accNo") int accNo, @RequestParam("amount") int amount, Model model) {

		System.out.println(accNo + " " + amount);
		int accBal = service.deposit(accNo, amount);
		if (accBal != 0) {
			model.addAttribute("accNum", accNo);
			model.addAttribute("accBal", accBal);
			return "successDepWith";

		} else
			return "errorAccNotFound";

	}

	@RequestMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}

	@RequestMapping("/saveWithdraw")
	public String saveWithdraw(@RequestParam("accNo") int accNo, @RequestParam("amount") int amount, Model model) {

		System.out.println(accNo + " " + amount);
		int accBalance = service.withdraw(accNo, amount);
		System.out.println(accBalance);
		if (accBalance >= 0) {
			model.addAttribute("accNum", accNo);
			model.addAttribute("accBal", accBalance);
			return "successDepWith";

		} else if (accBalance == -2)
			return "errorAccNotFound";
		else if (accBalance == -1)
			return "insufficientBal";
		return "";
	}

	@RequestMapping("/input")
	public String input() {
		return "input";
	}

	@RequestMapping("/greet")
	public String greet(@RequestParam("fname") String name, Model model) {
		model.addAttribute("name", name);
		return "display";
	}
}
