package com.skynails.customer;

public class Customer {
	private String name;
	private String service;
	private double appointmentTime;
	
	public Customer() {}
	
	public Customer(String name, String service, double appointmentTime) {
		this.name = name;
		this.service = service;
		this.appointmentTime = appointmentTime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(double appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

}
