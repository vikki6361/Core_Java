			package com.xyz.basicofprograming.day15;
			
			import java.util.Scanner;
			/*12345
			12345
			12345
			12345
			12345*/
			public class patter3 {
			
				public static void main(String[] args) {
					// TODO Auto-generated method stub
			
					Scanner sc=new Scanner(System.in);
				     System.out.println("Enter the size");
				     int n=sc.nextInt();
				     for(int i=1;i<=n;i++) {
				    	 for(int j=1;j<=n;j++) {
				    		 for(int k=1;k<=n;k++) {
				    		 System.out.print( "$");
				    	 }
				    	 System.out.println();
				     }
				}
				}
			}
