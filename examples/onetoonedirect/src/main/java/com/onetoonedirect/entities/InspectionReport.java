package com.onetoonedirect.entities;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class InspectionReport implements Serializable {
	protected int inspectionNo;
	protected LocalDate reportDate;
	protected String agentName;
	protected String description;
	protected String observations;
	protected int rating;
	protected double valuation;
	protected LocalDate reportExpiryDate;
	protected VehicleInspection vehicleInspection;
}
