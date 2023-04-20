package com.reameshsoft.automation.corejava;

class outerone{
	public void hello() {
		System.out.println("oc:do hello nsm");
	}
	public static void job() {
		System.out.println("oc:job sm");
	}
	class innerone{
		public void hello1() {
			System.out.println("ic1:hello nsm");
		}	
	}
	static class innertwo{
		public void hello2() {
			System.out.println("ic2:hello2 nsm");
		}
		public static void job1() {
			System.out.println("ic2:job2 sm");
		}	
	}
}
public class Innerclassdemo {
	public static void main(String[] args) {
		
		/*outerone demo = new outerone();
		demo.hello();
		demo.job();*/
		/*outerone.innertwo.job1();
		outerone.innertwo demo1 = new outerone.innertwo();
		demo1.hello2();*/
		outerone demo2 = new outerone();
		outerone.innerone innerone =  demo2.new innerone();
		innerone.hello1();
		
	}

}
