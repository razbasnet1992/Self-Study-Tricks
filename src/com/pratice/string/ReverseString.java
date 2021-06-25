package com.pratice.string;

public class ReverseString {

	public static void main(String[] args) {
		String string = "Pakuwal";
		//System.out.println(string.substring(2));
		System.out.println(reverseString(string));
		//System.out.println("a"+"b");

	}
	public static String reverseString(String string) {
		if(string.isEmpty()) {
			return string;
		}
		else {
			System.out.println(string.substring(1));
			return string.charAt(0)+reverseString(string.substring(1));
					
			//akuwal+P
			//kuwal+aP
			//uwal+kaP
			
	}
	}

}
