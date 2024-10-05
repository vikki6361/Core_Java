package com.xyz.basicofprograming.day15;

import java.util.Scanner;


public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size");
	     int n=sc.nextInt();
	     
	     for(int i=1;i<=n;i++) {
	    	 
	    	 for(int j=1;j<=n;j++) {
	    		if(i%2==0) {
	    			System.out.print("0");
	    		}
	    		else {
	    			System.out.print("1");
	    		}
	    		
	    	 }
	    	 System.out.println();
	     }

	}

}
