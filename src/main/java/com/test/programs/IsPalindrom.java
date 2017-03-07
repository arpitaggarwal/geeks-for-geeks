package com.test.programs;

public class IsPalindrom {

	public static void main(String args[]) {
		System.out.print(istPalindrom("andna".toCharArray()));
	}

	/**
	 * Input is "andna". i1 will be 0 and i2 will be 4.
	 * 
	 * First loop iteration we will compare word[0] and word[4]. They're equal,
	 * so we increment i1 (it's now 1) and decrement i2 (it's now 3). So we then
	 * compare the n's. They're equal, so we increment i1 (it's now 2) and
	 * decrement i2 (it's 2). Now i1 and i2 are equal (they're both 2), so the
	 * condition for the while loop is no longer true so the loop terminates and
	 * we return true.
	 */
	public static boolean istPalindrom(char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
}
