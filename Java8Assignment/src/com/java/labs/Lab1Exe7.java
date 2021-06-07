package com.java.labs;
import java.util.Scanner;
public class Lab1Exe7 {
   public static void IncresingNumber(int num) {
	   	    String str = Integer.toString(num);
	    //int[] numbers = new int[str.length()];
	   boolean flag = false;
		
	    for(int i=0; i < (str.length()-1); i++) {
		     if (str.charAt(i) <= str.charAt(i+1)) {
		     	flag = true;
		     } else {
			    flag = false;
			    break;
		     }
	   }	
	   if(flag) {
			  System.out.println("this is incresing number:");
	   } else {
		      System.out.println("this is not an incresing number.");
	   }
   }
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    System.out.println("please enter a number");
	   
	   
	    int num = sc.nextInt();
	    sc.close();

	   Lab1Exe7.IncresingNumber(num);
	    
	    
	    
   }

}
