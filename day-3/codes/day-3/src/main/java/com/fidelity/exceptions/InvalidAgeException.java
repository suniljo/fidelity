package com.fidelity.exceptions;

public class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String message) {
		super(message);
	}
}
