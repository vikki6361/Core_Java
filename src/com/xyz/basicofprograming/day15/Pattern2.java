package com.xyz.basicofprograming.day15;

import java.util.Scanner;
/*11111
22222
33333
44444
55555*/

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size");
	     int n=sc.nextInt();
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=n;j++) {
	    		 System.out.print( i);
	    	 }
	    	 System.out.println();
	     }
	     

	}

}
