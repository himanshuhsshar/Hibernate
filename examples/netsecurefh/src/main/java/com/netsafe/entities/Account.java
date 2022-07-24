package com.netsafe.entities;

import java.io.Serializable;

public class Account implements Serializable{
	
	private int accountNo;
	private String accountHolderName;
	private String accountType;
	private String mobileNo;
	private String emailAddress;
	private String branchCode;
	private String balance;
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public String getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", branchCode="
				+ branchCode + ", balance=" + balance + "]";
	}
	
	
	

}
