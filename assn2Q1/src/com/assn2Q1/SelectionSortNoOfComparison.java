package com.assn2Q1;
//Write a selection sort function to sort array and returns no of comparisions.
import java.util.Arrays;

public class SelectionSortNoOfComparison {
	
	public static int selectionSort(int arr[],int N) {
		int count=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return count;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {55, 44,22,66,11,33};
		System.out.println("Number of comparision : "+selectionSort(arr,arr.length));
	}

}
