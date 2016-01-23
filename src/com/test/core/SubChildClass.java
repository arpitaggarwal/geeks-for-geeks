package com.test.core;

public class SubChildClass extends ChildClass{

	public SubChildClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SubChildClass subChildClass = new SubChildClass("");
		subChildClass.welcome();
		subChildClass.hello();
	}

}
