package com.neps.spring.model;

import java.time.Instant;

import com.neps.spring.domain.WebOrder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebOrderDto {
	private Integer orderId;
	private String webOrderNumber;
	private String storeAlias;
	private String inductionStatus;
	private String accountId;
	private String country;
	private String parts;
	private String carrier;
	private String paymentType;
	private String orderType;
	private String orderStatus;
	private String keywords;
	private Instant created;
	
	public static WebOrderDto transform(WebOrder webOrder) {
		WebOrderDto dto = new WebOrderDto();
		dto.setOrderId(webOrder.getOrderId());
		dto.setAccountId(webOrder.getAccountId());
		dto.setCountry(webOrder.getCountry());
		dto.setOrderStatus(webOrder.getOrderStatus());
		dto.setOrderType(webOrder.getOrderType());
		dto.setWebOrderNumber(webOrder.getWebOrderNumber());
		dto.setInductionStatus(webOrder.getInductionStatus());
		dto.setPaymentType(webOrder.getPaymentType());
		dto.setStoreAlias(webOrder.getStoreAlias());
		dto.setKeywords(webOrder.getKeywords());
		dto.setParts(webOrder.getParts());
		dto.setCarrier(webOrder.getCarrier());
		dto.setCreated(webOrder.getCreated());
		
		return dto;
	}
	
	public static WebOrder transform(WebOrderDto dto) {
		WebOrder webOrder = new WebOrder();
		webOrder.setOrderId(dto.getOrderId());
		webOrder.setAccountId(dto.getAccountId());
		webOrder.setCountry(dto.getCountry());
		webOrder.setOrderStatus(dto.getOrderStatus());
		webOrder.setOrderType(dto.getOrderType());
		webOrder.setWebOrderNumber(dto.getWebOrderNumber());
		webOrder.setInductionStatus(dto.getInductionStatus());
		webOrder.setPaymentType(dto.getPaymentType());
		webOrder.setStoreAlias(dto.getStoreAlias());
		webOrder.setKeywords(dto.getKeywords());
		webOrder.setParts(dto.getParts());
		webOrder.setCarrier(dto.getCarrier());
		webOrder.setCreated(Instant.now());
		
		return webOrder;
	}
}
