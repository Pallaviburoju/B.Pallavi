package com.cpg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cpg.frs.dto.FlatRegistrationDTO;
import com.cpg.frs.service.FlatRegistrationServiceImpl;
import com.cpg.frs.service.IFlatRegistrationService;

public class Client {

	static IFlatRegistrationService service=new FlatRegistrationServiceImpl();
	static FlatRegistrationDTO dto=new FlatRegistrationDTO();
	static FlatRegistrationServiceImpl serviceImpl = new FlatRegistrationServiceImpl();
	public static void main(String args[]) {
		do {
		Scanner scan=new Scanner(System.in);
		int ch;
		System.out.println("1. Register Flat\n2. Exit");
		ch=scan.nextInt();
		switch(ch) {
		
		case 1: //displaying ownerids from arraylist by calling getAllownerIds method
				  ArrayList daolist=new ArrayList(); 
				  daolist=service.getAllOwnerIds();
		          System.out.println("Existing Owner IDs are:"+daolist);
		    
		          System.out.println("please enter owner id from above list:");
		          dto.setOwner_id(scan.nextInt());
		          System.out.println("Select FlatType (1-1BHK, 2-2BHK)");
		          dto.setFlat_type(scan.nextInt());
		          System.out.println("Enter Flat area in sq. ft");
		          dto.setFlat_area(scan.nextInt());
		          System.out.println("Enter desired rent amount Rs:");
		          dto.setRent_amount(scan.nextInt());
		          System.out.println("Enter desired deposit amount Rs:");
		          dto.setDeposit_amount(scan.nextInt());
		          //calling validation method to check whether the owner is present or not and to check if deposit amount is more than rent amount
		         boolean y= serviceImpl.validation(dto.getOwner_id(),dto.getDeposit_amount(),dto.getRent_amount());
				  //calling this method to store details and return registration id
		          if(y) {
				  System.out.println("Flat successfully registered. Registration id:"+ service.registerflat(dto).getFlat_reg_no());
		          }
				  break;
		
		case 2:   System.exit(0);
				  break;
		}

		
		
	}while(true);
}
}

