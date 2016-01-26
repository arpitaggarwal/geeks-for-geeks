package com.test.programs;

public class DecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary decimalToBinary = new DecimalToBinary();
		System.out.println("23 ===> " + decimalToBinary.decimalToBinary(23));
	}

	private String decimalToBinary(int number) {
		StringBuffer sb = new StringBuffer();
		while (true) {
			if (number == 0) {
				break;
			} else {
				sb.append(number % 2);
				number = number / 2;
			}
		}
		return sb.reverse().toString();
	}
}
