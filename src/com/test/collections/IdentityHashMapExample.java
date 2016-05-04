package com.test.collections;

import java.util.HashMap;
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
		Map<String, String> hashMap = new HashMap<>();

		String str = "abc";
		String str1 = new String("abc");
		System.out.println(str.hashCode() + " ,, " + str1.hashCode() + " ,, "
				+ "".hashCode());
		//hash code same , but not equal
		System.out.println(str == str1);
		identityMap.put(str, "bravia");
		identityMap.put(str1, "mobile");

		hashMap.put(str, "bravia");
		hashMap.put(str1, "mobile");

		/**
		 * size of identityMap should be 2 here because two strings are
		 * different objects
		 **/
		System.out.println("********* IdentityHashMap *******");
		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);
		System.out.println("String: " + identityMap.get(str));
		System.out.println("String 1: " + identityMap.get(str1));

		System.out.println("********* Hash Map *******");
		System.out.println("Size: " + hashMap.size());
		System.out.println("Map: " + hashMap);
		System.out.println("String: " + hashMap.get(str));
		System.out.println("String 1: " + hashMap.get(str1));

		System.out.println("****Replacing 'abc' ******");
		identityMap.put("abc", "videogame");

		System.out.println("Size of IdentityHashMap: " + identityMap.size());
		System.out.println("IdentityHashMap: " + identityMap);

	}
}
