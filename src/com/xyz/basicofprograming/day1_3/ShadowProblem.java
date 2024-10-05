package com.xyz.basicofprograming.day1_3;
//Shadowing
class Dog2{
	private String name;
	private String breed;
	private  String color;
	//Generic Setter
void setData(String name,String breed,String color) {
	name=name;//Compiler cannot access instance variable and local variable and default  value will applied to it
	breed=breed;
	color=color;
}
//Specific setters
void setName(String name) {
	name=name;
}
void setBreed(String breed) {
	breed=breed;
}
void setColor(String color) {
	color=color;
}
//Generic Getter
void getData() {
	System.out.println(name);
	System.out.println(breed);
	System.out.println(color);
}
//Specific getters
String getName() {
	return name;
}
String getBreed() {
	return breed;
}
String getColor() {
	return color;
}
}
public class ShadowProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d1=new Dog2();
		//Generic Setter
		d1.setData("Tommy","Pug","White");
		//generic getter
		d1.getData();
		System.out.println("===========================");
		//Specific Setter
		d1.setName("Rocky");
		d1.setColor("Browm");
		d1.setBreed("pug");
		//specific setter
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		
	}

}
