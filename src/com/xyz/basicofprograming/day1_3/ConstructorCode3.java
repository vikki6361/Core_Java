package com.xyz.basicofprograming.day1_3;
//extends object statement will be added by the compiler automatically  if
//Parent is not mentioned explicitly by the user
class Tiger4 extends Object{
	String name;
	String color;
	int age;
	String country;
	//zero parameterized Constructor
	public Tiger4() {
		super();
		System.out.println("HII I'm Vikas");
	}
}
public class ConstructorCode3 {
public static void main(String[] args) {
	Tiger4 t1=Tiger4();
}
}
