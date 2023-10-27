package com.assn2Q4;

import java.util.Arrays;

public class DescOrderInsertionSort {

	public static void descOrderInsertionSort(int arr[], int N) {
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {//descending order "arr[j] <temp"
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 12, 23, 43, 23, 56, 32, 11, 77, 88 };
		descOrderInsertionSort(arr, arr.length);

	}

}
