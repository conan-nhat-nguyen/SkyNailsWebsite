package com.skynails.service;

import com.skynails.customer.*;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	
	private List<Customer> customers = Arrays.asList(
			new Customer("John","P",6.75),
			new Customer("Luis","MP",10.00),
			new Customer("Thomas","P",13.50),
			new Customer("Hart","P",12.0),
			new Customer("Amanda","M",14.0));
	
	public List<Customer> getCustomers() {
		return customers;
	}

}
