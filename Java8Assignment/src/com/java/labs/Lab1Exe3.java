//Program to print nth value in the fibbonacci series

package com.java.labs;

import java.util.*;
class Function
{         
          void nrcf(int a, int b, int c, int n)
          {
                      for(int i=1;i<=n-2;i++)
                      {
                                  c=a+b;
                                  a=b;
                                  b=c;
                      }
                      a=b=1;
                      System.out.println("\n nth value in the series "
                      		+ "using non recursive function is : "+c);
                     
          }
          void  rcf(int a, int b, int c, int n)
          {
                                 
                      if(n-2>0)
                      {
                                  c=a+b;
                                  a=b;
                                  b=c;
                                  rcf(a,b,c,n-1);
                                  return;
                      }
                     
                      System.out.println("\n nth value in the "
                      		+ "series using recursive function is : "+c);
                      }
}
         
public class Lab1Exe3{
	public static void main(String args[]) {
      
                     Function f = new Function();
                      int n, a=1, b=1, c=0;
                      Scanner sc = new Scanner(System.in);
                      System.out.println("\nEnter n value:  ");
                      n=sc.nextInt();
                      f.nrcf(a,b,c,n);
                      f.rcf(a,b,c,n);
                     

          }
}