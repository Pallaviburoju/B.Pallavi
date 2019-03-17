package com.cpg.frs.dto;

public class FlatOwnersDTO {

private String owner_name;
private String mobile_no;



public FlatOwnersDTO(String owner_name, String mobile_no) {
	this.owner_name = owner_name;
	this.mobile_no = mobile_no;
}
public String getOwner_name() {
	return owner_name;
}
public void setOwner_name(String owner_name) {
	this.owner_name = owner_name;
}
public String getMobile_no() {
	return mobile_no;
}
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
}
