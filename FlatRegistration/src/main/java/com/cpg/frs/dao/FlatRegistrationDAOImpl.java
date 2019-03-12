package com.cpg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cpg.frs.dto.FlatOwnersDTO;
import com.cpg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO{

int regno=1000;
public ArrayList<Integer> getAllOwnerIds() {
	
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
	
		HashMap<Integer,FlatOwnersDTO> map=new HashMap<Integer,FlatOwnersDTO>();
		//inserting values into map
		map.put(1,new FlatOwnersDTO("Vaishali Srivastava", "8888108810"));
		map.put(2,new FlatOwnersDTO("Ankita Ghokle", "8888108810"));
		map.put(3,new FlatOwnersDTO("Rohini Vijayan", "8888108810"));
		
		//To retrieve the keys from map into the arraylist
		arraylist.addAll(map.keySet());
		
		return arraylist;
	}
	
	public FlatRegistrationDTO registerflat(FlatRegistrationDTO flat) {
	
		//FlatRegistrationDTO dto=new FlatRegistrationDTO();
		
		flat.setFlat_reg_no(regno++);
		HashMap<Integer,FlatRegistrationDTO> regmap=new HashMap<Integer,FlatRegistrationDTO>();
		
		regmap.put(flat.getFlat_reg_no(), flat);
		
		return flat;
	}


	
}

