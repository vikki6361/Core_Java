package com.xyz.basicofprograming.day15;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size");
	     int n=sc.nextInt();
          for(int i=1;i<=n;i++) {
	    	 
	    	 for(int j=i;j<=n;j++) {
	    		 System.out.print("$");
	    	 }
	    	 System.out.println();

	}

	}
}
