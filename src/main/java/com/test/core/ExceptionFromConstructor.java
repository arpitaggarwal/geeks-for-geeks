package com.test.core;

public class ExceptionFromConstructor {

	public ExceptionFromConstructor() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) throws Exception {
		new ExceptionFromConstructor();
	}
	
	
}
