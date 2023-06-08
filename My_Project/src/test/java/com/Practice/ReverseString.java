package com.Practice;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		//using StringBuffer 
		
//		String s = new String("My name is Mridul");
//		System.out.println(s);
//		String s2 = new StringBuffer(s).reverse().toString();
//		System.out.println(s2);
		
		// practice:
		String g = new String("God");
		System.out.println(g);
		String g2 = new StringBuffer(g).reverse().toString();
		System.out.println(g2);
		
		
		
		
		//using ForLoop
		
//		String str = "My name is Mridul";
//		String rev = "";
//		
//		for (int i=str.length()-1; i>=0; i--) {
//			rev = rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		
		String r = "fool";
		String revR = "";
		for(int i=r.length()-1; i>=0; i--) {
			revR = revR+r.charAt(i);
		}
		System.out.println(revR);
	}
	
		
		
	
	}

