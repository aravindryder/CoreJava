package com.CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {
	
public static void main(String[] args) {
		
		List <Object> l = new ArrayList <Object> ();
		
		l.add(77);
		l.add(956);
		l.add('R');
		l.add(16);
		l.add(29.56);
		l.add("Java");
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object obj = l.get(3);
		System.out.println(obj);
		
		Object set = l.set(2, 'C');
		System.out.println(l);
		
		int indexOf = l.indexOf("Java");
		System.out.println(indexOf);
		
		boolean contains = l.contains("Java");
		System.out.println(contains);
		
		Object remove = l.remove(3);
		System.out.println(l);
		
		List <Integer> i = new ArrayList <Integer> ();	
		
		i.add(39);
		i.add(77);
		i.add(66);
		i.add(456);
		
		l.addAll(i);
		System.out.println(l);
		
		l.retainAll(i);
		System.out.println(l);
		
		l.removeAll(i);
		System.out.println(l);
		
		Collections.sort(i);
		System.out.println(i);
		
		Collections.sort(i, Collections.reverseOrder());
		System.out.println(i);
		
		boolean empty = i.isEmpty();
		System.out.println(empty);
		
		boolean equals = i.equals(39);
		System.out.println(equals);
		
		i.clear();
		System.out.println(i);
		
	}
}