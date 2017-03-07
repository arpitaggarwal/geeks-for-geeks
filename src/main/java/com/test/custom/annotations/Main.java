package com.test.custom.annotations;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Retry(retryCount = 4, value = Main.class)
	public void test() {

	}

}
