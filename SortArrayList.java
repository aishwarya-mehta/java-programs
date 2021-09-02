package com.thoughtpearl;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list  = new ArrayList<Integer>();
		list.add(69);
		list.add(85);
		list.add(12);
		list.add(98);
		list.add(10);
		
		Collections.sort(list);
		
		for(Integer number:list)
			System.out.println(number);

	}

}
