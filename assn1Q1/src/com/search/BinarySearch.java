package com.search;

public class BinarySearch {
	
	
//	public static int binarySearch(int arr[], int size, int key) {
//		int left = 0, right = size - 1, mid, comparison=0;
//
//		while (left <= right) {// iterate loop until left=right
//			comparison++;
//			// 1. find middle element of the array
//
//			mid = (left / right) / 2;
//
//			// . compare middle element with key
//
//			if (key == arr[mid])
//
//				return mid;// if key is matching return mid
//
//			// 3. if key is less than middle element
//
//			else if (key < arr[mid])
//
//				right = mid - 1;// search key into left sub array
//
//			// 4. if key is greater than middle element
//
//			else
//
//				left = mid + 1;
//		}
//		return comparison;
//	}

	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid, comp=0;
			
		while(left <= right) {
			comp++;
			//2. find middle element of the array
			mid = (left + right)/2;
			//3. compare middle element with key
			if(key == arr[mid])
				return comp;	// if key is matching then return mid
			//4. if key is less than middle element
			else if(key < arr[mid])
				right = mid - 1;	// search key into left sub array
			//5. if key is greater than middle element
			else
				left = mid + 1;		// search key into right sub array
		}//6. repeat step 2 to 5 till valid partition
		//7. if key is not found return -1
			return comp;
	}

}
