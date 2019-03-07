package com.cg.mra.userexception;

public class InvalidmobilenoException extends Exception {
	public InvalidmobilenoException() {
		System.err.println("Mobile no. is not valid");
	}
}
