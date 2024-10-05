package com.xyz.basicofprograming.day1_3;
//Name 	: null --> Ramu --> Jimmy --> rocky --> tommy --> Julie
//Color	: null --> white --> Black --> brown --> orange
//Country	: null --> Germany --> India
//Age		: 0	  --> 5 --> 2 -- 11
class Lion{
	String name;
	String color;
	int age;
	String country;
	public Lion() {
		this("Tommy");
		this.name="Julie";
		this.color="orange";
		this.country="India";
		this.age=11;
		System.out.println("HII from zero parameterized constructor");
	}
	//single parameterized constructor 
	public Lion(String name) {
		this("rocky","brown");//2 parameterized constructor call
		this.name=name;
		System.out.println("Hi from single parameterized Constructor");
	}
	public Lion(String name,String color) {
		this("jimmy","black",2);//3 parameterized constructor call
		this.name=name;
		this.color=color;
		System.out.println("Hi from two parameterized Constructor");
	}
	//three parameterized constructor 
	public Lion(String name,String color,int age) {
		this("rocky","brown",2,"Germany");//4 parameterized constructor call
		this.name=name;
		this.color=color;
		this.age=age;
		System.out.println("Hi from three parameterized Constructor");
	}
	//four parameterized constructor 
		public Lion(String name,String color,int age,String country) {
			super();//call for parent class constructor
			this.name=name;
			this.color=color;
			this.age=age;
			this.country=country;
			System.out.println("Hi from four parameterized Constructor");
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
public class ConstructorCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l1=new Lion();
		System.out.println(l1.getName());
		System.out.println(l1.getAge());
		System.out.println(l1.getColor());
		System.out.println(l1.getCountry());
	}

}
