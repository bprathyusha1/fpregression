package com.reameshsoft.automation.corejava;

public class Patterndemo {
	public static void main(String[] args) {
		int rows = 5;
		for(int i=rows;i>=1;--i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.println("*");
			}
			System.out.println("");
		}
	}

}