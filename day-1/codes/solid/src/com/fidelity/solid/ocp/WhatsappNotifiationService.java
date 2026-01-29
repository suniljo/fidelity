package com.fidelity.solid.ocp;

public class WhatsappNotifiationService implements NotificationService {

	@Override
	public void sendOTP(String medium) {
		System.out.println("logic to send OTP to Whatsapp");
	}

}
