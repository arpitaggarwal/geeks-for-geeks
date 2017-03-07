package com.test.programs;

public class BinaryToDecimal {

	public static void main(String a[]) {
		BinaryToDecimal bd = new BinaryToDecimal();
		System.out.println("11 ===> " + bd.getDecimalFromBinary(11));
		System.out.println("110 ===> " + bd.getDecimalFromBinary(110));
		System.out.println("100110 ===> " + bd.getDecimalFromBinary(100110));
	}

	private Integer getDecimalFromBinary(int number) {
		int decimal = 0;
		int power = 0;
		while (true) {
			if (number == 0) {
				break;
			} else {
				int remainder = number % 2;
				decimal += remainder * Math.pow(2, power);
				number = number / 10;
				power++;
			}
		}

		return decimal;
	}

}
