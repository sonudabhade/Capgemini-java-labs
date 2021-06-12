/*Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
 */

package com.java.labs2;
import java.util.Scanner;



public class Lab2Exe1 {
	
	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Please enter elements:");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("Second smallest: " + getSecondSmallest(a, size));

	}
}