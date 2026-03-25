package basics2026;

import java.util.Scanner;

public class ScannerClass 
{
	//Addition
	
	public static void main(String[] args) {
		
	      Scanner s1 = new Scanner (System.in);
	      
		  System.out.println("enter the value of a");
		  int  a =   s1.nextInt();
		   
		  System.out.println("enter the value of b");
		  int  b =   s1.nextInt();
		  
		  int sum = a+b;
		  System.out.println("Addition of sum:" + sum);
		 
	}

}
