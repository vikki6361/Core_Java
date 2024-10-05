package com.xyz.basicofprograming.day20;

import java.util.Scanner;
/*class  Student
 * 0        4
 * 1         5
 * 2        3
 *3        2
*/
public class Java2dJagged {
	static String arr[][];
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Enter the number of cls:");
        int cls = sc.nextInt();
       

       
		createArray(cls);
       insertArray();
       displayArray();
   }

   private static void createArray(int cls){
       
           arr = new String[cls][];
           System.out.println("Collecting the student the count ");
           for(int i=0;i<arr.length;i++) {
        	   System.out.println("Enter the student count in the class"+(i+1));
        	   arr[i]= new String[sc.nextInt()];
       }
   
   }
   private static void insertArray() {
       System.out.println("Collecting the array data");
       
       for (int i = 0; i < arr.length; i++) {
    	   System.out.println("inside the  class"+(i+1));
           for (int j = 0; j <arr[i].length; j++) {
                      
              System.out.println("Enter the student count in the class"+(j+1));
           arr[i][j] = sc.next();
           }
       }
   }
   
   

   private static void displayArray() {
       System.out.println("Displaying the array");
       for (int i = 0; i < arr.length; i++) {
           System.out.println("Inside the college count" + (i + 1) + ":");
           for (int j = 0; j <arr[i].length; j++) {
               System.out.println("Enter the cls" + (j + 1) + ":"+arr[i][j]);
               
           }
       }
   }


	}


