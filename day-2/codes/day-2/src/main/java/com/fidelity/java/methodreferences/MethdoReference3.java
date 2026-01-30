package com.fidelity.java.methodreferences;

import java.io.PrintStream;

@FunctionalInterface
interface Inter1{
	public void welcomeMessage(String str);
}

public class MethdoReference3 {

	public static void main(String[] args) {
		//Inter1 intrRef = str -> System.out.println("Hi " + str + ", welcome to Fidelity");
		
		/*
		PrintStream ps = System.out;
		Inter1 intrRef = str -> ps.println("Hi " + str + ", welcome to Fidelity");
		*/
		PrintStream ps = System.out;
		//Inter1 intrRef = ps::println;
		Inter1 intrRef = System.out::println;
		intrRef.welcomeMessage("Ashi");
	}

}
