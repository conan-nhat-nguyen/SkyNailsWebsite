package com.skynails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.skynails.customer.Customer;
import com.skynails.service.AppointmentService;


@RestController
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping("/customers")
	public List<Customer> getCustomers() {
		return appointmentService.getCustomers();
	}

}
