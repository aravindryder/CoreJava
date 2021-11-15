package com.CoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCode {

	public static void main(String[] args) {
		
		String s = "for the people by the people of the people";
		
		String[] split = s.split(" ");
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		
		for (String str : split) {
		
			if (m.containsKey(str)) {
				
				Integer i = (Integer) m.get(str);
				m.put(str, i+1);
				
			} else {
				m.put(str, 1);
			}
		}
		
		System.out.println(s + "\n\n" + m + "\n");

		Set<Entry<Object, Object>> entry = m.entrySet();
	
		for (Entry<Object, Object> e : entry) {
			System.out.println(e);
			}
	}
}