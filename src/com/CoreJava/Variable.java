package com.CoreJava;

public class Variable {

	int a = 10;
	int b = 20;
	int c = a + b;

	public void add() {

		System.out.println("The Addition Value is " + c);
	}

	public void sub() {
		int d = 55;
		int e = 20;
		int f = d - e;
		System.out.println("The subtraction value is " + f);
	}

	public static void main(String[] args) {
		Variable v = new Variable();
		v.add();
		v.sub();
	}
}