package com.xyz.basicofprograming.day1_6;


class A{
	
	void takeOff() {
		System.out.println("plane took off");
		
	}
}
class B extends A{
	
}
public class InterfaceCode2 {
	public static void main(String[] args) {
		A c=new B();//downcasting
		B b1 = new B();
		A a = b1;
		
	}
}
