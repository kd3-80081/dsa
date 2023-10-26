package com.Main;

import com.emp.Employee;

public class Tester {
	public static int linearSearchName(Employee arr[],Employee key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getName().equals(key.getName())) {
				return i;
			}//if
			
		}//fun
		return -1;
	}
	
	public static int linearSearchID(Employee arr[],Employee key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getEmpId()==key.getEmpId()) {
				return i;
			}//if
			
		}//fun
		return -1;
	}
	
	public static int linearSearchSal(Employee arr[],Employee key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getSalary()==key.getSalary()) {
				return i;
			}//if
			
		}//fun
		return -1;
	}
	public static void main(String[] args) {
		Employee e1= new Employee(1, "Naveen", 1000);
		Employee e2= new Employee(2, "Adnan", 2000);
		Employee e3= new Employee(3, "Prashant", 3000);
		Employee e4= new Employee(4, "Himashu", 4000);
		Employee e5= new Employee(5, "Ujjwal", 5000);
		Employee e6= new Employee(6, "Mahesh", 6000);
		Employee e7= new Employee(7, "Golu", 7000);
		Employee e8= new Employee(8, "Tony", 8000);
		Employee e9= new Employee(8, "rony", 8000);
		
		Employee arr1[]= {e1,e2,e3,e4,e5,e6,e7,e8};
		
		
		if(linearSearchName(arr1, e9)==-1){
			System.out.println("Employee not found by Name");
		}//if
		else {
			System.out.println("Employe found by name"+arr1[linearSearchName(arr1, e9)]);
		}
		if(linearSearchID(arr1, e7)==-1){
			System.out.println("Employee not found by id");
		}//if
		else {
			System.out.println("Employe found by name"+arr1[linearSearchName(arr1, e7)]);
		}
		if(linearSearchSal(arr1, e1)==-1){
			System.out.println("Employee not found by salary");
		}//if
		else {
			System.out.println("Employe found by name"+arr1[linearSearchName(arr1, e1)]);
		}
		
	}

}
