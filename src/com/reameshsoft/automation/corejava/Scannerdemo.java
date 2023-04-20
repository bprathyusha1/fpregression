package com.reameshsoft.automation.corejava;

import java.util.Scanner;

public class Scannerdemo {
	int practhrs;
	String result;
	public void hello() {
		System.out.println(practhrs+" "+result);
	}
	public static void main(String[] args) {
	Scannerdemo ire = new Scannerdemo();
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter ur daily practice hrs");
	int val1 = scanner.nextInt();
	ire.practhrs=val1;
	System.out.println(val1);
	System.out.println("enter the result");
	String val2 =scanner.next();
	ire.result=val2;
	System.out.println(val2);
		
		
		
		
		
		
		
		//ire.hello();
		
	}

}
