//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

package com.java.labs;
import java.util.Scanner;
public class Lab1Exe5 {




  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" please enter how many natural num");
      int n =sc.nextInt();
      int i = Integer.MAX_VALUE;
      int j,k,sum=0;
      
      for(k=0;k<=n;k++) {
      for(j=1;j<=i;j++) {
          if(j%3==0 || j%5==0) {
              sum=sum+j;
              k++;
              if(k==n) {
                  break;
              }
          }    
      }
      
  }
      System.out.println("sum of first  "+n+"  natural number is  "+sum);

  }

}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//      public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Plz enter an integer -");
//			int num= sc.nextInt();
//			int i=0;
//			int sum=1;
//			while(i <= num)  
//			{  
//			//adding the value of i into sum variable  
//			sum = sum + i;  
//			//increments the value of i by 1  
//			i++;  
//			}  
//			//prints the sum  
//			System.out.println("Sum of Natural Numbers = " + sum);  
//			}  
//			
//			
			
			
//			int i;
//			int sum =0;
//			System.out.println("no is divisible by 3 and 5");
//			for(i =1; i<=num; i++)
//			{
//				if (i%3==0 || i%5==0)
//					sum= sum+i;
//			}
//			System.out.println("Sum is -" +sum);
//			
		
//}
