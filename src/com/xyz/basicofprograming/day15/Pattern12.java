package com.xyz.basicofprograming.day15;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++) {
	   	 
	   	 for(int j=1;j<=i;j++) {
	   		 System.out.print(j);
	   	 }
	   	 System.out.println();

	}
	}

}
