package com.practice.tricks;

import java.io.File;

public class ReadWrite {
	

	    public static void main(String args[]) {
	        File sys = new File("/java/system");
	        System.out.print(sys.canWrite());
	        System.out.print(" " + sys.canRead());
	        int i  = Integer.parseInt("raj122");
	    }
	}

