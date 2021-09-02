package com.thoughtpearl;

import java.util.ArrayList;

public class ArrayList3 
{
	public static void main (String[] args)
	{	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sun");
		list.add("Jupiter");
		list.add("Earth");
		list.add("Mars");
		list.add("Venus");
		
		System.out.println("Accessing Element : " + list.get(1));
		
		list.set(1, "Moon");
		
		for(String planets:list)
			System.out.println(planets);
	}
}
