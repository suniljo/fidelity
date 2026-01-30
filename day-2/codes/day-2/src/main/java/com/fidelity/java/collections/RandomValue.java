package com.fidelity.java.collections;

import java.time.LocalDate;
import java.util.Random;

public class RandomValue {

	public static void main(String[] args) {
		Random random = new Random();
		int otp = random.nextInt(10000, 99999);
		System.out.println(otp);
		
		//System.out.println(random.nextFloat()); //0-1
		float randomFloat = random.nextFloat();
		randomFloat = randomFloat * 10000;
		System.out.println((int)randomFloat);
		System.out.println(Math.round(randomFloat));
		
		//LocalDate d = LocalDate.now();
		//LocalDate d = LocalDate.of(2024, 11, 1);
		String dateInString = "2024-11-01";
		LocalDate d = LocalDate.parse(dateInString);
		System.out.println(d.getDayOfWeek().name());
	}

}
