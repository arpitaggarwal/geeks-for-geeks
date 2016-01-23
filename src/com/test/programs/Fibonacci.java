package com.test.programs;


public class Fibonacci {

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " , ");
		}
	}

	/** 
	fib(4)
	->  fib(3) + fib(2)
	->  fib(2) + fib(1) + fib(1) + fib(0)
	->  fib(1) + fib(0) + fib(1) + fib(1) + fib(0)
	->  1 + 0 + 1 + 1 + 0
	->  3
	**/
	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void calculateFibonacci() {
		int j = 1;
		int i = 1;
		int k = 0;
		System.out.print(i + ",");
		System.out.print(j + ",");
		while (k < 100) {
			k = i + j;
			System.out.print(k + ",");
			i = j;
			j = k;
		}

	}

}


