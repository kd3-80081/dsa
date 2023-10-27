package com.assn1Q5;

import com.emp.Employee;

public class SortBySalary {

	public static void insertionSort(Employee arr[], int N) {
		for (int i = 1; i < N; i++) {

			Employee temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].getSalary() > temp.getSalary()) {
				arr[j + 1]=arr[j];
				j--;
			}
			arr[j + 1]= temp;
		}
		for (int i = 0; i < N; i++) {
			System.out.println("Salary of employee no. " +(i+1) +" : "  + arr[i].getSalary());
		}
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Naveen", 2000);
		Employee e2 = new Employee(2, "Adnan", 4000);
		Employee e3 = new Employee(3, "Prashant", 5000);
		Employee e4 = new Employee(4, "Himanshu", 4000);
		Employee e5 = new Employee(5, "Ujjwal", 4000);
		Employee e6 = new Employee(6, "Mahesh", 6000);
		Employee e7 = new Employee(7, "Golu", 44000);
		Employee e8 = new Employee(8, "Tony", 85500);
		Employee e9 = new Employee(9, "rony", 86400);

		Employee arr1[] = { e1, e2, e3, e4, e5, e6, e7, e8 };
		insertionSort(arr1, arr1.length);

	}

}
