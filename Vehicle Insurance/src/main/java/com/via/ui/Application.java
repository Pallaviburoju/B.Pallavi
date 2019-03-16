package com.via.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.via.dto.VehicleBeans;
import com.via.service.IVehicleService;
import com.via.service.VehicleServiceImpl;

public class Application {
	static VehicleBeans beans=new VehicleBeans();
	static VehicleBeans pojo=new VehicleBeans();
	static IVehicleService service=new VehicleServiceImpl();
	static SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String args[]) {
		do {
		Scanner scan=new Scanner(System.in);
		System.out.println("Select option:\n1. Vehicle Insurance Registration\n2. Insurance Validation Check\n3. Exit");
		String ch;
		ch=scan.next();
		
			switch(ch) {
				
			case "1":System.out.println("Enter vehicle number");
			         beans.setVehicleNo(scan.next());
			         System.out.println("Enter vehicle type (2Wheeler or 4Wheeler)");
			         beans.setVehicleType(scan.next());
			         System.out.println("Enter vehicle insurance period in years");
			         beans.setInsurancePeriod(scan.nextInt());
			         System.out.println("Enter your Aadhar number");
			         beans.setAadharNo(scan.next());
			         System.out.println("Enter your mobile number");
			         beans.setMobileNo(scan.next());
			         pojo=service.register(beans);
			         System.out.println("Registration successful");
			         
			         
			case "2":String enddate=service.validityCheck(pojo);
			         System.out.println("Insurance expires on "+enddate);
						Date d1,d2;
						try {
							d1 = myFormat.parse(pojo.getDate());
							d2 = myFormat.parse(enddate);
					
						      long difference=d2.getTime() - d1.getTime();
						      TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
		                      float days = (difference / (1000*60*60*24));
						
		                      System.out.println("Insurance expires on "+enddate+" and number of days remaining for renewal are "+days);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				      
			case "3":System.exit(0);
			}
			
		}while(true);
	}
}





