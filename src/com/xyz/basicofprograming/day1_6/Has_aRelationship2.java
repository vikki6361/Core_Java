package com.xyz.basicofprograming.day1_6;
class Heart1{
	int Weight;
	int heart_beat_Count;
	public Heart1(int weight, int heart_beat_Count) {
		super();
		Weight = weight;
		this.heart_beat_Count = heart_beat_Count;
	}
	public int getWeight() {
		return Weight;
	}
	public int getHeart_beat_Count() {
		return heart_beat_Count;
	}
	
}
class Brain1{
	int weight;
	int iq_level;
	public Brain1(int weight, int iq_level) {
		super();
		this.weight = weight;
		this.iq_level = iq_level;
	}
	public int getWeight() {
		return weight;
	}
	public int getIq_level() {
		return iq_level;
	}
	
}
class Human{
	Heart h=new Heart(100,80);
	Brain b=new Brain(70,100);
	
}

class Bike1{
	String name;
	int cost;
	public Bike1(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
}
class Watch1{
	String brand;
	int cost;
	public Watch1(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public int getCost() {
		return cost;
	}
	
	
}
class Student1 extends Human{
	void hasBike(Bike b) {
		System.out.println(b.getCost());
		System.out.println(b.getName());
	}
	void hasWatch(Watch w) {
		System.out.println(w.getBrand());
		System.out.println(w.getCost());
	}
}
public class Has_aRelationship2 {

	public static void main(String[] args) {
		Human h1=new Human();
		Student s=new Student();
		Bike b=new Bike("hero",20000);
		Watch w=new Watch("FastTrack",5000);
		System.out.println("Representation using enclosing object");
		System.out.println(s.h.getHeart_beat_Count());
		System.out.println(s.h.getWeight());
		System.out.println(s.b.getIq_level());
		System.out.println(s.b.getWeight());
		s.hasBike(b);
		s.hasWatch(w);
		System.out.println("=======================");
		
	}

}
