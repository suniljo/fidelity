package com.fidelity.exceptions;

public class Except1 {

	public static void main(String[] args) {
		//int x = 10 / 0; //java.lang.ArithmeticException
		int[] nums = new int[10];
		System.out.println(nums[9]);
		//System.out.println(nums[10]);//java.lang.ArrayIndexOutOfBoundsException
		
		//String str = "";
		String str = null;
		//System.out.println(str.length()); //java.lang.NullPointerException
		
		String str1 = "625";
		System.out.println(str1 + 25); //62525
		int n = Integer.parseInt(str1);
		System.out.println(n + 25);
		
		n = Integer.parseInt("A"); //java.lang.NumberFormatException
	}
}
