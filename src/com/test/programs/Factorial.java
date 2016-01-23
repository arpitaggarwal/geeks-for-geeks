package com.test.programs;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(findFactorial(5));
		System.out.println(fact(5));
	}

	public static int findFactorial(int i) {
		int fact = 1;
		/*
		 * for (int j = i; j >= 1; j--) { fact = fact * j; }
		 */
		for (int j = 1; j <= i; j++) {
			fact = fact * j;
		}
		return fact;
	}

	public static int fact(int i) {
		if (i == 1)
			return 1;
		return i * fact(i - 1);
	}

	public static int recursiveFactorial(Integer i) {
		int fact = 1;
		if (i <= 1) {
			return fact;
		} else {
			return findFactorial(i - 1) * i;
		}
	}

}
