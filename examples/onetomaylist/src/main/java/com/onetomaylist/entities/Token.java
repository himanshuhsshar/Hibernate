package com.onetomaylist.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@ToString
@EqualsAndHashCode
@Builder
public class Token implements Serializable{
	protected int tokenNo;
	protected String serviceType;
	protected String problem;
	protected LocalDateTime tokenIssuedDate;
	protected String customerName;
	protected String mobileNo;
	

}
