package com.xyz.basicofprograming1.beans;

public class Dog {
	String name;
	int age;
	int cost;
	String color;
	public void addData() {
		name="Rocky";
		age=10;
		cost=10000;
		color="black";
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(color);
		
	}

}
