package com.xyz.basicofprograming.day1_3;

class Animals1{
	//inherited methods
	void walk() {
		System.out.println("Animal is walking");
		
	}
	//overridden method
	
	void eat() {
		System.out.println("Animal is eating ");
		
	}
	//inherited methods
	void run() {
		System.out.println("Animal is running");
	}
}
class Elephant extends Animals1{
	@override
	void eat() {
		System.out.println("Elephant is eating");
	}
	
}
class Lions1 extends Animals1{
	@override
	void eat() {
		System.out.println("Lion is eating");
	}
	
}

class Monkey extends Animals1{
	@override
	void eat() {
		System.out.println("Monkey is eating");
	}
	
}

public class InheritanceCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant ee=new Elephant();
		Lions1 ll=new Lions1();
		Monkey mm=new Monkey();
		System.out.println("Elephant");
		ee.walk();
		ee.eat();
		ee.run();
		
		System.out.println("=============================");
		System.out.println("Lion");
		ll.walk();
		ll.eat();
		ll.run();
		
		System.out.println("=============================");
		System.out.println("Monkey");
		mm.walk();
		mm.eat();
		mm.run();
		
		System.out.println("=============================");
	}

}


