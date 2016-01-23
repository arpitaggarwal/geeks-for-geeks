package com.test.programs;

public class Permutations {

	/**
	 * There are basically two types of permutation:
	 * 
	 * 1). Repetition is Allowed: n^r 
	 * 2). No Repetition: for example the first three people in a running race. You can't be first and second. n!/(n-r)!
	 * 
	 * Where n is the number of things to choose from and we choose r of them (No repetition, Order Matters).
	 * 
	 * How many ways can first and second place be awarded to 10 people?
	 * 
	 * 10! = 10 * 9 = 90 (10-2)!
	 * 
	 * Also, 0! = 1;
	 * 
	 * Combination Formula:
	 * 
	 * 
	 * Note: , where nPr is the formula for permutations of nobjects taken r at
	 * a time.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		permutation("abc");
	}

	/**
	 * Try each of the letters in turn as the first letter and then find all the
	 * permutations of the remaining letters using a recursive call.
	 * 
	 * The base case is when the input is an empty string the only permutation
	 * is the empty string.
	 */

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
	}

}
