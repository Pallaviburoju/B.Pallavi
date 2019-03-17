package com.cpg.frs.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cpg.frs.dto.FlatRegistrationDTO;

class FlatRegistrationDAOImplTest {
	
    IFlatRegistrationDAO dao=new FlatRegistrationDAOImpl();
    FlatRegistrationDTO dto=new FlatRegistrationDTO();
	@Test
	void testGetAllOwnerIds() {
		ArrayList arraylist=new ArrayList();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		assertEquals(arraylist,dao.getAllOwnerIds());
	}

	@Test
	void testRegisterflat() {
		
		dto.setDeposit_amount(100);
		dto.setFlat_area(100);
		dto.setFlat_reg_no(0);
		dto.setFlat_type(1);
		dto.setOwner_id(1);
		dto.setRent_amount(1000);
		assertEquals(1000,dao.registerflat(dto).getFlat_reg_no());
	}

}
