package com.pratice.string;

import java.util.TreeSet;

class Parent{
	static  int integer = 10;
	public final  void m1() {
		
	}
}

class Child extends Parent{
	static int integer =20;
	
}
public class StaticExample {

	public static void main(String[] args) {
		Parent p = new Child();
		int t = Parent.integer;
	System.out.println(Child.integer);
	TreeSet<Integer> set;

	}

}
