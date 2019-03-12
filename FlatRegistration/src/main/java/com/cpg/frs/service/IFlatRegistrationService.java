package com.cpg.frs.service;

import java.util.ArrayList;

import com.cpg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationService {

	ArrayList<Integer> getAllOwnerIds();
	FlatRegistrationDTO registerflat(FlatRegistrationDTO flat);
	
	
}
