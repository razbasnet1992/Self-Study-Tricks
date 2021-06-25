package com.pratice.string;

public class Palindrome {

	public static void main(String[] args) {
		String string = "nurses run";
		string =string.replaceAll("\\s", "");
		StringBuilder str = new StringBuilder(string);
		String reverse = str.reverse().toString();
		
		if(string.equalsIgnoreCase(reverse)) {
			System.out.println("equal");
		}

	}

}
