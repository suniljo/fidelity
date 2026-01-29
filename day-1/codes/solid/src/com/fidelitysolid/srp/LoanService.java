package com.fidelitysolid.srp;

public class LoanService {
	public void getLoanInterest(String loanType) {
		if(loanType.equalsIgnoreCase("homeloan")) {
			//write logic to get homeloan interest rate
			System.out.println("homeloan @ ...");
		}
		else if(loanType.equalsIgnoreCase("personalloan")) {
			//write logic to get personalloan interest rate
			System.out.println("personalloan @ ...");
		}	
	}
}
