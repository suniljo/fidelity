package com.fidelity.services;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//@Disabled
class LargestNumberTest {
	static LargestNumber larObj = null;
	
	@BeforeAll
	public static void initializeTests() {
		larObj = new LargestNumber();
		System.out.println("before all tests");
	}
	
	@AfterAll
	public static void cleanupTests() {
		System.out.println("after all tests");
		larObj = null;
	}
	
	@Test
	@DisplayName("Should return largest of all positive numbers")
	void testFindLargest() {
		int[] nums = {25, 74, 23, 5, 12, 0, 9};
		int expectedValue = 74;
		
		//LargestNumber larObj = new LargestNumber();
		int actualValue = larObj.findLargest(nums);
		
		Assertions.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	@DisplayName("Should return largest for all positive & negative numbers")
	void testFindLargest1() {
		int[] nums = {25, -74, 23, -5, 12, 0, -9};
		int expectedValue = 25;
		
		//LargestNumber larObj = new LargestNumber();
		int actualValue = larObj.findLargest(nums);
		
		Assertions.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	@DisplayName("Should return largest of all negative numbers")
	void testFindLargest2() {
		int[] nums = {-25, -74, -23, -5, -12, -9};
		int expectedValue = -5;
		
		//LargestNumber larObj = new LargestNumber();
		int actualValue = larObj.findLargest(nums);
		
		Assertions.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	@DisplayName("Should throw ArrayIndexOutOfBoundsException for empty array")
	void testFindLargest3() {
		int[] nums = {};
	
		//LargestNumber larObj = new LargestNumber();
		/*
		assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				larObj.findLargest(nums);				
			}			
		});
		*/
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> larObj.findLargest(nums));			
	}
	
	@Test
	@Disabled
	@DisplayName("Should throw NullPointerException for null reference")
	void testFindLargest4() {
		//LargestNumber larObj = new LargestNumber();
		assertThrows(NullPointerException.class, () -> larObj.findLargest(null));			
	}		
}
