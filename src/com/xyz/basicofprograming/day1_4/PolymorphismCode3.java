package com.xyz.basicofprograming.day1_4;


class Animal{
	void walk() {
	System.out.println("Animal Walks");	
	}
	void eat() {
		System.out.println("Animal eats");
	}
	void run() {
		System.out.println("Animal runs ");
	}
}
class Lion extends Animal{
	@override
	void eat() {
		System.out.println("Lion eats Meat");
	}
	
}
class Elephant extends Animal{
	@override
	void eat() {
		System.out.println("Elephant eats Grass");
	}
	
}
class Monkey extends Animal{
	@override
	void eat() {
		System.out.println("Monkey eats Bannana");
	}
	
}
public class PolymorphismCode3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Elephant ee=new Elephant();
		Lion ll=new Lion();
		Monkey mm=new Monkey();
		Animal ref ;
		System.out.println("Elephant");
		ref=ee;
		ref.walk();
		ee.eat();
		ref.run();
		
		System.out.println("=============================");
		System.out.println("Lion");
		ref.walk();
		ll.eat();
		ref.run();
		
		System.out.println("=============================");
		System.out.println("Monkey");
		ref.walk();
		mm.eat();
		ref.run();
		
		System.out.println("=============================");
		
	}

}
