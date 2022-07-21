package com.getvsload.entities;

import java.io.Serializable;
import java.util.Date;

/* public class Customer implements Serializable{ */
public final class Customer implements ICustomer, Serializable{
	
	protected int customerNo;
	protected String customerName;
	protected Date dob;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", customerName=" + customerName + ", dob=" + dob + ", gender="
				+ gender + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}
	
	
}
