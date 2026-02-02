package com.fidelity.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserServices services = new UserServices();
		
		int eid = 100;
		
		String name;
		try {
			name = services.getUserNameById(eid);
			System.out.println(name);
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("please wait for 5 seconds");
		Thread.sleep(5000); //5000ms
		System.out.println("thanks for waiting");
	}

}
