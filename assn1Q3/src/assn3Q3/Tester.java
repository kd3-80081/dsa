package assn3Q3;

import java.util.Scanner;

public class Tester {

	public static int binarySearchDesc(int arr[],int key) {
		int left=0, right=arr.length, mid;
		
		while(left<=right) {
			mid=(left+right)/2;
			
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid]) {
				right=mid-1;
			}
			else{
				left=mid+1;
			}
		}//while
		return -1;
	}//binaryFun()
	
	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,4,3,2,1};
		System.out.println("Enter the key");
		int key = new Scanner(System.in).nextInt();
		
		
		if(binarySearchDesc(arr, key)==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println(arr[binarySearchDesc(arr, key)]);
			System.out.println("Element index : " + binarySearchDesc(arr, key));
		}
	}

}
