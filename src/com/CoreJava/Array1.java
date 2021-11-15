package com.CoreJava;

public class Array1 {
	
	public static void main(String[] args) {

		int a[] = new int[10];
		int b[] = { 15, 798, 8956, 126, 16, 852, 49, 169, 79, 56, 100, 16 };
		
		System.out.println(a.length+ "\n");
		
		for (int i : b) {
			System.out.println(i);
		}
	}
}