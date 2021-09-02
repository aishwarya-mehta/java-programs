package com.thoughtpearl;

public class ExampleThrow {

	public static void test(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not eligible to vote!");
		}
		else
		{
			System.out.println("You are eligible to vote!");
		}
	}
	public static void main(String[] args)
	{
		test(13);
		System.out.println("...rest of the program...");
	}

}
