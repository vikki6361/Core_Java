package com.xyz.basicofprograming.day26;

import java.util.Scanner;
class BubbleSortAlgo {
private int arr[];
Scanner sc=new Scanner(System.in);
private int size;

void createArray() {
	System.out.println("Array Creation :");
	System.out.println("Enter the array size: ");
	size=sc.nextInt();
	arr=new int[size];
	System.out.println("Array is ready");
	System.out.println("========================");
	
}
void addElemnts() {
	System.out.println("Collecting array Element ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Element added");
	System.out.println("=========================");
}
void sort() {
	System.out.println("Element to be sorted");
	int temp=0;
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
System.out.println("Elemnts Are Sorted");
System.out.println("======================");

}
void display() {
	for(int i=0;i<size;i++) {
	System.out.println(arr[i]);
}

}
}
public class BubbleSort{
	public static void main(String[] args) {
		BubbleSortAlgo bs=new BubbleSortAlgo();
		bs.createArray();
		bs.addElemnts();
		bs.sort();
		bs.display();
	}
}
