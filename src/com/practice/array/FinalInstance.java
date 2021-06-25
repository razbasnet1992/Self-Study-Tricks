package com.practice.array;

public class FinalInstance {
	public final int x;
	public final String name;

	public FinalInstance(final int x, final String name) {
		this.x = x;
		this.name = name;
	}
	



	public int getX() {
		return x;
	}




	public String getName() {
		return name;
	}




	@Override
	public String toString() {
		return "FinalInstance [x=" + x + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		FinalInstance finalInstance = new FinalInstance(2, "raj");
		FinalInstance finalInstance2 = new FinalInstance(1, "djhf");
		
		System.out.println(finalInstance2);
		System.out.println(finalInstance);
		System.out.println(finalInstance.getName());
		System.out.println(finalInstance2.getName());
		
		

	}

}
