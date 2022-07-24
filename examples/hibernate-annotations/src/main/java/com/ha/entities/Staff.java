package com.ha.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff implements Serializable{
	
	@Id
	@Column(name="staff_no")
	protected int staffNo;
	protected String fullname;
	protected Date dob;
	protected String gender;
	protected int experience;
	@Basic(fetch=FetchType.EAGER)
	protected String designation;
	protected String qualification;
	@Column(name="mobile_no")
	protected String mobileNo;
	@Column(name="email_address")
	protected String emailAddress;
	
	public int getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
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
		return "Staff [staffNo=" + staffNo + ", fullname=" + fullname + ", dob=" + dob + ", gender=" + gender
				+ ", experience=" + experience + ", designation=" + designation + ", qualification=" + qualification
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}
	
}
