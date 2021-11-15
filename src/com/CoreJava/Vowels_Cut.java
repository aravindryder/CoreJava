package com.CoreJava;

import java.util.Scanner;

public class Vowels_Cut {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Anything in String: ");
		String str = s.nextLine();
		
		str = str.replaceAll("[AaEeIiOoUu]", "");
		System.out.println("\n" +str);
	}
}