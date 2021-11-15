package com.CoreJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
	
public static void main(String[] args) {
		
		Set <Object> l = new LinkedHashSet <Object> ();
		
		l.add(77);
		l.add(956);
		l.add('R');
		l.add(16);
		l.add(29.56);
		l.add("Java");
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		boolean contains = l.contains("Java");
		System.out.println(contains);
		
		Set <Integer> i = new LinkedHashSet <Integer> ();	
		
		i.add(39);
		i.add(77);
		i.add(66);
		i.add(456);
		
		l.addAll(i);
		System.out.println(l);
		
		l.retainAll(i);
		System.out.println(l);
		
		boolean empty = i.isEmpty();
		System.out.println(empty);
		
		boolean equals = i.equals(39);
		System.out.println(equals);
		
		Object remove = i.remove(2);
		System.out.println(i);
		
		l.removeAll(i);
		System.out.println(l);
		
		i.clear();
		System.out.println(i);
		
		
	}
}