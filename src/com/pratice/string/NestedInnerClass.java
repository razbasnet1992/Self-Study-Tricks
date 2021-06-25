package com.pratice.string;

import com.pratice.string.Outer.Inner;

class Outer{
	String name = "Rajendra";
	public void m2() {
		System.out.println("inside outer class");
	}
	static class Inner{
		public void m1() {
			System.out.println("inside inner class");
			//System.out.println(name);
		}
	}
}
public class NestedInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer.Inner();
		
		outer.m2();
		Inner obj = new Inner();
		//obj.
	   

	}

}
