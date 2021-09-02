package com.thoughtpearl;

public class Result {

	public static void main(String[] args) 
	{
		int marks = 80;
		getResult(marks);
	}
	public static void getResult(int n)
	{
		if(n>=90)
			System.out.println("Grade = A");
		else if(n>=80 && n<90)
				System.out.println("Grade = B");
		else if(n>=70 && n<80)
			System.out.println("Grade = C");
		else if(n>=60 && n<70)
			System.out.println("Grade = D");
		else if(n>=50 && n<60)
			System.out.println("Grade = E");
		else if(n<50)
			System.out.println("Grade = F");
	}

}
