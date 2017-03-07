package com.test.programs;

public class StringTest {

	public static void main(String[] args) {
		StringTest test = new StringTest();
		String t = "niece";
		String s = "nice";
		System.out.println(test.solution(s, t));
	}

	public String solution(String S, String T) {
		if (S != null && T != null) {
			if (S.equals(T))
				return "NOTHING";
			int i;
			for (i = 0; i < S.length() && i < T.length(); ++i) {
				if (S.charAt(i) != T.charAt(i)) {
					if (T.length() == S.length()
							&& T.charAt(i) == S.charAt(i + 1)
							&& T.charAt(i + 1) == S.charAt(i)) {
						return "SWAP " + T.charAt(i + 1) + " " + T.charAt(i);
					}
					return "INSERT " + T.charAt(i);
				}
			}
		}
		return "IMPOSSIBLE";
	}
}
