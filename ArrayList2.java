package com.thoughtpearl;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sun");
		list.add("Moon");
		list.add("Earth");
		list.add("Mars");
		list.add("Venus");
		
		for(String planets:list)
			System.out.println(planets);

	}

}
