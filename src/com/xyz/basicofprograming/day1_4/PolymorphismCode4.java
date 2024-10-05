package com.xyz.basicofprograming.day1_4;
class Forest{
	void hasAnimal(Animal ref) {
		ref.walk();
		ref.eat();
		ref.run();
		
	}
}

public class PolymorphismCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant ee=new Elephant();
		Lion ll=new Lion();
		Monkey mm=new Monkey();
		Forest f=new Forest();
		System.out.println("Detailing the Lion Object");
		f.hasAnimal(ll);
		System.out.println("==================");
		
		System.out.println("Detailing the ELephant Object");
		f.hasAnimal(ee);
		System.out.println("==================");
		
		System.out.println("Detailing the Monkey Object");
		f.hasAnimal(mm);
		System.out.println("==================");
		
	}

}
