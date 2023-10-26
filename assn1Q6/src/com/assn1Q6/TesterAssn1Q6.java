package com.assn1Q6;
import java.util.*;
//to find rank of an element in a stream of integers.
//rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
//	
//	Input: { 10, 20, 15, 3, 4, 4, 1 }
//	Ouput: Rank of 4 is: 4
public class TesterAssn1Q6 {

	public static int lessThanEqualToElement(int arr[], int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=key) {
				count++;
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the key to find elements equal to and less than the key");
		int key = new Scanner(System.in).nextInt();
		if(lessThanEqualToElement(arr, key)==-1) {
			System.out.println("Element not present");
		}
		else {System.out.println("count : " + lessThanEqualToElement(arr, key));}
	}

}
