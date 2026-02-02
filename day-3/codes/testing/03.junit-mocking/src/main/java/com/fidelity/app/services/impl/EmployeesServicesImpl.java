package com.fidelity.app.services.impl;

import java.util.List;

import com.fidelity.app.dao.EmployeeDAO;
import com.fidelity.app.services.EmployeeServices;

public class EmployeesServicesImpl implements EmployeeServices {
	private EmployeeDAO dao;
	
	public EmployeesServicesImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeesServicesImpl(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String getEmployeeNameById(int eid) {
		String name = dao.findEmployeeNameById(eid);
		return name;
	}

	@Override
	public List<String> findAllNames() {
		List<String> empNames = dao.findEmployeeNames();
		if(empNames.isEmpty())
			return null;
		
		return empNames;
	}

}
