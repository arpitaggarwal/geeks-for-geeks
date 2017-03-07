package com.test.programs;

public class PerfectNumber {
	/**
	 * A perfect number is a positive integer that is equal to the sum of its
	 * proper positive divisors, that is, the sum of its positive divisors
	 * excluding the number itself. Equivalently, a perfect number is a number
	 * that is half the sum of all of its positive divisors. Also, a number is
	 * perfect if it is equal to half the sum of all its positive
	 * divisors(including number).
	 * 
	 * The first perfect number is 6, because 1, 2 and 3 are its proper positive
	 * divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal to half
	 * the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6.
	 * 
	 * @param number
	 * @return
	 */
	public boolean isPerfectNumber(int number) {
		int temp = 0;
		for (int i = 1; i <= number - 1; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number) {
			System.out.println("It is a perfect number");
			return true;
		} else {
			System.out.println("It is not a perfect number");
			return false;
		}
	}

	public static void main(String a[]) {
		PerfectNumber ipn = new PerfectNumber();
		System.out.println("Is perfect number: " + ipn.isPerfectNumber(28));
		ipn.isPerfect(28);
	}

	private void isPerfect(int num) {
		if (num > 0) {
			int summison = 0;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					summison += j;
				}
			}
			if (summison / 2 == num) {
				System.out.println("Perfect Number");
			} else {
				System.out.println("Not Perfect");
			}
		}
	}

}
