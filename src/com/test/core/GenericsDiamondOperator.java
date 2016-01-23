package com.test.core;

import java.util.LinkedList;
import java.util.List;

public class GenericsDiamondOperator {

	public static void main(String[] args) {
		// some list that contains some strings
		List<String> strings = new LinkedList<String>();

		// Totally legal since you used the raw type and lost all type checking!
		// List<Integer> integers = new LinkedList<>(strings);
		// Not legal since the right side is actually generic!
		//List<Integer> integers = new LinkedList(strings);
		/**
		 * The diamond operator, however, allows the right hand side of the
		 * assignment to be defined as a true generic instance with the same
		 * type parameters as the left side... without having to type those
		 * parameters again. It allows you to keep the safety of generics with
		 * almost the same effort as using the raw type.
		 */

		
		strings.add("A");
		strings.add("B");
		// Totally legal since you used the raw type and lost all type checking!
		List<Integer> integers = new LinkedList(strings);

		for (Integer integer : integers) {
			System.out.println(integer); // ClassCastException
		}

	}
}
