package com.cpg.frs.dto;

public class FlatRegistrationDTO {

int flat_reg_no;
int owner_id;
int flat_type;
int flat_area;
int rent_amount;
int deposit_amount;



public FlatRegistrationDTO() {

}
public FlatRegistrationDTO(int flat_reg_no, int owner_id, int flat_type, int flat_area, int rent_amount,
		int deposit_amount) {
	
	this.flat_reg_no = flat_reg_no;
	this.owner_id = owner_id;
	this.flat_type = flat_type;
	this.flat_area = flat_area;
	this.rent_amount = rent_amount;
	this.deposit_amount = deposit_amount;
}
public int getFlat_reg_no() {
	return flat_reg_no;
}
public void setFlat_reg_no(int flat_reg_no) {
	this.flat_reg_no = flat_reg_no;
}
public int getOwner_id() {
	return owner_id;
}
public void setOwner_id(int owner_id) {
	this.owner_id = owner_id;
}
public int getFlat_type() {
	return flat_type;
}
public void setFlat_type(int flat_type) {
	this.flat_type = flat_type;
}
public int getFlat_area() {
	return flat_area;
}
public void setFlat_area(int flat_area) {
	this.flat_area = flat_area;
}
public int getRent_amount() {
	return rent_amount;
}
public void setRent_amount(int rent_amount) {
	this.rent_amount = rent_amount;
}
public int getDeposit_amount() {
	return deposit_amount;
}
public void setDeposit_amount(int deposit_amount) {
	this.deposit_amount = deposit_amount;
}
}

