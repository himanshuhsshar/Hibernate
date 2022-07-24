package com.jpagen.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/*
 * @Entity
 * 
 * @Table(name = "bus") public class Bus implements Serializable {
 * 
 * @Id
 * 
 * @Column(name = "bus_no")
 * 
 * @GeneratedValue(strategy=GenerationType.IDENTITY) protected int busNo;
 * 
 * @Column(name = "bus_type") protected String busType;
 * 
 * @Column(name = "registration_no") protected String registrationNo;
 * 
 * @Column(name = "fuel_type") protected String fuelType; protected String
 * color; protected int capacity;
 * 
 * public int getBusNo() { return busNo; }
 * 
 * public void setBusNo(int busNo) { this.busNo = busNo; }
 * 
 * public String getBusType() { return busType; }
 * 
 * public void setBusType(String busType) { this.busType = busType; }
 * 
 * public String getRegistrationNo() { return registrationNo; }
 * 
 * public void setRegistrationNo(String registrationNo) { this.registrationNo =
 * registrationNo; }
 * 
 * public String getFuelType() { return fuelType; }
 * 
 * public void setFuelType(String fuelType) { this.fuelType = fuelType; }
 * 
 * public String getColor() { return color; }
 * 
 * public void setColor(String color) { this.color = color; }
 * 
 * public int getCapacity() { return capacity; }
 * 
 * public void setCapacity(int capacity) { this.capacity = capacity; }
 * 
 * @Override public String toString() { return "Bus [busNo=" + busNo +
 * ", busType=" + busType + ", registrationNo=" + registrationNo + ", fuelType="
 * + fuelType + ", color=" + color + ", capacity=" + capacity + "]"; }
 * 
 * }
 */
/*
 * @Entity
 * 
 * @Table(name = "bus")
 * 
 * @SequenceGenerator(name = "busSequenceGenerator", sequenceName =
 * "bus_sequence", allocationSize = 1) public class Bus implements Serializable
 * {
 * 
 * @Id
 * 
 * @Column(name = "bus_no")
 * 
 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
 * "busSequenceGenerator") protected int busNo;
 * 
 * @Column(name = "bus_type") protected String busType;
 * 
 * @Column(name = "registration_no") protected String registrationNo;
 * 
 * @Column(name = "fuel_type") protected String fuelType; protected String
 * color; protected int capacity;
 * 
 * public int getBusNo() { return busNo; }
 * 
 * public void setBusNo(int busNo) { this.busNo = busNo; }
 * 
 * public String getBusType() { return busType; }
 * 
 * public void setBusType(String busType) { this.busType = busType; }
 * 
 * public String getRegistrationNo() { return registrationNo; }
 * 
 * public void setRegistrationNo(String registrationNo) { this.registrationNo =
 * registrationNo; }
 * 
 * public String getFuelType() { return fuelType; }
 * 
 * public void setFuelType(String fuelType) { this.fuelType = fuelType; }
 * 
 * public String getColor() { return color; }
 * 
 * public void setColor(String color) { this.color = color; }
 * 
 * public int getCapacity() { return capacity; }
 * 
 * public void setCapacity(int capacity) { this.capacity = capacity; }
 * 
 * @Override public String toString() { return "Bus [busNo=" + busNo +
 * ", busType=" + busType + ", registrationNo=" + registrationNo + ", fuelType="
 * + fuelType + ", color=" + color + ", capacity=" + capacity + "]"; }
 * 
 * }
 */
