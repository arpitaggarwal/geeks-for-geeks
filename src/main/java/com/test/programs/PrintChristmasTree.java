package com.test.programs;

public class PrintChristmasTree {

	public static void main(String[] args) {
		int level = 4;
		if (level == 1) {
			System.out.println("*");
		} else {
			for (int i = 0; i < level; i++) {
				for (int j = 0; j < level - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
