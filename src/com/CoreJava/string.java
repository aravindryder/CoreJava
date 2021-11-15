package com.CoreJava;

public class string {

	public static void main(String[] args) {
		
		String s = "Welcome to JAVA";
		String s1 = "  java Programs  ";
		
		int length = s.length();
		System.out.println(length);
		
		int length1 = s1.length();
		System.out.println(length1);
		
		boolean equals = s.equals("welcome to java");
		System.out.println(equals);
		
		boolean equals1 = s1.equals("  java Programs  ");
		System.out.println(equals1);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to java");
		System.out.println(equalsIgnoreCase);
		
		boolean equalsIgnoreCase1 = s1.equalsIgnoreCase("  JAVA Programs  ");
		System.out.println(equalsIgnoreCase1);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String upperCase1 = s1.toUpperCase();
		System.out.println(upperCase1);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String lowerCase1 = s1.toLowerCase();
		System.out.println(lowerCase1);
		
		boolean startsWith = s.startsWith("W");
		System.out.println(startsWith);
		
		boolean startsWith1 = s1.startsWith("W");
		System.out.println(startsWith1);
		
		boolean endsWith = s.endsWith("s");
		System.out.println(endsWith);
		
		boolean endsWith1 = s1.endsWith(" ");
		System.out.println(endsWith1);
		
		boolean contains = s.contains("come");
		System.out.println(contains);
		
		boolean contains1 = s1.contains("Java");
		System.out.println(contains1);
		
		int indexOf = s.indexOf('o');
		System.out.println(indexOf);
		
		int indexOf1 = s1.indexOf('r');
		System.out.println(indexOf1);
		
		int lastIndexOf = s.lastIndexOf('o');
		System.out.println(lastIndexOf);
		
		int lastIndexOf1 = s1.lastIndexOf('r');
		System.out.println(lastIndexOf1);
		
		char charAt = s.charAt(5);
		System.out.println(charAt);
		
		char charAt1 = s1.charAt(12);
		System.out.println(charAt1);
		
		String replace = s.replace("JAVA", "Java");
		System.out.println(replace);
		
		String replace1 = s1.replace("java", "JAVA");
		System.out.println(replace1);
		
		String substring = s.substring(8);
		System.out.println(substring);
		
		String substring1 = s1.substring(6);
		System.out.println(substring1);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean empty1 = s1.isEmpty();
		System.out.println(empty1);
		
		String[] split = s.split(" ");
		for (String a : split) {
			System.out.println(a);
		}
		
		String[] split1 = s1.split("  ");
		for (String a1 : split1) {
			System.out.println(a1);
		}
		
		String trim = s.trim();
		System.out.println(trim);
		
		String trim1 = s1.trim();
		System.out.println(trim1);
		
		String concat = s.concat(s1);
		System.out.println(concat);
	}
}