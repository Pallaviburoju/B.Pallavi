package com.cpg.BankPro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cpg.BankPro.dto.Customerpojo;
import com.cpg.BankPro.utility.Database;

public class CustomerDetailsImpl implements ICustomerDetails{
	
	Database data=new Database();
	Customerpojo pojo=new Customerpojo();
	
	public Customerpojo registration(Customerpojo pojo) {
		Connection con=data.connect();
		try {
		PreparedStatement ps=con.prepareStatement
				("insert into customer_details (first_name,last_name,email_id,pancard_no,aadhar_no,address,mobile_no)"
						+ "vales(?,?,?,?,?,?,?)");
		ps.setString(1,pojo.getFirstName());
		ps.setString(2, pojo.getLastName());
		ps.setString(3, pojo.getEmailId());
		ps.setString(4,pojo.getPancardNo());
		ps.setString(5, pojo.getAadharNo());
		ps.setString(6, pojo.getAddress());
		ps.setString(7,pojo.getMobileNo());
		
	    int rs=ps.executeUpdate();
	    System.out.println(rs);
		
		if(rs==1) {
			PreparedStatement ps1 = con.prepareStatement("select account_no from customer_details where aadhar_no=?");
			ps1.setString(1, pojo.getAadharNo());
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				pojo.setAccountNo((rs1.getInt(1)));
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pojo;
	}

	public boolean login(int accountNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
