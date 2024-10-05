package com.xyz.basicofprograming.day28;

public class Strings2 {
	public static void main(String[] args) {
		//literal based example
		String s1=("Hii");
		String s2=("Hii");
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
