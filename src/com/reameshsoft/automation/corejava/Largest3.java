package com.reameshsoft.automation.corejava;

public class Largest3 {
	public static void main(String[] args) {
		int n1 = 90,n2 = 900,n3 = 55;
		if(n1 >= n2) {
			if(n1 >= n3)
				System.out.println(n1+"is largest no");
			else
				System.out.println(n3+"is largest no");
		}
		else{
			if(n2 >= n3)
				System.out.println(n2+"is largest no");
			else
				System.out.println(n3+"is largest no");
		}
	}

}
