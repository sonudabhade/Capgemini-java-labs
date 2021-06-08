//:  Validate the age of a person and display proper message by using user defined exception.
//Age of a person should be above 15.
package com.java.labs5;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String s)
	{  
		super(s);
	}
	
}
public class Lab5Exe1 {
	void checkAge(int age) throws InvalidAgeException{
		if (age < 15) {
			throw new InvalidAgeException("Age of a person should be above 15");
		} else {
			System.out.println("Valid Age");
		}
	}
	
	public static void main(String[] args) {
		Lab5Exe1 obj = new Lab5Exe1();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Age");
			int num = sc.nextInt();
			obj.checkAge(num);
		} catch (InvalidAgeException ae) {
			//System.out.println("valid Age");
			System.out.println(ae.getMessage());
		}
		
	}
}
