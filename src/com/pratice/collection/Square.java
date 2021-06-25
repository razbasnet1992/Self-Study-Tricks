package com.pratice.collection;

public class Square{
	

	public static void main(String[] args) {
		
		Shape shape = new Shape(){
			public void draw() {
				System.out.println("this is square");
			}
		};
		shape.draw();
		
	}
}
