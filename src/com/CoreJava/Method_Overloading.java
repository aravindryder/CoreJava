package com.CoreJava;

public class Method_Overloading {
	
	public void welcome() {
		System.out.println("Hello World");
		System.out.println("\nWelcome to Java Program\n");
	}

	public void insert(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	public void verify(String string) {
		System.out.println(string);
	}

}