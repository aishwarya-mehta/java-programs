package com.thoughtpearl;

public class ExceptionExample {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside try block");
			int result = 50/0;
			System.out.println(result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("...rest of code...");


	}

}
