package com.reameshsoft.automation.corejava;

class constructordemo1
{
	int practhrs;
	String result;
	public constructordemo1(int practhrs,String result) {
		this.practhrs=practhrs;
		this.result=result;
	}
	public void hello() {
		System.out.println(practhrs+"  "+result);
	}


public class Constructordemo1{
	public void main(String[] args) {
		constructordemo1 demo=new constructordemo1(8,"job");
		demo.hello();
	}
	
	
}
}
