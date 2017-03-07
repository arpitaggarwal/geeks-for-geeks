package com.test.programs;

public class IsBinary {
	public static void main(String a[]) {
		IsBinary mbc = new IsBinary();
		System.out
				.println("Is 1000111 binary? :" + mbc.isBinaryNumber(1000111));
		System.out.println("Is 10400111 binary? :"
				+ mbc.isBinaryNumber(10400111));
	}

	private Boolean isBinaryNumber(int number) {
		boolean status = true;
		while (true) {
			if (number == 0) {
				status = true;
				break;
			}
			if (number % 10 > 1) {
				status = false;
				break;
			}
			number = number / 10;
		}
		return status;
	}

}
