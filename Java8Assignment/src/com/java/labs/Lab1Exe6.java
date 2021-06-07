package com.java.labs;
import java.util.Scanner;
public class Lab1Exe6 {


	public static int difference(int n){
	      /*sum of squares of n natural number*/
	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
	    
	      /*sum of n natural numbers*/
	      //6
	      int sumN = (n * (n + 1)) / 2;
	      
	      /*square of sum of n natural numbers*/
	      int squareSumN = sumN * sumN;
	      
	      //difference
	      //36-14 =22
	      return Math.abs(sumSquareN - squareSumN);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plz enter an integer -");
		int num= sc.nextInt();
		System.out.println("Number: " + num);
	    System.out.println("Difference: " + difference(num));
		//System.out.println("Sum of n natural numbers is:" +summation(num));		
       }
}















