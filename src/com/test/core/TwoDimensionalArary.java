package com.test.core;

/**
 * two-dimensional array in Java is nothing but an array of array.
 * two-dimensional array where each subarray has different length or different
 * type, also known as a heterogeneous array in Java.
 * 
 * An array is a data structure which stores elements in the contiguous memory
 * location and allowed constant time access using indexes.
 * 
 * Reference :
 * http://javarevisited.blogspot.in/2016/02/6-example-to-declare-two-
 * dimensional-array-in-java.html
 * 
 */
public class TwoDimensionalArary {

	public static void main(String[] args) {
		// 1.
		int[][] squares = new int[3][2];
		String[][] cubes = new String[4][3];

		// 2. declaring two-dimensional array with just one
		// dimension

		// int[][] numbers = new int[][]; // error - first dimension mandatory
		// int[][] primes = new int[][2]; // error - first dimension mandatory

		int[][] multipliers = new int[10][]; // ok, second dimension is optional
		String[][] names = new String[5][];

		// 3. you can interchange square bracket position
		int[] quotes[] = new int[2][2]; // ok

		// it is also possible to put both square brackets after variable name
		// e.g. in following declaration number is int variable, a is
		// one-dimensional int array and b is a two-dimensional int array.

		int number, a[], b[][];

		// 5. Creating a 2D array where each array is of different length for
		// example, in following code ids contain three one-dimensional int
		// array each of different length i.e. 10, 20 and 30

		int[][] ids = new int[3][];
		ids[0] = new int[10];
		ids[1] = new int[20];
		ids[2] = new int[30];

		// 6. Creating a heterogeneous 2D array in Java. In the heterogeneous
		// array, each subarray is of a different type. e.g. in the following
		// example, items subarray is of Integer, String and Float type.

		Object[][] items = new String[3][];
		items[0] = new Integer[] { 1, 2, 4 };
		items[1] = new String[] { "a", "b" };
		items[2] = new Float[] { 1.0f, 2.0f };

	}

}
