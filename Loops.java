package com.thoughtpearl;

public class Loops 
{

	public static void testcontinue()
	{
		System.out.println("Testing Continue : ");
		for (int i=0; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

	public static void testbreak()
	{
		System.out.println("Testing Break : ");
		for (int j = 0; j<=10; j++)
		{
			if(j==5)
			{
				break;
			}
			System.out.println(j);
		}
	}
	
	public static void testwhile()
	{
		System.out.println("Testing While : ");
		int z = 2; 
		while(z<=20)
		{
			System.out.println(z);
			z=z+2;
		}
	}
	
	public static void testdowhile()
	{
		System.out.println("Testing Do While : ");
		int y = 5;
		do
		{
			System.out.println(y);
			y=y+5;
		}
		while(y<=50);
	}
	
	public static void main(String[] args) 
	{
		testcontinue();
		testbreak();
		testwhile();
		testdowhile();
	}

}
