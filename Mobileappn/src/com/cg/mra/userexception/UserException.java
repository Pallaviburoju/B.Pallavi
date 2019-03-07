package com.cg.mra.userexception;

public class UserException extends Exception{
	public UserException() {
		System.err.println("Account Id entered doesn't exist");
	}
}
