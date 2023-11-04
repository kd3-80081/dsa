package com.assn3Q5;

import java.util.Arrays;

public class ReverseArrayWithStack {

	public static void main(String[] args) {
		int arr[]= {23,45,32,12,56,32,12};
		Stack  st= new Stack(arr.length);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=st.pop();
		}
		
		System.out.println(Arrays.toString(arr));


	}

}
