package com.via.service;

import com.via.dao.IVehicleDAO;
import com.via.dao.VehicleDAOImpl;
import com.via.dto.VehicleBeans;

import utility.AadharException;

public class VehicleServiceImpl implements IVehicleService {
	
	IVehicleDAO dao=new VehicleDAOImpl();
	
	public VehicleBeans register(VehicleBeans beans) {
		dao.register(beans);
		if(beans.getAadharNo().length()!=12) {
			try {
				throw new AadharException();
			} catch (AadharException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dao.register(beans);
		
	}
	public String validityCheck(VehicleBeans beans) {
		
		return dao.validityCheck(beans);
		
	}
	
}
