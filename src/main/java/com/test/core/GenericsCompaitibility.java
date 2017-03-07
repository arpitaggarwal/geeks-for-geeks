package com.test.core;

import java.util.List;

/**
 * 
 * It is compile time error as before 1.5 java does not support generics and
 * java is backward compatible so it has to follow rules previously defined,
 * that's why it generates compile error.
 *
 */
public class GenericsCompaitibility {
	public void setList(List<Integer> list) {

	}

	/*
	 * public void setList(List<String> list) {
	 * 
	 * }
	 */

}
