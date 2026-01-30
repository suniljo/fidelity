package com.fidelity.java.lambdas;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
		String str = "Java";
		
		Function<String, String> strLenFun = st -> st.toUpperCase();
		System.out.println(strLenFun.apply(str));
	}
}
