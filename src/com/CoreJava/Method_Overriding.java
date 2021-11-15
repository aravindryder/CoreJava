package com.CoreJava;

import java.util.Scanner;

public class Method_Overriding extends Method_Overloading {

	@Override
	public void welcome() {
		super.welcome();
	}

	@Override
	public void insert(int a, int b) {
		super.insert(a, b);
	}

	@Override
	public void verify(String string) {
		super.verify(string);
	}

	public void checks() {
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
			System.out.println("You're an Adult");

		} else if (age < 59) {
			System.out.println("You're a Senior");

		} else if (age < 99) {
			System.out.println("You're a Super Senior");

		} else {
			System.out.println("You're a Monster");
		}
	}

	public static void main(String[] args) {

		Method_Overriding m = new Method_Overriding();
		m.welcome();
		m.insert(10, 5);
		m.verify("\nFinal Step\n");
		m.checks();
	}
}