package com.practice.tricks;

	class Super {
	    public int index = 1;
	}

	public class App extends Super {
		//public int index;

	    public App(int index) {
	        this.index = index;
	    }

	    public static void main(String args[]) {
	        App myApp = new App(10);
	        System.out.println(myApp.index);
	       // for(int i=0;1;i++) {//boolean compile error
	        	
	        }
	    }
	


