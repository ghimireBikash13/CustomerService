package com.hospital.rab3.pojos;

public class CustomerService {
	private String name;
	private String address;
	private long phoneNo;
	private long SSN;
	private String diseasesType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getSSN() {
		return SSN;
	}
	public void setSSN(long sSN) {
		SSN = sSN;
	}
	public String getDiseasesType() {
		return diseasesType;
	}
	public void setDiseasesType(String diseasesType) {
		this.diseasesType = diseasesType;
	}
	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", SSN=" + SSN
				+ ", diseasesType=" + diseasesType + "]";
	}
	
	

}
