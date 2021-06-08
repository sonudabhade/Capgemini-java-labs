package com.java.labs5;

import java.util.Scanner;

class NameNotValidException extends Exception
{
     public String validname()
     {
          return ("Name is not Valid..Please ReEnter the Name");
     }
}
class BlankNameNotValidException extends Exception
{
     public String blankName()
     {
          return ("Name should not be Blanked");
     }
}
class Employee
{
     
     String firstName, lastName;
     Employee()
     {    firstName=null;
          lastName=null;
     }
     Employee (String n, String c)
     {
          
          lastName=c;
          int l,temp=0;
          l = n.length();
          for(int i=0;i<l;i++)
          {
               char ch;
               ch=n.charAt(i);
               if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                    temp=1;
          }
          /*———-Checking Name——————–*/
          try
          {
               if(temp==1)
                    throw new NameNotValidException();
               else
                    firstName=n;
          }
          catch(NameNotValidException e2)
          {
               System.out.println(e2);
          }
          /*———-Checking Age——————–*/
          
         try {
        	 if(firstName == " " || lastName== " ")
        		 throw new BlankNameNotValidException();
        	 else
        		 System.out.println("first name, Last Name Entered");
        	 
         }
         catch(BlankNameNotValidException e3){
        	 
         }
          
     }
     void display()
     {
          System.out.println(" FirstName LastName");
          System.out.println("---------------------");
          System.out.println(firstName+" "+lastName);
     }
}

public class Lab5Exe2 {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter First name: ");
	        String name = sc.next();
	        System.out.print("\nEnter Last name: ");
	        String name2 = sc.next();
	        
	        Employee s = new Employee(name, name2);
	          s.display();
		}
}
