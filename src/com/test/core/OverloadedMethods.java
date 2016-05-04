package com.test.core;

public class OverloadedMethods {

	/**
	 * Compile time error (Ambiguous methods) After Commenting, Integer method,
	 * return String called. After Commenting, String method, Object called.
	 * 
	 * This works on level:
	 * 
	 * Lower one will be having highest priority.
	 * 
	 * As Object is on higher level than Integer, it is called once Integer is
	 * commented. And as String and Integer are on same level, compiler will
	 * complain about Ambiguous methods.
	 * 
	 * Not applicable on primitives as they can't accept null.
	 * 
	 * Reference :
	 * http://geekexplains.blogspot.in/2009/06/choosing-most-specific
	 * -method-tricky.html
	 */
	public static void main(String[] args) {
		OverloadedMethods obj = new OverloadedMethods();
		obj.get(null, null);
	}

	public void get(String a, String b) {
		System.out.println("String called");
	}

	/*
	 * public void get(Integer a, Integer b) {
	 * System.out.println("Integer called"); }
	 */

	public void get(int a, int b) {
		System.out.println("Primitive called");
	}

	public void get(Object a, Object b) {
		System.out.println("Object called");
	}

}
