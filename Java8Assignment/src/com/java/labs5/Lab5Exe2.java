package com.java.labs5;

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
          /*-Checking Name*/
          try
          {
               if(temp==1)
                    throw new NameNotValidException();
               else
                    name=n;
          }
          catch(NameNotValidException e2)
          {
               System.out.println(e2);
          }
          /*-Checking Age*/
          try
          {
               if(a>=15 && a<=21)
                    age=a;
               else
                    throw new AgeNotWithInRangeException();
          }
          catch(AgeNotWithInRangeException e1)
          {
               System.out.println(e1);
          }
     }
     void display()
     {
          System.out.println("roll Name Age Course");
          System.out.println("---------------------");
          System.out.println(roll+" "+name+" "+age+" " +course);
     }
}
public class Lab5Exe2 {
        public static void main(String[] args) {
			
		}
}
