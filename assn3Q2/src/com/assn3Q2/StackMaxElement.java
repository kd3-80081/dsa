package com.assn3Q2;

public class StackMaxElement {

	public static void main(String[] args) {
		int max=0;
		Stack st=new Stack(5);
		int data1, data2, data3, data4, data5;
		
		data1=23;
		st.push(data1);
		if(max<data1)
			max=data1;
		
		data2=98;
		st.push(data2);
		if(max<data2)
			max=data2;
		
		data3=1000;
		st.push(data3);
		if(max<data3)
			max=data3;
		
		data4=78;
		st.push(data4);
		if(max<data4)
			max=data4;
		
		data5=32;
		st.push(data5);
		if(max<data5)
			max=data5;
		
		System.out.println("Max Element in the stack : " + max);
		
		
		

	}

}
