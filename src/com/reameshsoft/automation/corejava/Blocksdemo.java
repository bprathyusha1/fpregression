package com.reameshsoft.automation.corejava;
class blocktest
{
	static
	{
		System.out.println("sb");
	}
	{
		System.out.println("ic1");
	}
	public blocktest()
	{
		System.out.println("dc");
	}
}
public class Blocksdemo extends blocktest{
	static
	{
		System.out.println("sb2");
	}
	{
		System.out.println("ic2");
	}
	public Blocksdemo()
	{
		System.out.println("dc2");
	}
	public static void main(String[] args) {
		System.out.println("jvm");
		Blocksdemo demo = new Blocksdemo();
		
	}

}
