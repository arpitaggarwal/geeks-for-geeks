package com.test.programs;

public class TwoMaxNumbers {
	public static void main(String a[]) {
		int num[] = { 200, 115, 34, 78, 2, 45, 1, 199, 23 };
		TwoMaxNumbers tmn = new TwoMaxNumbers();
		tmn.printTwoMaxNumbers(num);
	}

	private void printTwoMaxNumbers(int[] num) {
		int firstMax = 0;
		int secondMax = 0;

		for (int i = 0; i < num.length - 1; i++) {
			if (firstMax < num[i]) {
				secondMax = firstMax;
				firstMax = num[i];
			} else if (secondMax < num[i] && secondMax != firstMax) {
				secondMax = num[i];
			}
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
	}

}
