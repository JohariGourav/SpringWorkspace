package com.moneymoney.app.console.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.moneymoney.app.console.controller.MMBankAccountController;

public class MMBankView {
	
	 //Cursor cursor = new Cursor();
	BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in));
	Scanner scanner = new Scanner(System.in);
	Map<String, Object> accountDetails = new HashMap<>();
	
	MMBankAccountController bankAccCont = new MMBankAccountController();
	
	public void start() throws IOException {
		
		do {
			//cursor.perform();
			showtheMenu();
			
		}while(true);

	}

	public void showtheMenu() throws IOException {
		
		System.out.println("Make Choice : ");
		System.out.println("1. Add New Savings Account");
		System.out.println("2. Add New Current Account");
		System.out.println("3. Show All Accounts");
		System.out.println("4. Get Next Accountb Number");
		System.out.println("5. Search Account By Account Number");
		System.out.println("6. Exit");
		acceptChoice();
		//System.out.println("running");
		
	}

	public void acceptChoice() throws IOException  {
		
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			//System.out.println("case 1 starts");
			addNewSavingsAccount();
			bankAccCont.createNewSavingsAccount(accountDetails);
			System.out.println("obj runs");
			break;
		case 2:
			break;
		default:
			break;
		}
	
	}

	public void addNewSavingsAccount() throws IOException {
		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = bufferedReader.readLine();
		accountDetails.put("accountHolderName", accountHolderName);
		System.out.println("Enter Account Balance: ");
		double accountBalance = Double.parseDouble(bufferedReader.readLine());
		accountDetails.put("accountBalance", accountBalance);
		System.out.println("Enter Salary?(n/y): ");
		String salary = bufferedReader.readLine();
		accountDetails.put("salary", salary.equalsIgnoreCase("n")?false:true);
		acceptCustomerDetails();
		
	}

	private void acceptCustomerDetails() throws NumberFormatException, IOException {
		System.out.println("Enter Contact Number: ");
		Long contact = Long.parseLong(bufferedReader.readLine());
		accountDetails.put("contact", contact);
//		System.out.println("Enter Date of Birth(dd/mm/yyyy): ");
//		String dobStr = bufferedReader.readLine();
//		LocalDate dateOfBirth = getDate(dobStr);
//		accountDetails.put("dateOfBirth", dateOfBirth);
//		System.out.println("Enter Account Holder Name: ");
//		String accountHolderName = bufferedReader.readLine();
//		accountDetails.put("accountHolderName", accountHolderName);
		
	}

	private LocalDate getDate(String dobStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		LocalDate date = LocalDate.parse(dobStr, formatter);
		return date;
	}
	
	
}

//public class Cursor {
//	MMBankView mbv = new MMBankView();
//	
//	public void perform() throws IOException {
//		mbv.showtheMenu();
//		mbv.acceptChoice();
//	}
// }