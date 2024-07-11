package org.sample;

import java.util.ArrayList;
import java.util.List;

public class SampleClass {
	public static void main(String[] args) {
		System.out.println("Hello World");
		// Reverse of String
		// String s ="java" output --> avaj
		String s = "java";
		String output = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			output = output + c;
		}
		System.out.println("Reverse of String :" + output);

		// Creation of List
		List<String> li = new ArrayList<>();
		// Adding value to list
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");

		// Printing value of li
		System.out.println(li);

		// Iterating list
		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println(string);
		}

	}
}
