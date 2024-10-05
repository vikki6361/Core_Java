package com.xyz.basicofprograming.day28;

public class Strings1 {

	public static void main(String[] args) {
		String s1=new String("Hii");
		String s2=new String("Hii");
		if(s1.equals(s2)==true) {
			System.out.println("String are equals");
		}
		else {
			System.out.println("String are not equals");
		}
		System.out.println("=======================");
		if(s1==s2) {
			System.out.println("String address are equal");
		}
		else {
			System.out.println("String address are not equal");
		}
	}
	

}
