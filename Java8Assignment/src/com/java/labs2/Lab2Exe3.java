/*Create a method which accepts an integer array, reverse the numbers in the array and returns 
 * the resulting array in sorted order
 */

package com.java.labs2;
import java.util.Scanner;

public class Lab2Exe3 {
    
	public static void main(String[] args) {
		// Initialize array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Please enter elements:");
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array in reverse order: ");

		for (int i = a.length - 1; i >= 0; i--) { // array in reverse order
			System.out.print(a[i] + " ");
		}
		int temp = 0;
		for (int i = 0; i < a.length; i++) { // Sort array in ascending
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("Elements of array sorted in ascending order: "); // elements of array after sorting
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}