package com.fidelitysolid.srp;

public class NotificationService {
	public void sendOTP(String medium) {
		if(medium.equalsIgnoreCase("mobile")) {
			System.out.println("sending OTP to mobile");			
			//write mobile related logic - use Twilio API
		}
		else if(medium.equalsIgnoreCase("email")) {
			System.out.println("sending OTP to email");
			//write email related logic - use JavaMailSender API
		}
	}
}
