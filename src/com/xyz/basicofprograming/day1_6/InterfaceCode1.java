package com.xyz.basicofprograming.day1_6;
interface Calculator{
	int x=10;//public static final
	void add();
	void mul();
	static void sub() {
		System.out.println("inside static sub method of the interface");
	}
	default void div() {
		System.out.println("inside default div method of the interface");
	}
	
}
class TestCode1 implements Calculator{

	@Override
	public void add() {
		System.out.println("inside add() of the TestCode1 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("inside mul() of the TestCode1 class");
	}
   
}
class TestCode2 implements Calculator{

	@Override
	public void add() {
		System.out.println("inside add() of the TestCode2 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("inside mul() of the TestCode2 class");
	}
	
}

class TestCode3 implements Calculator{

	@Override
	public void add() {
		System.out.println("inside add() of the TestCode3 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("inside mul() of the TestCode3 class");
	}
	
}


public class InterfaceCode1 {
public static void main(String[] args) {
	//Calculator c=new Calculator();//cannot instantiate the type calculator 
	Calculator c2;//we can create the reference of interface directly
	//creating interface object using anonymous inner type
	Calculator c1=new Calculator() {

		@Override
		public void add() {
			System.out.println("inside the anonymous inner type representation for add");
			
		}
		@Override
		public void mul() {
			// TODO Auto-generated method stub
			System.out.println("inside the anonymous inner type representation for add");
		}
		
	};
	System.out.println(c1);
	
}
}
