package com.test.core;

public class ClassWithStaticBlock {
	
	static {
		System.out.println("Static Block Called!");
	}

	public ClassWithStaticBlock() {
		System.out.println("Constuctor Called!");
	}

	public static void main(String[] args) {
		System.out.println("Main Called!");
		ClassWithStaticBlock object = new ClassWithStaticBlock();
		try{
			
		}catch(Exception e){
			try {
				throw new ClassNotFoundException();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
