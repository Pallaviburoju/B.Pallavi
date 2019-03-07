package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;
import com.cg.mra.userexception.InvalidmobilenoException;
import com.cg.mra.userexception.UserException;

public class MainUI {
	public static void main(String args[]) {
		Account a = new Account();
		AccountService as = new AccountServiceImpl();

		do {
			System.out.println("Select one option");
			System.out.println("1) Account BalanceEnquiry \n2) Recharge Account \n3) Exit");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter mobile no");
				String mobileNo = sc.next();
				a = as.getAccountDetails(mobileNo);
				if (mobileNo.length() != 10) {
					try {
						throw new InvalidmobilenoException();
					} catch (InvalidmobilenoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				 if (a != null) {
					System.out.println("current balance is " + a.getAccountBalance());
				} else {
					try {
						throw new UserException();
					} catch (Exception e) {

					}
				}
				break;
			case 2:
				System.out.println("enter mobile number");
				String mobile = sc.next();

				a = as.getAccountDetails(mobile);
				if (a != null) {
					System.out.println("enter amt to recharge");
					double amt = sc.nextDouble();
					int res = as.rechargeAccount(mobile, amt);
					if (res != 0) {
						System.out.println("Your Account Recharged Successfully ");
						System.out.println("Hello " + a.getCustomerName() + ", Available Bal is " + res);
					}
				} else {
					try {
						throw new UserException();
					} catch (Exception e) {

					}
				}

				break;
			case 3:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
			}

		} while (true);
	}
}
