package com.fidelity.boot.utils;

import java.util.Base64;

public class DataSecurity {

	public DataSecurity() {
		System.out.println("DataSecurity :: Constructor");
	}
	
	public String encodeData(String data) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedData = encoder.encodeToString(data.getBytes());
		return encodedData;
	}
	
	public void initMethod() {
		System.out.println("user-defined post-construct");
	}
	
	public void destroyMethod() {
		System.out.println("user-defined pre-destroy");
	}
}
