package com.onetomanyasonetoone.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString()
@EqualsAndHashCode(exclude = {"account"})
public class Locker implements Serializable {
	protected int lockerNo;
	protected String keyNo;
	protected String dimensions;
	protected double charges;
	Account account;

}
