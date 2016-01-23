package com.test.collections;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * HashMap works on equality not identity both represents same key and first is
 * replaced by second. So, size will be 1 for Map with these two as keys.
 * 
 */
public class IdentityHashMapExample {

	public static void main(String[] args) {
		identityHashMap();
	}

	private static void identityHashMap() {
		// uses System.identityHashCode(object) not hashcode()

		Map<String, String> identityMap = new IdentityHashMap<>();

		String str = "abc";
		String str1 = new String("abc");
		System.out.println(str.hashCode() + " ,, " + str1.hashCode() + " ,, "
				+ "".hashCode());
		identityMap.put(str, "bravia");
		identityMap.put(str1, "mobile");

		/**
		 * size of identityMap should be 2 here because two strings are
		 * different objects
		 **/
		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);
		System.out.println("String: " + identityMap.get(str));
		System.out.println("String 1: " + identityMap.get(str1));

		identityMap.put("abc", "videogame");

		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);

	}
}
