package com.assn1Q4;
import java.util.*;
public class TesterAssn1Q4 {
	public static int nThOccurence(int arr[], int key) {
		int occurence=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				occurence++;
			}
			
		}
		return occurence;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,3,2,4,1,2,4,2,6,1,2,3,3,1,};
		System.out.println("Enter the key to find the occrence");
		int key = new Scanner(System.in).nextInt();
		if(nThOccurence(arr, key)==0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Occurence : " + nThOccurence(arr, key));
		}
	}

}
