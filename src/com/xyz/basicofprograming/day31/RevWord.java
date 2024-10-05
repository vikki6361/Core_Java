package com.xyz.basicofprograming.day31;

import java.util.Scanner;
class counting{

	public String spCount(String str1) {
		for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i) ==' ') {
				for(int j=str1.length()-1;j>0;j--) {
					System.out.println(str1);
				}
			}
		}
		return str1;
		
	}
	

public class RevWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		counting c =new counting();
		String spCount =c.spCount(str1);

	}

}
