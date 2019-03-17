package com.cpg.frs.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cpg.frs.dao.FlatRegistrationDAOImpl;
import com.cpg.frs.dao.IFlatRegistrationDAO;
import com.cpg.frs.dto.FlatRegistrationDTO;

class FlatRegistrationServiceImplTest {

    IFlatRegistrationDAO dao=new FlatRegistrationDAOImpl();
    FlatRegistrationDTO dto=new FlatRegistrationDTO();
    FlatRegistrationServiceImpl service=new FlatRegistrationServiceImpl();
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

	@Test
	void testValidation() {
		
		assertEquals(true,service.validation(1,1000,200));
	}

}
