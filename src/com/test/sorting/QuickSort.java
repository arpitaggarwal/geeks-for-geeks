package com.test.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 12, 5, 26, 7, 14, 3, 7, 2 };
		int[] arr = quickSort(array, 0, array.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}

	static int[] quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
		return arr;
	}

	static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

}
