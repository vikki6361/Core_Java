package com.xyz.basicofprograming.day1_3;
class Dog{
	private String name;
	private String breed;
	private  String color;
	void setData() {
		name="Goody";
		breed="gr";
		color="black";
	}
	void getData() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(color);
	}
}

public class EncapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.setData();
		d1.getData();

	}

}
