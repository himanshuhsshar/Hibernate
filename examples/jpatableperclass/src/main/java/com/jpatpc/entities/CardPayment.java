package com.jpatpc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "card_payment_tpc")
public class CardPayment extends Payment {
	@Column(name = "card_no")
	protected String cardNo;
	@Column(name = "card_holder_nm")
	protected String cardHolderName;
	@Column(name = "issued_bank")
	protected String issuedBank;
	@Column(name = "expiry_day")
	protected int expiryDay;
	@Column(name = "expiry_month")
	protected int expiryMonth;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getIssuedBank() {
		return issuedBank;
	}

	public void setIssuedBank(String issuedBank) {
		this.issuedBank = issuedBank;
	}

	public int getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(int expiryDay) {
		this.expiryDay = expiryDay;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cardHolderName, cardNo, expiryDay, expiryMonth, issuedBank);
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
		CardPayment other = (CardPayment) obj;
		return Objects.equals(cardHolderName, other.cardHolderName) && Objects.equals(cardNo, other.cardNo)
				&& expiryDay == other.expiryDay && expiryMonth == other.expiryMonth
				&& Objects.equals(issuedBank, other.issuedBank);
	}

	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardHolderName=" + cardHolderName + ", issuedBank=" + issuedBank
				+ ", expiryDay=" + expiryDay + ", expiryMonth=" + expiryMonth + ", paymentNo=" + paymentNo
				+ ", description=" + description + ", customerName=" + customerName + ", paymentDate=" + paymentDate
				+ ", paidAmount=" + paidAmount + "]";
	}

}
