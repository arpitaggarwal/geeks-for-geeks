package com.test.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedSubLists {

	public static void main(String[] args) {
		// input: [1,2,10],[8,12]
		// output: [1,2,8,10,12]

		// input: [1],[2,2,2,2]
		// output: [1,2,2,2,2]
		Integer[] array = new Integer[] { 1, 2, 10 };
		Integer[] array1 = new Integer[] { 8, 12 };

		Integer[] array2 = new Integer[] { 1 };
		Integer[] array3 = new Integer[] { 2, 2, 2, 2 };

		List<Integer> list = Arrays.asList(array);
		List<Integer> list1 = Arrays.asList(array1);

		List<Integer> list2 = Arrays.asList(array2);
		List<Integer> list3 = Arrays.asList(array3);

		List<Integer> listOfSubList = mergeSortedSubLists(list, list1);
		List<Integer> anotherListOfSubList = mergeSortedSubLists(list2, list3);
		System.out.println(listOfSubList);
		System.out.println(anotherListOfSubList);
	}

	/**
	 * Create a sorted list out of two sorted sub-lists. (you cannot use library
	 * methods to sort)
	 */
	public static List<Integer> mergeSortedSubLists(List<Integer> sortedList1,
			List<Integer> sortedList2) {
		List<Integer> finalList = new ArrayList<>();
		while (sortedList1.size() > 0 && sortedList2.size() > 0) {
			if (sortedList1.get(0) < sortedList2.get(0)) {
				finalList.add(sortedList1.get(0));
				sortedList1 = sortedList1.subList(1, sortedList1.size());
			} else {
				finalList.add(sortedList2.get(0));
				sortedList2 = sortedList2.subList(1, sortedList2.size());
			}
		}
		if (sortedList1.size() != 0) {
			finalList.addAll(sortedList1);
		}
		if (sortedList2.size() != 0) {
			finalList.addAll(sortedList2);
		}
		return finalList;
	}
}