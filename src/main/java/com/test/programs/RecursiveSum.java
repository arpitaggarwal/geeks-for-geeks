package com.test.programs;

public class RecursiveSum {

	public static void main(String[] args) {
		System.out.println(sum(12345));
	}

	private static int sum(int number) {
		if (number == 0) {
			return number;
		} else {
			return number % 10 + sum(number / 10);
		}
	}
}
