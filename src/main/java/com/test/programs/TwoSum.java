package com.test.programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	private static int[] array = new int[] { 2, 6, 4, 3 };

	private static int target = 5;

	public static void main(String[] args) {

		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length & i != j; j++) {

				if (array[i] + array[j] == target) {
					index1 = i + 1;
					index2 = j + 1;
					break;
				}

			}
		}
		System.out.println(index1);
		System.out.println(index2);

		int[] returnedArray = getTwoSum(array, target);
		for (int i = 0; i < returnedArray.length; i++) {
			System.out.print(returnedArray[i] + ",,");
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}

	public static int[] getTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				int index = map.get(target - numbers[i]);
				result[0] = index + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(numbers[i], i);
			}
		}
		return result;
	}
}
