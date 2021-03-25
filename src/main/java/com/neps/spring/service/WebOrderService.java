package com.neps.spring.service;

import java.util.List;

import com.neps.spring.model.WebOrderDto;

public interface WebOrderService {
	public List<WebOrderDto> getAllWebOrders();
	public WebOrderDto createWebOrder(WebOrderDto webOrderDto);
}
