package com.assn2Q2;

import java.util.Arrays;

public class BubbleSortNoOfComparison {

	public static int bubbleSort(int arr[], int N) {
		int count = 0;
		int flag;
		for (int i = 1; i < N; i++) {
			
			flag=0;
			
			for (int j = 0; j < N - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}

			if (flag == 0) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		return count;
		////////////////////////////////////////////////////////////////
//		int count = 0;
//		int passes = 0;
//		int flag;
//		//1. count number of passes
//		for(int i = 1 ; i < N ; i++) {
//			passes++;
//			flag = 0;
//			//2. compare two consecutive elements
//			for(int j = 0 ; j < N - i ; j++) {
//				count++;
//				//3. if left element is greater than right element then swap
//				if(arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = 1;
//				}
//			}
//			if(flag == 0)
//				break;
//		}
//		System.out.println("No of comparisions : " + count);
//		System.out.println("No of passes : " + passes);
//		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 22, 45, 23, 12,45,87 };
		System.out.println("Count : " + bubbleSort(arr, arr.length));
	}

}
