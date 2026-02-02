package com.fidelity.streams;

import java.util.List;

public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeServices empServices = new EmployeeServices();
		
		List<Employee> emps = empServices.loadEmloyeesFromDB();
		
		emps.stream()
			.forEach(System.out::println);
	}

}
