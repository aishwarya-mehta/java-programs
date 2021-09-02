package com.thoughtpearl;

public class Calculator {
	int z;
	
	public void addition (int x , int y) {
		z = x+y ;
		System.out.println("The sum of given numbers = " + z);
	}
	
	public void subtraction ( int x , int y) {
		z = x-y;
		System.out.println("The difference between two numbers = " + z);
	}
}
class MyCalculator extends Calculator {	
	public void multiplication (int x , int y) {
		z = x*y ;
		System.out.println("The product of given numbers = " + z);
	}
	
	public static void main(String []args) {
		
		int a = 10 , b = 5;
		MyCalculator c1 = new MyCalculator();
		c1.addition(a, b);
		c1.subtraction(a, b);
		c1.multiplication(a, b);
	}
	
}
