package com.test.core;

import java.io.IOException;

class AirPlane {
	public AirPlane() throws IOException {
		System.out.println("AirPlane");
		throw new IOException();
	}

	public void method() throws Exception {
		throw new Exception();
	}
}

class JetPlane extends AirPlane {
	// removing throws IOException from constructor of child class will show
	// compile error
	// public JetPlane() {
	public JetPlane() throws IOException {
		try {
			new AirPlane();
		} catch (IOException exception) {
			System.out.println("JetPlane Exception");
		}

	}

	public void method1() {
		try {
			method();
		} catch (Exception e) {
		}
	}

}

public class CatchException {

	public static void main(String[] args) {
		try {
			new JetPlane();
		} catch (IOException e) {

		}
		// even though we catched parent exception in child class, code below is
		// not complaining about unreachable code.
		try {
			new JetPlane().method1();
		} catch (Exception e) {

		}

	}

}
