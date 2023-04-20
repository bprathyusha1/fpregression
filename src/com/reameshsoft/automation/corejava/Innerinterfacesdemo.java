package com.reameshsoft.automation.corejava;

interface i1
{
	void work1();
	void work2();
	
    interface i2
    {
    	void work1();
	    void work3();
	    void work4();
    }
}
class i1impl implements i1
{
	@Override
	public void work1() {
		System.out.println("i1impl:work1");	
	}
	@Override
	public void work2() {
		System.out.println("i1impl:work2");	
	}
}
class i2impl implements i1.i2{

	@Override
	public void work1() {
		System.out.println("i2impl:work1");	
	}
	@Override
	public void work3() {
		System.out.println("i2impl:work3");	
	}
	@Override
	public void work4() {
		System.out.println("i2impl:work4");	
	}
}
class i1i2impl implements i1,i1.i2{

	@Override
	public void work3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work4() {
		System.out.println("");	
	}
	@Override
	public void work1() {
		System.out.println("");	
	}
	@Override
	public void work2() {
		System.out.println("");	
	}
}
public class Innerinterfacesdemo {

}
