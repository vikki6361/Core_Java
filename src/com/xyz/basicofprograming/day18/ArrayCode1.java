package com.xyz.basicofprograming.day18;

import java.util.Scanner;

//Store student name 
public class ArrayCode1 {
	static String arr[];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size");
		int size=sc.nextInt();
		displayArray(size);
		createArray(size);
		insertArray(size);
		
		
	}
	private static void displayArray(int size) {
		// TODO Auto-generated method stub
		System.out.println("Displaying the array");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	private static void insertArray(int size) {
		// TODO Auto-generated method stub
		System.out.println("Collecting the array data");
		for(int i=0;i<size;i++) {
			arr[i]=sc.next();
		}
		
	}
	private static void createArray(int size) {
		// TODO Auto-generated method stub
		arr=new String[size];
		
	}
	
 
}
