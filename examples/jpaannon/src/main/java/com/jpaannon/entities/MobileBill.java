package com.jpaannon.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_bill")
public class MobileBill implements Serializable {

	@Id
	@Column(name = "bill_no")
	protected int billNo;
	@Column(name = "subscriber_nm")
	protected String subscriberName;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "subscription_type")
	protected String subscriptionType;
	@Column(name = "bill_dt")
	protected Date billDate;
	@Column(name = "due_dt")
	protected Date dueDate;
	@Column(name = "bill_amount")
	protected double billAmount;

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "MobileBill [billNo=" + billNo + ", subscriberName=" + subscriberName + ", mobileNo=" + mobileNo
				+ ", subscriptionType=" + subscriptionType + ", billDate=" + billDate + ", dueDate=" + dueDate
				+ ", billAmount=" + billAmount + "]";
	}

}
