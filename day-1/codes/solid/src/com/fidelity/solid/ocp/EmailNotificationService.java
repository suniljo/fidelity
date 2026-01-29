package com.fidelity.solid.ocp;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendOTP(String medium) {
		System.out.println("logic to send OTP to email");
	}
}
