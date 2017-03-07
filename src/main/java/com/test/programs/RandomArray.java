package com.test.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomArray {

	private static int[] array = new int[] { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		Random random = new Random();

		for (int originalIndex = 0; originalIndex < array.length; originalIndex++) {
			int randomPosition = random.nextInt(array.length);
			swap(originalIndex, randomPosition);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();
		System.out.println("Using Collections.shuffle");
		// Create an array
		Integer[] intArray = new Integer[] { 1, 2, 3, 4 };

		// Shuffle the elements in the array
		Collections.shuffle(Arrays.asList(intArray));
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ",");
		}
	}

	private static void swap(int originalIndex, int randomPosition) {
		int tmp = array[originalIndex];
		array[originalIndex] = array[randomPosition];
		array[randomPosition] = tmp;
	}

}
