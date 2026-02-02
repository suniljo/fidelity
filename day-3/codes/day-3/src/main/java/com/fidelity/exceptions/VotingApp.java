package com.fidelity.exceptions;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String req = "Y";

		do {
			try {
				System.out.print("enter age of voter: ");
				int age = sc.nextInt();

				if (age >= 18) {
					System.out.println("Voting Done <beep><beep>");
				} else {
					throw new InvalidAgeException("age should be >= 18");
				}
			} catch (Exception ex) {
				System.err.println(ex.toString());
			}
			System.out.print("\nanyone else to vote? [Y/N]: ");
			req = sc.next();
		} while (req.equalsIgnoreCase("Y"));
		
		sc.close();

	}

}
