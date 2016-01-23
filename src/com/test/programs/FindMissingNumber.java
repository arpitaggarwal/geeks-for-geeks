package com.test.programs;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 10, 11 };

		forSortedArray(array);
		naturalNumbersSum(array);
		multipleMissingNumber();

	}

	/**
	 * Create a new array b[] of the size of missing numbers array a[] +number
	 * of digits missing copy the numbers from first array into second array so
	 * that b[a[i-1]] = a[i] Now search the second array to see which field is
	 * contains zero Missing fields = array positions having zero + 1
	 */
	private static void multipleMissingNumber() {
		int array[] = { 2, 4, 3, 5, 7, 8, 10, 9 };
		int missingArray[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			missingArray[array[i] - 1] = array[i];
		}
		System.out.print("Missing number is ");
		for (int i = 0; i < missingArray.length; i++) {
			if (missingArray[i] == 0) {
				System.out.print(i + 1 + ",");
			}
		}
	}

	private static void naturalNumbersSum(int[] array) {
		int n = array.length + 1;
		int sumOfNaturalNumbers = n * (n + 1) / 2;
		int sumOfNumbersInArray = 0;
		for (int i = 0; i < array.length; i++) {
			sumOfNumbersInArray += array[i];
		}
		System.out.println("Missing Number "
				+ (sumOfNaturalNumbers - sumOfNumbersInArray));
	}

	private static void forSortedArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i + 1) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
