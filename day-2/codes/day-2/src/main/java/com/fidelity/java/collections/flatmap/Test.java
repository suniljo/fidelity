package com.fidelity.java.collections.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		/*
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		for(Integer i : list){
		    //list.add(3); //java.util.ConcurrentModificationException
			System.out.println(i);
		}
		*/
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		for(Integer i : list){
		    list.add(3); 
			System.out.println(i);
		}
		System.out.println(list);
		
		Vehicle v = new Car();
		System.out.println(v.getClass().getSimpleName());
	}

}

sealed class Vehicle permits Car, Bike {}
final class Car extends Vehicle {}
final class Bike extends Vehicle {}
