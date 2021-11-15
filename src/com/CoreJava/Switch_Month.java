package com.CoreJava;

import java.util.Scanner;

public class Switch_Month {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Month Number: ");
		int month = s.nextInt();

		switch (month) {

		case 1:
			System.out.println("This Month is January");
			System.out.println("Also Known as Winter Season in India");
			break;

		case 2:
			System.out.println("This Month is February");
			System.out.println("Also Known as Spring Season in India");
			break;

		case 3:
			System.out.println("This Month is March");
			System.out.println("Also Known as Spring Season in India");
			break;

		case 4:
			System.out.println("This Month is April");
			System.out.println("Also Known as Summer Season in India");
			break;

		case 5:
			System.out.println("This Month is May");
			System.out.println("Also Known as Summer Season in India");
			break;

		case 6:
			System.out.println("This Month is June");
			System.out.println("Also Known as Summer Season in India");
			break;

		case 7:
			System.out.println("This Month is July");
			System.out.println("Also Known as Monsoon Season in India");
			break;

		case 8:
			System.out.println("This Month is August");
			System.out.println("Also Known as Monsoon Season in India");
			break;

		case 9:
			System.out.println("This Month is September");
			System.out.println("Also Known as Monsoon Season in India");
			break;

		case 10:
			System.out.println("This Month is October");
			System.out.println("Also Known as Autumn Season in India");
			break;

		case 11:
			System.out.println("This Month is November");
			System.out.println("Also Known as Autumn Season in India");
			break;

		case 12:
			System.out.println("This Month is December");
			System.out.println("Also Known as Winter Season in India");
			break;

		default:
			System.out.println("Invalid Month Number!");
			System.out.println("Next Time, Please Enter the Correct Month Number");
			break;
		}
	}
}