package com.xyz.basicofprograming.day1_3;
class Plane{
	//inherited methods
	void takeOff() {
		System.out.println("plane took off");
		
	}
	//overridden method
	
	void fly() {
		System.out.println("plane is flying");
		
	}
	//inherited methods
	void land() {
		System.out.println("plane landed");
	}
}
class cargoPlane extends Plane{
	@override
	void fly() {
		System.out.println("cargo plane is flying at low height");
	}
	void carryGoods() {
		System.out.println("Cargo Plane is carrying the goods");
	}
}
class FighterPlane extends Plane{
	@override
	void fly() {
		System.out.println("Fighter plane is flying at great height");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane is carrying the weapons");
	}
}

class PassengerPlane extends Plane{
	@override
	void fly() {
		System.out.println("Passanger plane is flying at medium height");
	}
	void carryHumans() {
		System.out.println("Passanger Plane is carrying the humans");
	}
}

public class InheritanceCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlane cp=new cargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		System.out.println("This is the representation for Cargo Plane");
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("=============================");
		System.out.println("This is the representation for Passenger  Plane");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("=============================");
		System.out.println("This is the representation for Fighter Plane");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("=============================");
	}

}
