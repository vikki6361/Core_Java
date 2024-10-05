package com.xyz.basicofprograming.day15;

import java.util.Scanner;
/*1  6  11  16  21  
2  7  12  17  22  
3  8  13  18  23  
4  9  14  19  24  
5  10  15  20  25 */
`	`
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size");
	     int n=sc.nextInt();
	     int count;
	     for(int i=1;i<=n;i++) {
	    	 count=i;
	    	 for(int j=1;j<=n;j++) {
	    		 System.out.print(count+"  ");
	    		count = count+5;
	    	 }
	    	 System.out.println();
	     }


	}

}
