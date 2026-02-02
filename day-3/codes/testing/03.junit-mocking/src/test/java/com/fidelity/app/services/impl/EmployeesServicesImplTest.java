package com.fidelity.app.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.fidelity.app.dao.EmployeeDAO;

class EmployeesServicesImplTest {

	@Test
	void testGetEmployeeNameById() {
		EmployeeDAO daoMock = Mockito.mock(EmployeeDAO.class); //Creates mock object of given class or interface.
		//System.out.println(daoMock);
		
		EmployeesServicesImpl empServices = new EmployeesServicesImpl();
		
		//inject mock object to service component
		empServices.setDao(daoMock); 
		
		//--setting the behaviour for mock object 
		Mockito.when(daoMock.findEmployeeNameById(101)).thenReturn("Sanjay"); //stubbing/ recording
		
		int eid = 101;
		String expectedName = "Sanjay";
		String actualName = empServices.getEmployeeNameById(eid);
		
		assertEquals(expectedName, actualName);
	}

	@Test
	void testFindAllNames() {
		EmployeeDAO daoMock = Mockito.mock(EmployeeDAO.class); //Creates mock object of given class or interface.
		//System.out.println(daoMock);
		
		EmployeesServicesImpl empServices = new EmployeesServicesImpl();
		
		//inject mock object to service component
		empServices.setDao(daoMock); 
		
		
		@SuppressWarnings("unchecked")
		List<String> empNamesMock = (List<String>)Mockito.mock(List.class);
		empNamesMock.add("emp-1");
		empNamesMock.add("emp-2");
		
		//--setting the behaviour for mock object 
		Mockito.when(daoMock.findEmployeeNames()).thenReturn(empNamesMock); //stubbing/ recording
		
		List<String> empNames = empServices.findAllNames();
		
		Assertions.assertNotNull(empNames);		
	}

}
