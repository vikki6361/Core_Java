package com.xyz.basicofprograming.day20;

import java.util.Scanner;
/* college class  Student
 * 0       0       2
 *         1       3           
 *         2       4
 *  1      3        2
 *         4        3
 * 
 *        
*/
public class java3dJagged {
	static int arr[][][];
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Enter the number of college:");
        int col = sc.nextInt();
       

       
		createArray(col);
       insertArray();
       displayArray();
   }

   private static void createArray(int col){
       
           arr = new int[col][][];
           System.out.println("Collecting the student the count ");
           for(int i=0;i<arr.length;i++) {
        	   System.out.println("Enter the student count in the class");
        	   int cls=sc.nextInt();
        	   arr[i]= new int[cls][];
           }
           for(int i=0;i<arr.length;i++) {
        	   System.out.println("Enter the student count in the class"+(i+1));
        	   for(int j=0;j<arr[i].length;j++) {
            	   System.out.println("Enter the student count in the class"+(j+1));
            	   int stu=sc.nextInt();
        	   arr[i][j]= new int[stu];
        	   
        	   }
        	   }
       }
   
   
   private static void insertArray() {
       System.out.println("Collecting the array data");
       
       for (int i = 0; i < arr.length; i++) {
    	   System.out.println("inside the  class"+(i+1));
           for (int j = 0; j <arr[i].length; j++) {
                      
              System.out.println("Enter the student count in the class"+(j+1));
              for (int k = 0; k <arr[i][j].length; k++) {
                  
                  System.out.println("Enter the student count in the class"+(j+1));
           arr[i][j][k] = sc.nextInt();
              }
       }
   }
   
   }

   private static void displayArray() {
       System.out.println("Displaying the array");
       for (int i = 0; i < arr.length; i++) {
           System.out.println("Inside the college count" + (i + 1) + ":");
           for (int j = 0; j <arr[i].length; j++) {
               System.out.println("Enter the cls" + (j + 1) );
               for (int k = 0; k <arr[i][j].length; k++) {
                   System.out.println("Enter the cls" + (k + 1)+":"+arr[i][j][k] );
               
           }
       }
   }


   }
}


