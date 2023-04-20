package com.reameshsoft.automation.corejava;
class conscallstest1{
	public void conscallstest1() {
		System.out.println("conscallstest1");
	}	
}
class conscallstest extends conscallstest1
{
	public conscallstest()
	{
		super();
		System.out.println("conscallstest");
	}
}
public class Conscallsdemo {
	public static void main(String[] args) {
		conscallstest ire = new conscallstest();
	}

}
