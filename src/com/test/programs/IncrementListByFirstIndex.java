package com.test.programs;

import java.util.Arrays;
import java.util.List;

public class IncrementListByFirstIndex {

	public static void main(String[] args) {
		List<Integer> data1 = Arrays.asList(1, 4, 7);
		List<Integer> data2 = Arrays.asList(123, -2, 477, 3, 14, 6551);

		IncrementListByFirstIndex obj = new IncrementListByFirstIndex();

		int result = obj.fold(data1);
		System.out.println(result); // 13

		int yourAnswer = obj.fold(data2); // what is the answer for this one???
		System.out.println(yourAnswer);
	}

	private int fold(List<Integer> input) {
		if (input.size() == 1) {
			return input.get(0);
		} else {
			int firstIndexValue = input.get(0);
			for (int i = 1; i < input.size(); i++) {
				input.set(i, input.get(i) + firstIndexValue);
			}
			return fold(input.subList(1, input.size()));
		}
	}

}
