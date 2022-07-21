package com.criteriaapi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "journey")
public class Journey implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "journey_no")
	protected int journeyNo;
	protected String source;
	protected String destination;
	@Column(name = "journey_date")
	@Temporal(TemporalType.DATE)
	protected Date journeyDate;
	@Column(name = "commute_mode")
	protected String commuteMode;
	protected Integer hours;
	protected double amount;

	public int getJourneyNo() {
		return journeyNo;
	}

	public void setJourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getCommuteMode() {
		return commuteMode;
	}

	public void setCommuteMode(String commuteMode) {
		this.commuteMode = commuteMode;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Journey [journeyNo=" + journeyNo + ", source=" + source + ", destination=" + destination
				+ ", journeyDate=" + journeyDate + ", commuteMode=" + commuteMode + ", hours=" + hours + ", amount="
				+ amount + "]";
	}

}
