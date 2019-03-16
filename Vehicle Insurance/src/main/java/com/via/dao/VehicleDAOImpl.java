package com.via.dao;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import com.via.dto.VehicleBeans;

public class VehicleDAOImpl implements IVehicleDAO{
	
    //VehicleBeans beans=new VehicleBeans();
    HashMap<String,VehicleBeans>  HashMapInsuranceEntry = new HashMap<String,VehicleBeans>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");  
    LocalDate now = LocalDate.now();  
    
  
	public VehicleBeans register(VehicleBeans beans) {
		
		HashMapInsuranceEntry.put(beans.getVehicleNo(), new VehicleBeans(beans.getVehicleType(), beans.getInsurancePeriod(), 
				                  beans.getAadharNo(), beans.getMobileNo(), beans.setDate(dtf.format(now))));
		
		return beans;
		
	}
	
	public String validityCheck(VehicleBeans beans) {
		
	
		    LocalDate dateTime = LocalDate.parse(beans.getDate(), dtf);
		    dateTime = dateTime.plusYears(beans.getInsurancePeriod());
		    String EnddateofInsurance = dateTime.format(dtf);
		    System.out.println(EnddateofInsurance);
		    
			return EnddateofInsurance;
			
		}
}
