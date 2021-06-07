package com.java.labs;
import java.util.Scanner;
public class Lab1Exe8 {
	static boolean checkNumber(int n) {
		while(n % 2==0)
	     {
	          n=n/2;
	     }
	    if(n==1)
	     {
	       return true;  //"It is a Power of a two number";
	     }
	    else
	     {
	    	return false;//System.out.println("It is not Power of a two number");
	     }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
        if (checkNumber(n))
            System.out.println("Number is power of two");
        else
            System.out.println("Number is not power of two");
     }
}

