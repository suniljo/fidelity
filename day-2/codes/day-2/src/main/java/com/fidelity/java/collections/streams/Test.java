package com.fidelity.java.collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		List<Integer> numsSquare = nums.stream()
									   .map(num -> num *2)
									   .collect(Collectors.toList());
		System.out.println(numsSquare);
	
	}

}
