package com.fidelity.app.services;

import java.util.List;

public interface EmployeeServices {
	public String getEmployeeNameById(int eid);
	
	public List<String> findAllNames();
}
