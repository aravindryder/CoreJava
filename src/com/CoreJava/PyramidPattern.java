package com.CoreJava;

public class PyramidPattern {

	public static void main(String[] args) {
		
		int a = 30;
		for (int i = 0; i < a; i++) {
			for (int j = a-i; j > 1 ; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {   
				System.out.print("* ");   
			}
			System.out.println();   
		}
	}
}