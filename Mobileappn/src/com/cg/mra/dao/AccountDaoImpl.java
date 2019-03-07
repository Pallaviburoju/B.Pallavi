package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao  {


	int count = 0;
	Account a = new Account();
	Map<String, Account> accountEntry;

	public AccountDaoImpl() {
		accountEntry = new HashMap<>();
		accountEntry.put("9703060153", new Account("Prepaid", "Pallavi", 200));
		accountEntry.put("7382829283", new Account("Prepaid", "Thanmai", 450));
		accountEntry.put("9492624265", new Account("Prepaid", "Prasanna", 300));
		accountEntry.put("8545231859", new Account("Prepaid", "Sharath", 50));
		accountEntry.put("9032156609", new Account("Prepaid", "Harsha", 60));

	}

	@Override
	public Account getAccountDetails(String mobileNo) {
		
		for (Map.Entry m : accountEntry.entrySet()) {
			if (mobileNo.equals(m.getKey())) {
				System.out.println("exists");
				a = (Account) m.getValue();
				count++;
				break;
			}
		}
		if (count == 0) {
			return null;
		} else {
			return a;
		}

	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		int res = 0;
		for (Map.Entry m : accountEntry.entrySet()) {
			if (mobileNo.equals(m.getKey())) {
				a=(Account) m.getValue();
				res=(int) (rechargeAmount+a.getAccountBalance());
				a.setAccountBalance(res);
				System.out.println("Hello "+a.getCustomerName() );
				//accountEntry.replace(mobileNo, res);
			count++;
			break;
		}
		}
		if (count == 0) {
			return 0;
		} else {
			return res;
		}
	}
	
}
