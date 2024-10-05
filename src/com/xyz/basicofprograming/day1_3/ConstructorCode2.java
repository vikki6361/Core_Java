package com.xyz.basicofprograming.day1_3;
class Tiger1{
	String name;
	String color;
	String country;
	int age;
	public Tiger1() {
		System.out.println("HII from  zero parameterized Constructor");
	}
	public Tiger1(String name) {
		this.name=name;
		System.out.println("HII from Single parameterized Constructor");
	}
	public Tiger1(String name,String color) {
		this.name=name;
		this.color=color;
		System.out.println("HII from Two parameterized Constructor");
	}
	public Tiger1(String name,String color,String country) {
		this.name=name;
		this.color=color;
		this.country=country;
		System.out.println("HII from Three parameterized Constructor");
	}
	public Tiger1(String name,String color,String country,int age) {
		this.name=name;
		this.color=color;
		this.country=country;
		this.age=age;
		System.out.println("HII from four parameterized Constructor");
	}
	
}
public class ConstructorCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger1 t1=new Tiger1();
		Tiger1 t2=new Tiger1("Tiger");
		Tiger1 t3=new Tiger1("Tiger","white");
		Tiger1 t4=new Tiger1("Tiger","white","India");
		Tiger1 t5=new Tiger1("Tiger","white","india",10);
		
	}

}
