package com.reameshsoft.automation.corejava;
class constwo
{
	int id=23422;
	String result="job";
	public void work() {
		System.out.println(id+" "+result);
	}
}
class cons3 extends constwo
{
    int id=234;
    String result="job";
	public void hello() {
		int id=456456;
		String result="work";
		System.out.println(id+" "+result);
		System.out.println(this.id+" "+this.result);
		System.out.println(super.id+" "+super.result);
		super.work();
	}
}
public class Consdemo {
	public static void main(String[] args) {
		cons3 demo = new cons3();
		demo.hello();
		
	}

}
