package com.flc.entities;

import java.io.Serializable;

public class Ride implements Serializable {

	protected int rideNo;
	protected String source;
	protected String destination;
	protected String carType;
	protected String mobileNo;

	public int getRideNo() {
		return rideNo;
	}

	public void setRideNo(int rideNo) {
		this.rideNo = rideNo;
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

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Ride [rideNo=" + rideNo + ", source=" + source + ", destination=" + destination + ", carType=" + carType
				+ ", mobileNo=" + mobileNo + "]";
	}

}
