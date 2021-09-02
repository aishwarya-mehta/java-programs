package com.thoughtpearl;

public class StringMethodExample {

	public static void main(String[] args) 
	{
		String s = "Solar System";
		String n = "Earth";
		String t = "    Blank   ";
		System.out.println(s.charAt(4));
		System.out.println(s.compareTo(n));
		System.out.println(s.compareToIgnoreCase(n));
		System.out.println(n.concat(s));
		System.out.println(s.length());
		System.out.println(t.trim());
		
	}

}
