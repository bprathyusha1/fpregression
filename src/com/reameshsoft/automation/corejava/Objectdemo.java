package com.reameshsoft.automation.corejava;

public class Objectdemo {
	int practhrs;
	String result;
	private void hello() {
		System.out.println(practhrs+" "+result);
	}
public static void main(String[] args) {
	Objectdemo r1 = new Objectdemo();
	r1.practhrs=9;
	r1.result="job";
	r1.hello();
	Objectdemo demo = new Objectdemo();
	demo.hello();
	demo.practhrs=14;
	demo.result= "work";
	
	
}
}
