package com.fidelity.trainings.java;

public class App1 {

	public static void main(String[] args) {
		System.out.println("Welcome to LEAP");

		// int n = 12;
		// int n = 012;
		// int n = 0x12;
		int n = 0B11;
		System.out.println(n);

		System.out.println(10 / 3);
		System.out.println(10f / 3);
		System.out.println(10.0 / 3);
		// float f = 10.0f;
		// float f = 10.0F;;
		float f = (float) 10.0;

		// System.out.println(10 / 0); //java.lang.ArithmeticException
		System.out.println(10f / 0); // Infinity
		System.out.println(10.0 / 0); // Infinity
		System.out.println(-10.0 / 0); // -Infinity
		System.out.println(0.0 / 0); // NaN

		byte b1 = 12;
		byte b2 = 13;
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);

		System.out.println("min value of byte = " + Byte.MIN_VALUE);
		// byte b4 = (byte) 128;
		byte b4 = (byte) 1000;
		System.out.println(b4);

		char ch = 'A';
		System.out.println(ch);
		System.out.println("hexa decimal value of 65 = " + Integer.toHexString(65));
		ch = 65;
		System.out.println(ch);

		ch = '\u0041';
		System.out.println(ch);
		System.out.println('\u0905');
		System.out.println('\u0D05');
		System.out.println('\u0C05');
		System.out.println('\u4eca');

		n = 1;

		switch (n) {
		 case 0:
			System.out.println("A");
			break;
		 case 1:
			System.out.println("B");
			break;
		 case 2:
			System.out.println("C");
			break;
		 default:
			System.out.println("D");
		}
	}

}
