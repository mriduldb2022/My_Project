package com.Practice;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNumberFromArray {

	public static void secondHighestSalary() {
		int[]salary = {5000, 6000,4000,4500};
		//first find the length of the array
		int size = salary.length;
		//Then sort the Array
		Arrays.sort(salary);
		//Get the 2nd from the last index with -2
		int secondHighest = salary[size-2];
		System.out.println("Second highest salary is : "+ secondHighest);
		
	}
	
	
		
	public static void main(String[] args) {
		SecondHighestNumberFromArray.secondHighestSalary();
		
	}
}
