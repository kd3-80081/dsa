package com.Main;

import com.search.*;

public class Tester {

	public static void main(String[] args) {

		
		int arr1[] = { 55, 11, 44, 22, 66, 33, 99, 44, 100 };
		int key1 = 44;

		if (LinearSearch.linearSearch(arr1, key1) == -1) {
			System.out.println("Number of comparison done in Linear Search : " + arr1.length);
		} else {
			System.out.println(
					"Number of comparison done in Linear Search : " + (LinearSearch.linearSearch(arr1, key1) + 1));
		}
		int arr2[]= {11,22,33,44,55,66,77,88,99};
		int key2=44;
		int comp=BinarySearch.binarySearch(arr2, arr2.length, key2);
		System.out.println("*****************");
		//+ 
		System.out.println("Number of Comparison in Binary Search : "+comp);
	}

}
