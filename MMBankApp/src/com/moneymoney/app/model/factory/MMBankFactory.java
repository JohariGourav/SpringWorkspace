package com.moneymoney.app.model.factory;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.moneymoney.framework.factory.BankFactory;
import com.moneymoney.app.model.account.pojo.*;
public class MMBankFactory extends BankFactory {

	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> savingsAccount) {
		Set<Entry<String, Object>> set = savingsAccount.entrySet();
		for(Entry e : set) {
			e.getValue().equals(acc)
		}
		System.out.println();
		//MMSavingsAccount mmsavingsAccount = new MMSavingsAccount(savingsAccount, salary) 
		
	}
}
