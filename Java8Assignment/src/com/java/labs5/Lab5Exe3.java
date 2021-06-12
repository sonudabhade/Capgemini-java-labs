/*:  Create an Exception class named as “EmployeeException”(User defined Exception) 
 * in a package named as “com.cg.eis.exception” and throw an exception if salary 
 * of an employee is below than 3000. Use Exception Handling mechanism to handle 
 * exception properly.
 * 
 */
package com.java.labs5;

import java.util.Scanner;

class EmployeeException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public EmployeeException(String s)
	{  
		super(s);
	}
}
public class Lab5Exe3 {
	void checkSalary(int salary) throws EmployeeException{
		if (salary < 3000) {
			throw new EmployeeException("Exception: Salary of a Employee should be above 3000");
		} else {
			System.out.println("Salary is:" +salary);
		}
	}
	
	public static void main(String[] args) {
		Lab5Exe3 obj = new Lab5Exe3();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Salary of Employe:" +" ");
			int num = sc.nextInt();
			obj.checkSalary(num);
		} catch (EmployeeException ee) {
			//System.out.println("valid Age");
			System.out.println(ee.getMessage());
		}
		
	}
}
