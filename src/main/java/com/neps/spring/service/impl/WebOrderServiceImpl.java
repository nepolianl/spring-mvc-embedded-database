package com.neps.spring.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neps.spring.domain.WebOrder;
import com.neps.spring.model.WebOrderDto;
import com.neps.spring.repository.WebOrderRepository;
import com.neps.spring.service.WebOrderService;

@Service
public class WebOrderServiceImpl implements WebOrderService {

	@Autowired
	private WebOrderRepository repository;
	
	@Override
	public List<WebOrderDto> getAllWebOrders() {
		return Optional.ofNullable(this.repository.findAll())
				.orElseGet(Collections::emptyList)
				.stream()
				.map(WebOrderDto::transform)
				.sorted(Comparator.comparing(WebOrderDto::getCreated))
				.collect(Collectors.toList());
	}

	@Override
	public WebOrderDto createWebOrder(WebOrderDto webOrderDto) {
		WebOrder webOrder = this.repository.save(WebOrderDto.transform(webOrderDto));
		return WebOrderDto.transform(webOrder);
	}

}
