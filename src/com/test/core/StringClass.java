package com.test.core;

public class StringClass {

	public static void main(String[] args) {
		String str = "abc";
		str.concat("pqr");
		System.out.println(str);
		System.out.println(printString(str));
		
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1.hashCode() + " ,, " + str2.hashCode() + " ,, "
				+ "".hashCode());
		//hash code same , but not equal
		System.out.println(str1 == str2);
		
		
	}

	public static String printString(String str) {
		return str.concat("defg");
	}
}
