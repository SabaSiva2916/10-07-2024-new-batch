package org.sample;

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

	}
}
