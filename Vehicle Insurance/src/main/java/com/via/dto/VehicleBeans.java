package com.via.dto;

import java.util.Date;

public class VehicleBeans {
	
	private String vehicleNo;
	private String vehicleType;
	private int insurancePeriod;
	private String aadharNo;
	private String mobileNo;
	private String date;
	private String EndDate;
	private int days;
	public VehicleBeans(String vehicleType, int insurancePeriod, String aadharNo, String mobileNo, String date) {
		this.vehicleType = vehicleType;
		this.insurancePeriod = insurancePeriod;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		this.setDate(date);
	
		
	}
	
	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public VehicleBeans() {
		// TODO Auto-generated constructor stub
	}


	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDate() {
		return date;
	}

	public String setDate(String string) {
		return this.date = string;
	}
}