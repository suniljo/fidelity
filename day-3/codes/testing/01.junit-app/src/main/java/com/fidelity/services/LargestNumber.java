package com.fidelity.services;

public class LargestNumber {
	
	public int findLargest(int[] nums) {
		//int lar = 0;
		int lar = nums[0];
		
		for(int n : nums) {
			if(n > lar) {
				lar = n;
			}
		}
		return lar;
	}
}
