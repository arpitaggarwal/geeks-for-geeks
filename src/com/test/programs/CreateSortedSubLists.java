package com.test.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateSortedSubLists {

	public static void main(String[] args) {
		// input [1,2,10,10,8,12,5,23,1]
		// output: [[1,2,10,10],[8,12],[5,23],[1]]

		Integer[] array = new Integer[] { 1, 2, 10, 10, 8, 12, 5, 23, 1 };
		List<Integer> list = Arrays.asList(array);
		List<List<Integer>> listOfSubList = createSortedSubLists(list);
		System.out.println(listOfSubList);
	}

	/**
	 * Write a method that has a list as an input parameter and returns all
	 * ascending sorted sub-lists in that list. (all numbers are positive)
	 */
	public static List<List<Integer>> createSortedSubLists(List<Integer> numbers) {
		List<List<Integer>> list = new ArrayList<>();
		int temp = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			List<Integer> subList = new ArrayList<>();
			for (int j = i; j < numbers.size(); j++) {
				if (numbers.get(j) <= temp) {
					subList.add(numbers.get(j));
				} else {
					list.add(subList);
					break;
				}
				temp = numbers.get(j + 1);
			}
		}
		return list;
	}

	/**
	 * Write a method that has a list as an input parameter and returns all
	 * ascending sorted sub-lists in that list. (all numbers are positive)
	 */
	public static List<List<Integer>> sublist(List<Integer> numbers) {
		List<List<Integer>> list = new ArrayList<>();

		int temp = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (temp > numbers.get(i)) {

			}
		}

		return list;
	}
}
