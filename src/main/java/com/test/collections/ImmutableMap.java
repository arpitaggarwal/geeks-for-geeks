package com.test.collections;

import java.util.Collections;
import java.util.Map;

public class ImmutableMap {

	public static void main(String[] args) {
		Map<String, String> map = Collections.emptyMap();
		map.put("A", "A");
		System.out.println(map);
	}
}
