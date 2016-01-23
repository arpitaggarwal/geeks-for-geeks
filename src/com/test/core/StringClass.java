package com.test.core;

public class StringClass {

	public static void main(String[] args) {
		String str = "abc";
		str.concat("pqr");
		System.out.println(str);
		System.out.println(printString(str));
	}

	public static String printString(String str) {
		return str.concat("defg");
	}
}
