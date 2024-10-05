package com.xyz.basicofprograming.day1_6;
class Heart{
	int Weight;
	int heart_beat_Count;
	public Heart(int weight, int heart_beat_Count) {
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
class Brain{
	int weight;
	int iq_level;
	public Brain(int weight, int iq_level) {
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
class Bike{
	String name;
	int cost;
	public Bike(String name, int cost) {
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
class Watch{
	String brand;
	int cost;
	public Watch(String brand, int cost) {
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
class Student{
	Heart h=new Heart(100,80);
	Brain b=new Brain(70,100);
	void hasBike(Bike b) {
		System.out.println(b.getCost());
		System.out.println(b.getName());
	}
	void hasWatch(Watch w) {
		System.out.println(w.getBrand());
		System.out.println(w.getCost());
	}
	
}

public class Has_aRelationship {

	public static void main(String[] args) {
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
	s=null;
	System.out.println("Representation without using enclosing object");

	System.out.println("Representing the watch");
	System.out.println(w.getBrand());
	System.out.println(w.getCost());
	System.out.println("Representing the Bike");
	System.out.println(b.getName());
	System.out.println(b.getCost());
	System.out.println(s.h.getHeart_beat_Count());
	System.out.println(s.h.getWeight());
	s.hasBike(b);
	}

}
