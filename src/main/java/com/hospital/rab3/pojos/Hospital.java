package com.hospital.rab3.pojos;

import java.util.List;

public class Hospital {
	private String nameOfHospital;
	private String address;
	private long phoneNo;
	private List<CustomerService> customernames;
	public String getNameOfHospital() {
		return nameOfHospital;
	}
	public void setNameOfHospital(String nameOfHospital) {
		this.nameOfHospital = nameOfHospital;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public List<CustomerService> getCustomernames() {
		return customernames;
	}
	public void setCustomernames(List<CustomerService> customernames) {
		this.customernames = customernames;
	}
	@Override
	public String toString() {
		return "Hospital [nameOfHospital=" + nameOfHospital + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", customernames=" + customernames + "]";
	}
	
	

}
