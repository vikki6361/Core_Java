package com.xyz.basicofprograming.day1_4;




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

public class PolymorphismCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlane cp=new cargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Plane ref;
		System.out.println("This is the representation for Cargo Plane");
		ref=cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("=============================");
		System.out.println("This is the representation for Passenger  Plane");
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println("=============================");
		System.out.println("This is the representation for Fighter Plane");
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
		System.out.println("=============================");
	}

}


