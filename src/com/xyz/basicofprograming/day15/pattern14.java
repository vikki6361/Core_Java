package com.xyz.basicofprograming.day15;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++) {
	   		  System.out.print(" $ ");
	      	 }
	    	 System.out.println();
	    }
     
	    for(int i=1;i<=n;i++) {
	    	 for(int j=n-1;j>=i;j--) {
	   		 System.out.print(" $ ");
	      	 }
	    	 System.out.println();
	    }  

	}

}
