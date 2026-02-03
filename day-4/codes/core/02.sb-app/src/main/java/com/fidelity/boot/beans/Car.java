package com.fidelity.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

//@Component //Indicates that the annotated class is a component.
//@Component("mycar")
@Component(value = "mycar")
public class Car {
	
	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void startJourney() {
		boolean journeyStatus = new Random().nextBoolean();
		
		if(journeyStatus)
		  System.out.println("Happy Journey");
		else
		  System.err.println("Journey Cancelled");	
	}
}
