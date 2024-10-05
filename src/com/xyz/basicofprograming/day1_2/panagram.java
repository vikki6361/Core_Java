package com.xyz.basicofprograming.day1_2;

import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.toUpperCase();
		int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				int temp=str.charAt(i)-65;
				arr[temp]=1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println("Not a Panagram");
				System.exit(0);
			}
		}
		System.out.println("panagram");
	}

}
