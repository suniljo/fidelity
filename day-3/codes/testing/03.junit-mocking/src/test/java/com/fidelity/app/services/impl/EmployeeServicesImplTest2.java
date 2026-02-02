package com.fidelity.app.services.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.fidelity.app.dao.EmployeeDAO;

public class EmployeeServicesImplTest2 {
	static EmployeesServicesImpl empService;
	
	@Mock
	static EmployeeDAO mockDaoObj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		empService = new EmployeesServicesImpl();		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		empService = null;
	}

	@BeforeEach
	public void testStarting() {
		/*
  			MockitoAnnotations.openMocks(this) is a Mockito method used to initialize fields annotated with @Mock, @Spy, or @InjectMocks in test classes. 
  			It replaces the deprecated initMocks method and is essential when not using MockitoJUnitRunner or MockitoExtension. 
  			It returns an AutoCloseable resource, ensuring proper cleanup of mocks, particularly static ones
		*/

		MockitoAnnotations.openMocks(this); 
	}
	
	@Test
	void testGetEmployeeNameById() {
		System.out.println(mockDaoObj);
		
		//inject mock object to service component
		empService.setDao(mockDaoObj);
		
		//--setting the behaviour for mock object 
		Mockito.when(mockDaoObj.findEmployeeNameById(101)).thenReturn("Sanjay");
		Mockito.when(mockDaoObj.findEmployeeNameById(102)).thenReturn("Praveen");
		
		int eid = 101;
		String ename = empService.getEmployeeNameById(eid);
		assertNotNull(ename);
	}

	@Test
	public void testFindAllNames() {
		List<String> names = Arrays.asList("Employee-1", "Employee-2");
		Mockito.when(mockDaoObj.findEmployeeNames()).thenReturn(names); //recording
		
		//inject mock object to service component
		empService.setDao(mockDaoObj);
		List<String> empNames = empService.findAllNames();
		System.out.println(empNames);
		assertNotNull(empNames);
	}	

}
