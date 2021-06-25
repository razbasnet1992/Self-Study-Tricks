package com.pratice.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "lasat";
		String s2 = "atlas";
		char [] c1 = s1.toLowerCase().toCharArray();
		char [] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));
		

	}

}
