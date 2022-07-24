package com.jpatpc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cheque_payment_tpc")
public class ChequePayment extends Payment {
	@Column(name = "cheque_no")
	protected String chequeNo;
	@Column(name = "bank_name")
	protected String bankName;
	@Column(name = "branch_name")
	protected String branchName;
	@Column(name = "payee_name")
	protected String payeeName;
	@Column(name = "cheque_date")
	protected Date chequeDate;

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public Date getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bankName, branchName, chequeDate, chequeNo, payeeName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChequePayment other = (ChequePayment) obj;
		return Objects.equals(bankName, other.bankName) && Objects.equals(branchName, other.branchName)
				&& Objects.equals(chequeDate, other.chequeDate) && Objects.equals(chequeNo, other.chequeNo)
				&& Objects.equals(payeeName, other.payeeName);
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", payeeName=" + payeeName + ", chequeDate=" + chequeDate + ", paymentNo=" + paymentNo
				+ ", description=" + description + ", customerName=" + customerName + ", paymentDate=" + paymentDate
				+ ", paidAmount=" + paidAmount + "]";
	}

}
