package com.neps.spring.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "web_orders")
@Getter
@Setter
public class WebOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	@Column
	private String webOrderNumber;
	
	@Column
	private Instant created;
	
	@Column
	private String storeAlias;
	
	@Column
	private String parts;
	
	@Column
	private String carrier;
	
	@Column
	private String inductionStatus;
	
	@Column
	private String accountId;
	
	@Column
	private String country;
	
	@Column
	private String keywords;
	
	@Column
	private String orderType;
	
	@Column
	private String orderStatus;
	
	@Column
	private String paymentType;
}
