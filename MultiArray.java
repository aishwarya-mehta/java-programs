package com.thoughtpearl;

public class MultiArray {

	public static void main(String[] args) 
	{
		int a[][] = {{2,4,6},{3,6,9},{4,8,12}};
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
