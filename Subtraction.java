package com.thoughtpearl;

public class Subtraction {

	public static void main(String[] args) 
	{
		int a = 10;
		int b= 5;
		int c = subtract(a,b);
		System.out.println("Difference = " + c);
	}
	public static int subtract(int x , int y)
	{
		int diff;
		diff = x-y;
		return diff;
	}
}
