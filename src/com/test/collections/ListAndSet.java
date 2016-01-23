package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("X");
		set.add("S");
		set.add("Q");
		set.add("A");

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("Printing List");
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("X");
		list.add("S");
		list.add("Q");
		list.add("A");

		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println(list.get('B')); //converts to character for int index
	}

}
