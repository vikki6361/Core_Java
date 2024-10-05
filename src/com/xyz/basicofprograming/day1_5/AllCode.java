package com.xyz.basicofprograming.day1_5;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void display(){
		System.out.println("area"+area);
	}
}
class Circle extends Shapes{
	Circle(){
		
	}
	private int radius;
	private final double pi=3.14768f;
	@override
	void collect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
	      radius=sc.nextInt();
	}
	@override
	void calculate() {
	 area=2*pi*radius*radius;
	}
}
class Square extends Shapes{
	private double side;
	
	@override
	void collect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side");
		 side=sc.nextInt();
	}
	@override
	void calculate() {
	 area=side*side;
	}
}
class Rectangle extends Shapes{
	private double length;
	private double breadth;
	
	@override
	void collect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		 length=sc.nextInt();
		System.out.println("Enter the Breadth");
		 breadth=sc.nextInt();
	}
	@override
	void calculate() {
	 area=length*breadth;
	}
}
class Geometry{
	void useShape(Shapes s) {
		s.collect();
		s.calculate();
		s.display();
	}
}
public class AllCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		Geometry g=new Geometry();
		System.out.println("This is a Circle");
		g.useShape(c);
		System.out.println("This is a Square");
		g.useShape(s);
		System.out.println("This is a Rectangle");
		g.useShape(r);
		

	}

}
