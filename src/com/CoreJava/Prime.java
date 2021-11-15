package com.CoreJava;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		    Scanner s = new Scanner(System.in);
		    System.out.print("Enter any Integer: ");
		    int num = s.nextInt();
		   
		    for (int i = 2; i <= num / 2; i++) {
		      
		    	if (num % i == 0) {

		    		System.out.println(num + " is not a prime number.");
		    		break;
		    	}else {
		    	
		    		System.out.println(num + " is a prime number.");
		    		break;
		    	}
		    }
	}
}