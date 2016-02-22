package com.test.core;

public class ClassLoaderTest {
	/**
	 * References :
	 * http://javarevisited.blogspot.in/2012/12/how-classloader-works
	 * -in-java.html
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			// printing ClassLoader of this class
			System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
					+ ClassLoaderTest.class.getClassLoader());

			// trying to explicitly load this class again using Extension class
			// loader
			Class.forName("test.ClassLoaderTest", true, ClassLoaderTest.class
					.getClassLoader().getParent());
		} catch (ClassNotFoundException ex) {
			System.err.println(ex);
		}
	}

}
