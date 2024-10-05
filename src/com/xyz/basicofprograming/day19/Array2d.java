package com.xyz.basicofprograming.day19;

import java.util.Scanner;

public class Array2d {
    static String arr[][][];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	 System.out.println("Enter the number of sch:");
         int sch = sc.nextInt();
         System.out.println("Enter the number of cls:");
         int cls = sc.nextInt();
        System.out.println("Enter the number of mark:");
        int mark = sc.nextInt();

        
		createArray(sch,cls,mark);
        insertArray(sch,cls,mark);
        displayArray(sch,cls,mark);
    }

    private static void createArray(int sch,int cls,int mark){
        
            arr = new String[sch][cls][mark];
        }
    

    private static void insertArray(int sch,int cls,int mark) {
        System.out.println("Collecting the array data");
        
        for (int i = 0; i < sch; i++) {
           
            for (int j = 0; j <cls; j++) {
                
                for (int k = 0; k <mark; k++) {
                    System.out.println("Enter the mark for school" + (i + 1) +"class "+(j+1)+"Mark"+(k+1)+":");
            arr[i][j][k] = sc.next();
            }
        }
    }
    }
    

    private static void displayArray(int sch,int cls,int mark) {
        System.out.println("Displaying the array");
        for (int i = 0; i < sch; i++) {
            System.out.println("Enter the School" + (i + 1) + ":");
            for (int j = 0; j <cls; j++) {
                System.out.println("Enter the cls" + (j + 1) + ":");
                for (int k = 0; k <mark; k++) {
                    System.out.println("Enter the cls" + (k + 1) + ":"+arr[i][j][k]);
            }
        }
    }
}
}