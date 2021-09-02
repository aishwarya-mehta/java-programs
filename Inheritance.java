package com.thoughtpearl;

class SolarSystem
{
	void planets()
	{
		System.out.println("Milky Way Galaxy");
	}
}
class Earth extends SolarSystem
{
	void blueplanet()
	{
		System.out.println("Life");
	}
}
public class Inheritance {

	public static void main(String[] args) 
	{
		Earth e = new Earth();
		e.planets();
		e.blueplanet();
	}

}
