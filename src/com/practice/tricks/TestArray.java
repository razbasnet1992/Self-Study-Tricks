package com.practice.tricks;

public class TestArray {
	
	    public static void main(String args[]) {
	    	String name = "Rajendra";
	    	name.substring(0, 3);
	    	char c[] = new char[name.length()];
	    	int bits;
             //System.out.println(bits);
	        bits = -3 >> 1;
	        System.out.println("bits "+bits);
	        bits = bits >>> 2;
	        bits = bits << 1;
	        System.out.println(bits);
	    	//System.out.println(name.getChars(2, name.length(), c, 0));
	    	 String arg[] = { "1", "2" };
	        if (arg.length > 0)
	            System.out.println(arg.length);
	    }
	}


