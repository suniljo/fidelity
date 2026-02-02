package com.fidelity.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeServices {

	List<Employee> employees = new ArrayList<Employee>();

	public List<Employee> loadEmloyeesFromDB() {
		employees = IntStream.rangeClosed(101, 110)
							 .mapToObj(eid -> new Employee(eid, "Employee-" + eid, new Random().nextFloat(10000, 20000)))
							 .collect(Collectors.toList());
		return employees;
	}

}
