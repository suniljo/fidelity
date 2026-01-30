package com.fidelity.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Praveen","Aravind", "Bharath", "Wilson");
		System.out.println(names);
		
		//using anonymous class concept
		Consumer<String> consumerRef1 = new Consumer<String>() {
			public void accept(String name) {
				System.out.println(name);
			}
		};
		names.forEach(consumerRef1);

		System.out.println("\n"+"=".repeat(100));
		
		//using lambdas
		Consumer<String> consumerRef2 = name -> {
			System.out.println(name);
		};
		names.forEach(consumerRef2);
		System.out.println("\n"+"-".repeat(100));

		Consumer consumerRef3 = name -> System.out.println(name);		
		names.forEach(consumerRef3);
		System.out.println("\n"+"-".repeat(100));	
		
		names.forEach(name -> System.out.print(name+","));
		System.out.println();
		
		names.forEach(System.out::println);
		System.out.println();
		
		
		Function<String, Integer> funRef = str -> str.length();
			
		String str = "Fidelity";
		int n = funRef.apply(str);
		System.out.println(n);
	}

}
