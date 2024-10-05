package com.xyz.basicofprograming.day1_5;



abstract class Plane{
	//overridden methods
	abstract void takeOff();
	//overridden method
	
	abstract void fly();
	
	//inherited methods
	void land() {
		System.out.println("plane landed");
	}
}
class cargoPlane extends Plane{
	@override
	void takeOff(){
		System.out.println("cargo plane took off");
		
	}
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
	void takeOff(){
		System.out.println("Fighter plane took off");
		
	}
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
	void takeOff(){
		System.out.println("Passanger plane took off");
		
	}
	@override
	void fly() {
		System.out.println("Passanger plane is flying at medium height");
	}
	void carryHumans() {
		System.out.println("Passanger Plane is carrying the humans");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class AbstractCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlane cp=new cargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		//Plane pp=new Plane();  we cannot create a object of abstract class directly
		Airport a=new Airport();
		
	
		System.out.println("This is the representation for Cargo Plane");
		a.permit(cp);
		
		cp.carryGoods();
		System.out.println("=============================");
		System.out.println("This is the representation for Passenger  Plane");
		a.permit(pp);
		
		pp.carryHumans();
		System.out.println("=============================");
		System.out.println("This is the representation for Fighter Plane");
		a.permit(fp);
		
		fp.carryWeapons();
		System.out.println("=============================");
	}

}



