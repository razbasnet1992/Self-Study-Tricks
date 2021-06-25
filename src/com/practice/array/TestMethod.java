package com.practice.array;

public class TestMethod {
	public static void main(String [] args) {
		new Main().m1();
		//new Main2().m1();
		Boolean is = Boolean.parseBoolean("TRUE");
		System.out.println(is);
	}
	
}	
	
class Main {
	public void m1() {
		System.out.println(new Main2().m2());
		System.out.println("m1 method");
	}

}
class Main2 {
	public Error m2() {
		return new Error();
	}
}


