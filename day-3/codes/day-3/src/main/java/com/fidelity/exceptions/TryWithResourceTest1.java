package com.fidelity.exceptions;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements AutoCloseable{
	
	public void logic() {
		System.out.println("resource-1 logic");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("closing resource-1");
	}	
}

class MyResource2 implements Closeable{
	
	public void logic() {
		System.out.println("resource-2 logic");
	}
	
	@Override
	public void close() {
		System.out.println("closing resource-2");
	}	
}
public class TryWithResourceTest1 {

	public static void main(String[] args) throws Exception {
		
		try(MyResource1 rs1 = new MyResource1(); MyResource2 rs2 = new MyResource2()){
			rs1.logic();
			rs2.logic();
		}
		System.out.println("--done--");
	}

}
