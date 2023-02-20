package com.Practice;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void ConvertArraytoList() {
		int[] salary = { 5000, 6000, 4000, 4500 };
		List<int[]> ls = Arrays.asList(salary);
		System.out.println(ls);
	}

	public static void main(String[] args) {
		ArrayToArrayList.ConvertArraytoList();
	}
}
