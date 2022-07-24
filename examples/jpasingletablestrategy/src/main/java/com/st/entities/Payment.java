package com.st.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "payment_type")
@DiscriminatorValue("cash")
@GenericGenerator(name = "incrementgen",strategy = "increment")
public class Payment implements Serializable {

	@Id
	@Column(name = "payment_no")
	@GeneratedValue(generator = "incrementgen")
	protected int paymentNo;
	protected String description;
	@Column(name = "customer_nm")
	protected String customerName;
	@Column(name = "payment_dt")
	protected Date paymentDate;
	@Column(name = "paid_amt")
	protected double paidAmount;

	public int getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerName, description, paidAmount, paymentDate, paymentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(customerName, other.customerName) && Objects.equals(description, other.description)
				&& Double.doubleToLongBits(paidAmount) == Double.doubleToLongBits(other.paidAmount)
				&& Objects.equals(paymentDate, other.paymentDate) && paymentNo == other.paymentNo;
	}

	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", description=" + description + ", customerName=" + customerName
				+ ", paymentDate=" + paymentDate + ", paidAmount=" + paidAmount + "]";
	}

}
