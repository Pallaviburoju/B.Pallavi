package com.cpg.BankPro.ui;

import java.util.Scanner;

import com.cpg.BankPro.dto.Customerpojo;
import com.cpg.BankPro.service.CustomerServiceImpl;
import com.cpg.BankPro.service.ICustomerService;

public class Presentation {
	
    static Customerpojo dto=new Customerpojo();
	ICustomerService service=new CustomerServiceImpl();
	//obtaining details from customer to register
	public Customerpojo customerDetails() {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter first name:");
		 dto.setFirstName(scan.next());
		 System.out.println("Enter last name:");
		 dto.setLastName(scan.next());
		 System.out.println("Enter email_id:");
		 dto.setEmailId(scan.next());
		 System.out.println("Enter pancard no:");
		 dto.setPancardNo(scan.next());
		 System.out.println("Enter aadhar card no:");
		 dto.setAadharNo(scan.next());
		 System.out.println("Enter address:");
		 dto.setAddress(scan.next());
		 System.out.println("Enter mobile no:");
		 dto.setMobileNo(scan.next());
		 
	     service.registration(dto);
		return dto;
		
	}
	
	public static void main(String args[]) {
		Presentation object=new Presentation();
		Scanner scan=new Scanner(System.in);
		System.out.println("Select option\n1. Register\n2.Login");
		String ch;
		ch=scan.next();
		
			switch(ch) {
				
			case "1":  object.customerDetails();
						
						System.out.println("You are successfully registered and your account number is "+dto.getAccountNo());
				
			case "2":
			
			}
		
	}
}
