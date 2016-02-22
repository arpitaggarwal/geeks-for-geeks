package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class SortMapOnValues {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(3, "Z");
		map.put(4, "C");
		map.put(2, "H");
		map.put(5, "K");
		map.put(6, "B");

		map.forEach(consumer);

		System.out.println("Map after sorting on keys using TreeMap");
		Map<Integer, String> treeMapSort = new TreeMap<>(map);
		treeMapSort.forEach(consumer);

		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

		Collections
				.sort(list,
						(o1, o2) -> ((Comparable<String>) ((Map.Entry<Integer, String>) o1)
								.getValue())
								.compareTo(((Map.Entry<Integer, String>) (o2))
										.getValue())

				);

		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> element : list) {
			sortedMap.put(element.getKey(), element.getValue());
		}
		System.out.println("Map after sorting on values");
		sortedMap.forEach(consumer);
	}

	public static BiConsumer<Integer, String> consumer = (key, value) -> System.out
			.println("key: " + key + " value: " + value);

}