/*
 * @Entity
 * 
 * @Table(name = "bus")
 * 
 * @SequenceGenerator(name = "busSequenceGenerator", sequenceName =
 * "bus_sequence", allocationSize = 1) public class Bus implements Serializable
 * {
 * 
 * @Id
 * 
 * @Column(name = "bus_no")
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO, generator =
 * "busSequenceGenerator") protected int busNo;
 * 
 * @Column(name = "bus_type") protected String busType;
 * 
 * @Column(name = "registration_no") protected String registrationNo;
 * 
 * @Column(name = "fuel_type") protected String fuelType; protected String
 * color; protected int capacity;
 * 
 * public int getBusNo() { return busNo; }
 * 
 * public void setBusNo(int busNo) { this.busNo = busNo; }
 * 
 * public String getBusType() { return busType; }
 * 
 * public void setBusType(String busType) { this.busType = busType; }
 * 
 * public String getRegistrationNo() { return registrationNo; }
 * 
 * public void setRegistrationNo(String registrationNo) { this.registrationNo =
 * registrationNo; }
 * 
 * public String getFuelType() { return fuelType; }
 * 
 * public void setFuelType(String fuelType) { this.fuelType = fuelType; }
 * 
 * public String getColor() { return color; }
 * 
 * public void setColor(String color) { this.color = color; }
 * 
 * public int getCapacity() { return capacity; }
 * 
 * public void setCapacity(int capacity) { this.capacity = capacity; }
 * 
 * @Override public String toString() { return "Bus [busNo=" + busNo +
 * ", busType=" + busType + ", registrationNo=" + registrationNo + ", fuelType="
 * + fuelType + ", color=" + color + ", capacity=" + capacity + "]"; }
 * 
 * }
 */
/*
 * @Entity
 * 
 * @Table(name = "bus")
 * 
 * @TableGenerator(name = "busTableGenerator", table = "unique_keys",
 * pkColumnName = "keyname", pkColumnValue = "bus_no", valueColumnName =
 * "nextval", allocationSize = 1, initialValue = 10) public class Bus implements
 * Serializable {
 * 
 * @Id
 * 
 * @Column(name = "bus_no")
 * 
 * @GeneratedValue(strategy = GenerationType.TABLE, generator =
 * "busTableGenerator") protected int busNo;
 * 
 * @Column(name = "bus_type") protected String busType;
 * 
 * @Column(name = "registration_no") protected String registrationNo;
 * 
 * @Column(name = "fuel_type") protected String fuelType; protected String
 * color; protected int capacity;
 * 
 * public int getBusNo() { return busNo; }
 * 
 * public void setBusNo(int busNo) { this.busNo = busNo; }
 * 
 * public String getBusType() { return busType; }
 * 
 * public void setBusType(String busType) { this.busType = busType; }
 * 
 * public String getRegistrationNo() { return registrationNo; }
 * 
 * public void setRegistrationNo(String registrationNo) { this.registrationNo =
 * registrationNo; }
 * 
 * public String getFuelType() { return fuelType; }
 * 
 * public void setFuelType(String fuelType) { this.fuelType = fuelType; }
 * 
 * public String getColor() { return color; }
 * 
 * public void setColor(String color) { this.color = color; }
 * 
 * public int getCapacity() { return capacity; }
 * 
 * public void setCapacity(int capacity) { this.capacity = capacity; }
 * 
 * @Override public String toString() { return "Bus [busNo=" + busNo +
 * ", busType=" + busType + ", registrationNo=" + registrationNo + ", fuelType="
 * + fuelType + ", color=" + color + ", capacity=" + capacity + "]"; }
 * 
 * }
 */
@Entity
@Table(name = "bus")
@SequenceGenerator(name = "busSequenceGenerator", sequenceName = "bus_sequence", allocationSize = 1)
public class Bus implements Serializable {
	@Id
	@Column(name = "bus_no")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "busSequenceGenerator")
	protected int busNo;
	@Column(name = "bus_type")
	protected String busType;
	@Column(name = "registration_no")
	protected String registrationNo;
	@Column(name = "fuel_type")
	protected String fuelType;
	protected String color;
	protected int capacity;

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busType=" + busType + ", registrationNo=" + registrationNo + ", fuelType="
				+ fuelType + ", color=" + color + ", capacity=" + capacity + "]";
	}

}