package com.fidelity.trainings.java;

class A{
	public void display() {
		System.out.println("class A");
	}
}

class B extends A{

	@Override
	public void display() {
		System.out.println("class B");
	}
	
}
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
