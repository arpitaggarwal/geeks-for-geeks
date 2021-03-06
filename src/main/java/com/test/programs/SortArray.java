package com.test.programs;

public class SortArray {

	public static void main(String[] args) {
		int array[] = new int[] { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

		/* Initialize left and right indexes */
		int left = 0, right = array.length - 1;

		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (array[left] == 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (array[right] == 1 && left < right)
				right--;
			/*
			 * If left is smaller than right then there is a 1 at left and a 0
			 * at right. Exchange arr[left] and arr[right]
			 */
			if (left < right) {
				array[left] = 0;
				array[right] = 1;
				left++;
				right--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
