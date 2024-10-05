package com.xyz.basicofprograming.day1_4;
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class PolymorphismCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlane cp=new cargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		System.out.println("This is the representation for cargo plane");
		a.permit(cp);
		cp.carryGoods();
		System.out.println("=================================");
		System.out.println("This is the representation for Passenger  Plane");
		a.permit(pp);
		pp.carryHumans();
		System.out.println("=================================");
		System.out.println("This is the representation for Fighter Plane");
		a.permit(fp);
		fp.carryWeapons();
		System.out.println("=================================");
	}

}




