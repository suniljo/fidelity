package com.fidelity.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckTest {
	static PalindromeCheck palObj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		palObj = new PalindromeCheck();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		palObj = null;
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"eye", "malayalam", "racecar", "Radar", "liril", "madam"})
	void testIsPalindrome(String str) {
		//System.out.println(str);
		boolean actualResult = palObj.isPalindrome(str);
		Assertions.assertTrue(actualResult);
	}

	
	@ParameterizedTest
	@ValueSource(strings = {"abc", "java", "spring"})
	void testIsPalindrome1(String str) {
		//System.out.println(str);
		boolean actualResult = palObj.isPalindrome(str);
		Assertions.assertFalse(actualResult);
	}	
}
