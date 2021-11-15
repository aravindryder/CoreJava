package com.CoreJava;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]){  
		 
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter any Number: ");
		 int number = s.nextInt();
		 
		 int n=1;  
		 for(int i=1;i<=number;i++){    
		      n=n*i;    
		  }    
		  System.out.println("\nFactorial of "+number+"! is: "+n);    
	}  
}