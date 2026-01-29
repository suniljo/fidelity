package com.fidelity.solid.ocp;

public class MobileNotificationService implements NotificationService {

	@Override
	public void sendOTP(String medium) {
		System.out.println("logic to send OTP to mobile");
	}

}
