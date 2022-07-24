package com.inverse.entities;

import java.io.Serializable;

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
@EqualsAndHashCode(exclude = "deliveryAssociate")
@ToString(exclude = "deliveryAssociate")
public class Parcel implements Serializable {
	private int parcelNo;
	private String description;
	private String deliveryType;
	private int weight;
	private double charges;
	private DeliveryAssociate deliveryAssociate;

}
