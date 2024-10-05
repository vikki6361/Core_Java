package com.xyz.basicofprograming.day1_3;
class Animal{
	Animal()
	{
		
	}
	Animal(String name){
		
	}
	
}
class Lion1 extends Animal
{
	public Lion1() {
		super();
	}
	public Lion1(String name) {
		super(name);
	}
	
	//public Lion1(String name,String country) {
	//	super(name,country)
	//}
	
}
public class ConstructorCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion1 L1=new Lion1();
	}

}
