package com.pratice.collection;

public class Test {

	static {
		System.out.println("my name is rajendra");
	}
	Test(byte a,int b) {
		System.out.println(a+ b);
	}

	Test(int a, float b) {
		System.out.println(a + b);
	}

	public static void main(String args[]) {
		byte a = 10;
		byte b = 15;
		Test test = new Test(a, b);
	}
}
