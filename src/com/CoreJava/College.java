package com.CoreJava;

public class College {

	public void principal() {
		System.out.println("1. Guide to Staff\n");
	}

	public void staff() {
		System.out.println("2. Guide to Student\n");
	}

	public void student() {
		System.out.println("3. Obey the Principal and Staff\n");
	}

	public static void main(String[] args) {

		College c = new College();
		System.out.println("\t\t Welcome to our College \n\n");
		c.principal();
		c.staff();
		c.student();

	}
}