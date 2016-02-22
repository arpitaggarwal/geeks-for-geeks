package com.test.core;

public class ChildClass extends BaseClass implements Cloneable {

	public ChildClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * protected ChildClass(String name) { super(name); // TODO Auto-generated
	 * constructor stub }
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		ChildClass childClass = new ChildClass("");
		childClass.hello();
		ChildClass childClassNew = new ChildClass("");
		System.out.println(childClassNew.clone() == childClassNew);
		
	}

	// We can throw RuntimeExceptions from Child class even Parent class method
	// is not throwing any exception.
	@Override
	public void hello() throws IllegalArgumentException {
		System.out.println("hello");
		
	}
}
