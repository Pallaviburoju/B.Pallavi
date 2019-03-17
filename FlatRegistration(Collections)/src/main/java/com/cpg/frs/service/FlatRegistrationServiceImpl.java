package com.cpg.frs.service;

import java.util.ArrayList;

import com.cpg.frs.dao.FlatRegistrationDAOImpl;
import com.cpg.frs.dao.IFlatRegistrationDAO;
import com.cpg.frs.dto.FlatRegistrationDTO;
import com.cpg.frs.utility.AmountException;
import com.cpg.frs.utility.OwneridIncorrectException;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	IFlatRegistrationDAO dao=new FlatRegistrationDAOImpl();
	 FlatRegistrationDTO dto=new FlatRegistrationDTO();
	 boolean value;
	 
	public ArrayList<Integer> getAllOwnerIds() {
		
		return dao.getAllOwnerIds();
	}
	
	public FlatRegistrationDTO registerflat(FlatRegistrationDTO flat) {
		
		return dao.registerflat(dto);
	}
	//validation method
	public boolean validation(int ownerId, int deposit,int rent) {
		value=true;
		int count=0;
		ArrayList<Integer> array=new ArrayList<Integer>();
		array=dao.getAllOwnerIds();
		

		//checking the entered ownerid with the ownerid present in the map
		for(int i=0;i<array.size();i++) {
			if((array.get(i) == ownerId)){
				count++;
			}
		}
		//if there is no ownerid exception is thrown
		if(count == 0) {
			try {
				value=false;
				throw new OwneridIncorrectException();
			} catch (OwneridIncorrectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//if deposit amount is less than the rent exception is throw
		
		if(deposit<rent) {
			try {
				value=false;
				throw new AmountException();
			} catch (AmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
	
}
