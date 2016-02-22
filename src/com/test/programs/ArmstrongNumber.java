package com.test.programs;

import java.util.ArrayList;
import java.util.Collection;

public class ArmstrongNumber {
	public static void main(String a[]) {
		ArmstrongNumber man = new ArmstrongNumber();
		System.out.println("Is 371 Armstrong number? "
				+ man.isArmstrongNumber(371));
		System.out.println("Is 523 Armstrong number? "
				+ man.isArmstrongNumber(523));
	}

	/**
	 * A number is armstrong if the sum of cubes of individual digits of a
	 * number is equal to the number itself. For example 371 is an armstrong
	 * number as 3^3 + 7^3 + 1^3 = 371
	 * 
	 * @param number
	 * @return
	 */
	private Boolean isArmstrongNumber(Integer number) {
		char[] temp = String.valueOf(number).toCharArray();
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			Character character = temp[i];
			sum += cube(Integer.parseInt(character.toString()));
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	public static int cube(int n) {
		return (n * n * n);
	}

}
