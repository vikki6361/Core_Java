package com.xyz.basicofprograming.day15;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n=sc.nextInt();
	    for(int k=1;k<=n;k++) {
	    	 for(int q=n;q>=k;q--) {
	   		 
	   		 System.out.print(" $ ");
	      	 }
	    	 System.out.println();
	    }
     
	    for(int i=2;i<=n;i++) {
	    	 for(int j=1;j<=i;j++) {
	   		 
	   		 System.out.print(" $ ");
	      	 }

	
	    	 System.out.println();
	    }

	}
	}


