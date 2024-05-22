package com.rest.api.exception;

public class ResourseNotFoundException extends RuntimeException {
	public ResourseNotFoundException() {
		super("Resouse not found exception");
	}
	public ResourseNotFoundException(String message) {
		super (message);
	}
}

