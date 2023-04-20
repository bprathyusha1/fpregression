package com.reameshsoft.automation.corejava;
class consone
{
	public consone()
	{
		System.out.println("default constructor");
	}
	public void dowork() {
		consone beat = new consone();
		System.out.println("work");

	}
}
public class Constructordemo {
	public static void main(String[] args) {
		consone beat = new consone();
	}
}
