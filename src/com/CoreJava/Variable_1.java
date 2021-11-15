package com.CoreJava;

public class Variable_1 {
	static int a = 80;
	static int b = 20;
	static int c = a + b;

	public static void add() {

		System.out.println(c);
	}

	public static void sub() {
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add();
		sub();
	}
}