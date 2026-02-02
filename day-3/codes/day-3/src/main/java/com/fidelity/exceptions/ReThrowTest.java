package com.fidelity.exceptions;

import java.util.Scanner;

public class ReThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			int z = x / y;
			
			System.out.println(String.format("%d / %d = %d", x, y, z));
		}catch(ArithmeticException ex) {
			System.err.println(ex.getMessage());
			throw new RuntimeException("exception");
		} finally {
			System.out.println("application designed & developed by");
			System.out.println("team @ fidelity");
			//sc.close();
		}
		
		System.out.println("-- done --");

	}

}
