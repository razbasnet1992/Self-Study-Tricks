package com.pratice.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogicCheck {

	public static void main(String[] args) {
		int x =111;
		String message = (x==111)?"large number":(x>9)?"greater than i":"not equal";
		System.out.println(message);
		
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format("01-01-2020")); //error
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(new Date()));
				

	}

}
