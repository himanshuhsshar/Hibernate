package com.jpamf.entities;

import java.io.Serializable;
import java.util.Date;

public class Subscriber implements Serializable{
	
	protected int subscriberNo;
	protected String subscriberName;
	protected String subscribtionType;
	protected Date susbcribedDate;
	protected String circle;
	protected float creditLimit;
	protected Date dob;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	public int getSubscriberNo() {
		return subscriberNo;
	}
	public void setSubscriberNo(int subscriberNo) {
		this.subscriberNo = subscriberNo;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public String getSubscribtionType() {
		return subscribtionType;
	}
	public void setSubscribtionType(String subscribtionType) {
		this.subscribtionType = subscribtionType;
	}
	public Date getSusbcribedDate() {
		return susbcribedDate;
	}
	public void setSusbcribedDate(Date susbcribedDate) {
		this.susbcribedDate = susbcribedDate;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
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
		return "Subscriber [subscriberNo=" + subscriberNo + ", subscriberName=" + subscriberName + ", subscribtionType="
				+ subscribtionType + ", susbcribedDate=" + susbcribedDate + ", circle=" + circle + ", creditLimit="
				+ creditLimit + ", dob=" + dob + ", gender=" + gender + ", mobileNo=" + mobileNo + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
}
