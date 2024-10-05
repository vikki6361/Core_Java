package com.xyz.basicofprograming.day30;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=sc.next();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("The String is palindrome ");
		}
		else {
			System.out.println("The String is not a palindrome");
		}
		System.out.println("================================");
	//without using equal method compare a string
		int flag=0;
		if(str1.length()== str2.length()) {
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)!=str2.charAt(i)) {
					flag=-1;
				}
			}
			
		}
		if(flag==0) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The String is not palindrome");
		}
	}
	

}
