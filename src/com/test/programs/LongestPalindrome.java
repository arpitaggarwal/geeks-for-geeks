package com.test.programs;

public class LongestPalindrome {
	static int maxPalinLength = 0;
	static String longestPalindrome = null;

	public static void main(String[] args) {
		String string = "HeeHBanna";
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length() + 1; j++) {
				int length = j - i;
				String temp = string.substring(i, j);
				if (isPalindrome(temp)) {
					if (length > maxPalinLength) {
						maxPalinLength = length;
						longestPalindrome = temp;
					}
				}
			}
		}
		System.out.println("Max length : " + maxPalinLength);
		System.out.println("Palindrome : " + longestPalindrome);
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
