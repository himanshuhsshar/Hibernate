package com.inverse.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "parcels")
@EqualsAndHashCode(exclude = "parcels")
public class DeliveryAssociate implements Serializable {
	private int deliveryAssociateNo;
	private String associateName;
	private int experience;
	private String designation;
	private String contactNo;
	private Set<Parcel> parcels;

}
