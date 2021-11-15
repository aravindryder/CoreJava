package com.CoreJava;

import java.util.Scanner;

public class Switch_Day {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Day Number: ");
		int day = s.nextInt();
		
		switch (day) {
		
		case 1:
			System.out.println("Today is Sunday");
			break;

		case 2:
			System.out.println("Today is Monday");
			break;
		
		case 3:
			System.out.println("Today is Tuesday");
			break;
		
		case 4:
			System.out.println("Today is Wednesday");
			break;
		
		case 5:
			System.out.println("Today is Thusday");
			break;
		
		case 6:
			System.out.println("Today is Friday");
			break;
		
		case 7:
			System.out.println("Today is Saturday");
			break;
		
		default:
			System.out.println("Invalid Number! \nPlease Enter the Valid Day");
			break;
		}
				
	}

}