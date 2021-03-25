package com.neps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neps.spring.model.WebOrderDto;
import com.neps.spring.service.WebOrderService;

@RestController
@RequestMapping("api")
public class WebOrderController {

	@Autowired
	private WebOrderService webOrderService;
	
	@GetMapping("/getAllWebOrders")
	public List<WebOrderDto> getAllWebOrders() {
		return this.webOrderService.getAllWebOrders();
	}
	
	@PostMapping("/createWebOrder")
	public WebOrderDto createWebOrder(@RequestBody WebOrderDto webOrderDto) {
		return this.webOrderService.createWebOrder(webOrderDto);
	}
}
