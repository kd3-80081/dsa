package com.assn2Q3;

public class InsertionSort {

	public static int insertionSort(int arr[], int N) {
		int count = 0;
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				count++;
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 55, 23, 78, 54, 12, 78, 99, 34 };
		System.out.println("Count : "+insertionSort(arr, arr.length));

	}

}
