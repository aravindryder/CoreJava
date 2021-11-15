package com.CoreJava;

import java.util.Scanner;

public class If_Age {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = s.nextInt();

		if (age < 2) {
			System.out.println("You're a Baby");

		} else if (age < 13) {
			System.out.println("You're a Child");

		} else if (age < 19) {
			System.out.println("you're a Youth");
			
		} else if (age < 49) {
			System.out.println("You're a Adult");
		
		} else if (age < 59) {
			System.out.println("You're a Senior");
			
		} else if (age < 99) {
			System.out.println("You're a Super Senior");
		
		} else {
			System.out.println("You're a Monster");
		}
	}
}