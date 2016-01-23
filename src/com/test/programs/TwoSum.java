package com.test.programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	private static int[] array = new int[] { 11, 7, 11, 15 };

	private static int target = 22;

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

		int[] returnedArray = twoSum(array, target);
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

}
