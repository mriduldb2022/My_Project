package com.Practice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

	//How to find duplicate value from an Array?
	public static void duplicateNumber() {
		int[] duplicate = {6,7,7,8,8,4,2};
		//first Remove the duplicate using 'set' cause 'SET'removes duplicate.
		
		Set<Integer> unique = new HashSet<>();
		
		//then use a loop to find the missing duplicate 
		for(int i=0;i<duplicate.length; i++) {
			//add a condition
			if(unique.add(duplicate[i])==false){
				System.out.println(duplicate[i]);
			}
		}
	}
	public static void main(String[] args) {
		FindDuplicateNumber.duplicateNumber();
	}
}
