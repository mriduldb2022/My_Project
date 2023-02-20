package com.Practice;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		//using StringBuffer 
		
//		String s = new String("My name is Mridul");
//		String s2 = new StringBuffer(s).reverse().toString();
//		System.out.println(s2);
		
		
		//using ForLoop
		String str = "My name is Mridul";
		String rev = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	

}
