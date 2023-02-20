package com.Practice;

public class primeNumber {
	
	//How to find prime number.
	//prime number is a number that is divisible by itself or by one 
	
public static boolean isprimenumber(int num) {
		
		if(num<=1) {
			return false;
			
		}for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		
		return true;
		
	}
	public static void main(String[] args) {
	
		
		primeNumber reverse = null;
		reverse.isprimenumber(0);
		System.out.println("2 is prime number "+isprimenumber(2));
		System.out.println("3 is prime number "+isprimenumber(3));
		System.out.println("10 is prime number "+isprimenumber(10));
		System.out.println("17 is prime number "+isprimenumber(17));
		System.out.println("18 is prime number "+isprimenumber(18));
	}

}
