package com.cpg.frs.dao;

import java.util.ArrayList;

import com.cpg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationDAO {
	ArrayList<Integer> getAllOwnerIds();
	FlatRegistrationDTO registerflat(FlatRegistrationDTO flat);
}
