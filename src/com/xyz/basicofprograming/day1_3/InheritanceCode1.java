package com.xyz.basicofprograming.day1_3;
class Animal{
	String name;
	String color;
	int age;
	String country;
	public Animal() {
		super();
		this.name="Tuffy";
		this.color="brown";
		this.age=12;
		this.country="Japan";
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
}
	class Forest extends Animal{
		public Forest(){
		super();
		this.name="Arjuna";
		this.color="black";
		this.age=60;
		this.country="India";
	}
	}

public class InheritanceCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forest e1=new Forest();
		System.out.println(e1.getName());
		System.out.println(e1.getColor());
		System.out.println(e1.getAge());
		System.out.println(e1.getCountry());
		
	}
	
	

}
//Name :null ->Tuffy->Arjuna
//age  :0 ->12->60
//color:null->brown->black
//country: null->Japan->India